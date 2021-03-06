package me.ykrank.s1next;

import android.content.res.Configuration;
import android.os.StrictMode;
import android.support.multidex.MultiDexApplication;
import android.support.v7.app.AppCompatDelegate;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import me.ykrank.s1next.data.db.DbModule;
import me.ykrank.s1next.data.pref.GeneralPreferencesManager;
import me.ykrank.s1next.data.pref.PrefModule;
import me.ykrank.s1next.util.BuglyUtils;
import me.ykrank.s1next.util.L;
import me.ykrank.s1next.util.LeaksUtil;
import me.ykrank.s1next.util.ProcessUtil;
import me.ykrank.s1next.util.ResourceUtil;
import me.ykrank.s1next.widget.AppActivityLifecycleCallbacks;
import me.ykrank.s1next.widget.track.DataTrackAgent;

public final class App extends MultiDexApplication {
    public static final String LOG_TAG = "S1NextLog";

    private static App sApp;

    private GeneralPreferencesManager mGeneralPreferencesManager;

    private AppComponent mAppComponent;

    private AppActivityLifecycleCallbacks mAppActivityLifecycleCallbacks;

    private RefWatcher refWatcher;

    public static App get() {
        return sApp;
    }

    public static AppComponent getAppComponent() {
        return sApp.mAppComponent;
    }

    public RefWatcher getRefWatcher() {
        return refWatcher;
    }

    public DataTrackAgent getTrackAgent() {
        return mAppComponent.getDataTrackAgent();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sApp = this;

        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }

        // enable StrictMode when debug
        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
                    .detectAll()
                    .penaltyLog()
                    .build());
        }
        refWatcher = LeaksUtil.install(this);
        L.init(this);
        BuglyUtils.init(this);

        mAppComponent = DaggerAppComponent.builder()
                .buildTypeModule(new BuildTypeModule(this))
                .appModule(new AppModule(this))
                .dbModule(new DbModule())
                .prefModule(new PrefModule())
                .build();
        mAppComponent.getDataTrackAgent().init();

        //如果不是主进程，不做多余的初始化
        if (!ProcessUtil.isMainProcess(this))
            return;
        mAppActivityLifecycleCallbacks = new AppActivityLifecycleCallbacks(this, mAppComponent.getNoticeCheckTask());
        registerActivityLifecycleCallbacks(mAppActivityLifecycleCallbacks);

        mGeneralPreferencesManager = mAppComponent.getGeneralPreferencesManager();

        //enable vector drawable
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        // set scaling factor for fonts
        ResourceUtil.setScaledDensity(this, mGeneralPreferencesManager.getFontScale());
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        //如果不是主进程，不做多余的初始化
        if (!ProcessUtil.isMainProcess(this))
            return;

        ResourceUtil.setScaledDensity(this, mGeneralPreferencesManager.getFontScale());
    }

    public boolean isAppVisible() {
        return mAppActivityLifecycleCallbacks.isAppVisible();
    }
}

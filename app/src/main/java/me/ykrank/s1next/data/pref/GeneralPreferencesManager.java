package me.ykrank.s1next.data.pref;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class GeneralPreferencesManager {

    private final GeneralPreferencesRepository mGeneralPreferencesProvider;

    /**
     * cache float value
     */
    private final Supplier<Float> mFontScaleSupplier = new Supplier<Float>() {

        @Override
        public Float get() {
            return Float.parseFloat(mGeneralPreferencesProvider.getFontSizeString());
        }
    };

    private volatile Supplier<Float> mFontScaleMemorized = Suppliers.memoize(mFontScaleSupplier);

    public GeneralPreferencesManager(GeneralPreferencesRepository generalPreferencesProvider) {
        this.mGeneralPreferencesProvider = generalPreferencesProvider;
    }

    /**
     * Used for invalidating the font scale preference if settings change.
     */
    public void invalidateFontScale() {
        mFontScaleMemorized = Suppliers.memoize(mFontScaleSupplier);
    }

    public float getFontScale() {
        return mFontScaleMemorized.get();
    }

    public boolean isSignatureEnabled() {
        return mGeneralPreferencesProvider.isSignatureEnabled();
    }

    /**
     * Used for invalidating the post selectable preference if settings change.
     */
    public void invalidatePostSelectable(boolean selectable) {
        mGeneralPreferencesProvider.setPostSelectable(selectable);
    }

    public boolean isPostSelectable() {
        return mGeneralPreferencesProvider.isPostSelectable();
    }

    public void invalidateQuickSideBarEnable(boolean enable) {
        mGeneralPreferencesProvider.setQuickSideBarEnable(enable);
    }

    public boolean isQuickSideBarEnable() {
        return mGeneralPreferencesProvider.isQuickSideBarEnable();
    }

    public void invalidateBaseUrl(String baseUrl) {
        mGeneralPreferencesProvider.setBaseUrl(baseUrl);
    }

    public String getBaseUrl() {
        return mGeneralPreferencesProvider.getBaseUrl();
    }

    public void invalidateAutoCheckBaseUrl(boolean autoCheck) {
        mGeneralPreferencesProvider.setAutoCheckBaseUrl(autoCheck);
    }

    public boolean isAutoCheckBaseUrl() {
        return mGeneralPreferencesProvider.isAutoCheckBaseUrl();
    }

    public void invalidateForceHostIp(String hostIp) {
        mGeneralPreferencesProvider.setForceHostIp(hostIp);
    }

    /**
     * Force use this ip, disable if null
     */
    public String getForceHostIp() {
        return mGeneralPreferencesProvider.getForceHostIp();
    }
}

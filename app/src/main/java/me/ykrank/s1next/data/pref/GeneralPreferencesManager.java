package me.ykrank.s1next.data.pref;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

public final class GeneralPreferencesManager {

    private final GeneralPreferencesRepository mGeneralPreferencesProvider;

    private final Supplier<Float> mFontScaleSupplier = new Supplier<Float>() {

        @Override
        public Float get() {
            return Float.parseFloat(mGeneralPreferencesProvider.getFontSizeString());
        }
    };
    private final Supplier<Boolean> mSignatureEnabledSupplier = new Supplier<Boolean>() {

        @Override
        public Boolean get() {
            return mGeneralPreferencesProvider.isSignatureEnabled();
        }
    };
    private final Supplier<Boolean> mPostSelectableSupplier = new Supplier<Boolean>() {

        @Override
        public Boolean get() {
            return mGeneralPreferencesProvider.isPostSelectable();
        }
    };

    private volatile Supplier<Float> mFontScaleMemorized = Suppliers.memoize(mFontScaleSupplier);
    private volatile Supplier<Boolean> mSignatureEnabledMemorized = Suppliers.memoize(mSignatureEnabledSupplier);
    private volatile Supplier<Boolean> mPostSelectableMemorized = Suppliers.memoize(mPostSelectableSupplier);

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

    /**
     * Used for invalidating the signature preference if settings change.
     */
    public void invalidateSignatureEnabled() {
        mSignatureEnabledMemorized = Suppliers.memoize(mSignatureEnabledSupplier);
    }

    public boolean isSignatureEnabled() {
        return mSignatureEnabledMemorized.get();
    }

    /**
     * Used for invalidating the post selectable preference if settings change.
     */
    public void invalidatePostSelectable(boolean selectable) {
        mGeneralPreferencesProvider.setPostSelectable(selectable);
        mPostSelectableMemorized = Suppliers.memoize(mPostSelectableSupplier);
    }

    public boolean isPostSelectable() {
        return mPostSelectableMemorized.get();
    }
}

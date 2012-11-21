package com.lukaszkaniowski.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.appbrain.AppBrain;
import com.google.ads.AdRequest;
import com.google.ads.AdSize;
import com.google.ads.AdView;
import com.tapfortap.TapForTap;

/**
 * @author lukasz.kaniowski@gmail.com
 * @since 22.08.2012
 */
public class AdsUtils {
    /**
     * Shows ads in adsContainer
     *
     * @param admobMediationId
     * @param activity
     * @param adsContainer
     * @param testDevices
     * @return
     */
    public static AdView showAds(String admobMediationId, Activity activity, ViewGroup adsContainer, String... testDevices) {
        AdView adView = new AdView(activity, AdSize.BANNER, admobMediationId);
        adsContainer.addView(adView);
        AdRequest request = new AdRequest();

        request.addTestDevice(AdRequest.TEST_EMULATOR);
        for (String testDevice : testDevices) {
            request.addTestDevice(testDevice);
        }

        adView.loadAd(request);
        return adView;
    }

    public static void initTapForTap(String tapForTapSdkKey,Activity activity) {
        TapForTap.initialize(activity,tapForTapSdkKey);
    }

    public static void initAppLift(Context context) {
        AppBrain.init(context);
    }

    public static void showInterstitial(Activity activity) {
        AppBrain.getAds().maybeShowInterstitial(activity);
    }
}

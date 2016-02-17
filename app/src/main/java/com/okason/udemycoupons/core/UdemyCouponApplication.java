package com.okason.udemycoupons.core;

import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.okason.udemycoupons.R;

/**
 * Created by Valentine on 1/15/2016.
 */
public class UdemyCouponApplication extends Application {
    private static Tracker mTracker;
    private static GoogleAnalytics analytics;

    synchronized public Tracker getDefaultTracker(){
        if (mTracker == null){
            GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
            mTracker = analytics.newTracker(R.xml.global_tracker);
            mTracker.enableExceptionReporting(true);
            mTracker.enableAutoActivityTracking(true);
        }
        return mTracker;
    }

    public static GoogleAnalytics getAnalytics(){
        return analytics;
    }

    public static Tracker getTracker(){
        return mTracker;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}

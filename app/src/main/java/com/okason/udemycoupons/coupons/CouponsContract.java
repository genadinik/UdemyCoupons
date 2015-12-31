package com.okason.udemycoupons.coupons;

import android.support.annotation.NonNull;

import com.okason.udemycoupons.data.Coupon;

import java.util.List;

/**
 * Created by Valentine on 12/31/2015.
 */
public interface CouponsContract {
    interface View{
        void setProgressIndicator(boolean active);
        void showCoupons(List<Coupon> coupons);
        void showAddCoupon();
        void showCouponDetailsUi(String couponId);
    }

    interface UserActionsListener{
        void loadCoupons(boolean forceUpdate);
        void addCoupon();
        void openCouponDetails(@NonNull Coupon requestedCoupon);
        void goToCourseWebPage(@NonNull String courseUrl);
        void showInterest(boolean interested, String reason);
    }
}

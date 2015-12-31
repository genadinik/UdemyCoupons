package com.okason.udemycoupons.data;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by Valentine on 12/31/2015.
 */
public interface CouponsRepository {
    interface LoadCouponsCallback{
        void onCouponsLoaded(List<Coupon> coupons);
    }

    interface GetCouponCallback{
        void onCouponLoaded(Coupon coupon);
    }

    void getCoupon(@NonNull LoadCouponsCallback callback);
    void getCoupon(@NonNull String couponId, @NonNull GetCouponCallback callback);
    void saveCoupon(@NonNull Coupon coupon);
    void refreshData();
}

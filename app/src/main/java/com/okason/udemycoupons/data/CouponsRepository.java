package com.okason.udemycoupons.data;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by Valentine on 12/31/2015.
 */
public interface CouponsRepository {


    List<Coupon> getCoupons();
    void getCoupon(@NonNull String couponId);
    void saveCoupon(@NonNull Coupon coupon);
    void refreshData();
}

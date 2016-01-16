package com.okason.udemycoupons.coupons;

import android.support.annotation.NonNull;

import com.okason.udemycoupons.data.Coupon;
import com.okason.udemycoupons.data.CouponsRepository;


/**
 * Created by Valentine on 12/31/2015.
 */
public class CouponsPresenter implements CouponsContract.UserActionsListener {

    private final CouponsRepository mCouponRepository;
    private final CouponsContract.View mCouponsView;


    public CouponsPresenter(
            @NonNull CouponsRepository mCouponRepository,
            @NonNull CouponsContract.View mCouponsView) {
        this.mCouponRepository = mCouponRepository;
        this.mCouponsView = mCouponsView;
    }

    @Override
    public void loadCoupons(boolean forceUpdate) {

    }

    @Override
    public void addCoupon() {

    }

    @Override
    public void openCouponDetails(@NonNull Coupon requestedCoupon) {

    }

    @Override
    public void goToCourseWebPage(@NonNull String courseUrl) {

    }

    @Override
    public void showInterest(boolean interested, String reason) {

    }
}

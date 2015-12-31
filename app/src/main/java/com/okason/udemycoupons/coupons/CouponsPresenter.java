package com.okason.udemycoupons.coupons;

import android.support.annotation.NonNull;

import com.okason.udemycoupons.data.CouponsRepository;


/**
 * Created by Valentine on 12/31/2015.
 */
public class CouponsPresenter {

    private final CouponsRepository mCouponRepository;
    private final CouponsContract.View mCouponsView;


    public CouponsPresenter(
            @NonNull CouponsRepository mCouponRepository,
            @NonNull CouponsContract.View mCouponsView) {
        this.mCouponRepository = mCouponRepository;
        this.mCouponsView = mCouponsView;
    }
}

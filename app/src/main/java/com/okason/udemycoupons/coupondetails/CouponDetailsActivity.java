package com.okason.udemycoupons.coupondetails;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.okason.udemycoupons.R;
import com.okason.udemycoupons.coupons.CouponsActivity;

public class CouponDetailsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupon_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (getIntent().getExtras() == null || !getIntent().getExtras().containsKey("URL")){
            startActivity(new Intent(CouponDetailsActivity.this, CouponsActivity.class));
        }else {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container,
                            CouponDetailFragment.newInstance
                                    (getIntent().getExtras()
                                            .getString("URL"))).commit();
        }
    }
}

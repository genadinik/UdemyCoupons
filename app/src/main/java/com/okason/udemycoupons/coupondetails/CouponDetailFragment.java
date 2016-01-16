package com.okason.udemycoupons.coupondetails;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.google.gson.Gson;
import com.okason.udemycoupons.R;
import com.okason.udemycoupons.data.Coupon;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class CouponDetailFragment extends Fragment {
    private String mCourseUrl;
    private Coupon mCoupon;
    private View layout;
    @Bind(R.id.webview) WebView webView;


    public CouponDetailFragment() {
        // Required empty public constructor
    }

    public static CouponDetailFragment newInstance(String url){
        CouponDetailFragment fragment = new CouponDetailFragment();

        if (url != ""){
            Bundle args = new Bundle();
            args.putString("URL", url);
            fragment.setArguments(args);
        }
        return fragment;

    }

    private void getUrl(){
        Bundle args = getArguments();
        if (args != null){
            if (args.containsKey("URL")){
                Gson gson = new Gson();
                String jsonCoupon = args.getString("URL");
                mCoupon = gson.fromJson(jsonCoupon, Coupon.class);
            }
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        layout = inflater.inflate(R.layout.fragment_coupon_detail, container, false);
        ButterKnife.bind(this, layout);
        getUrl();
        webView.loadUrl(mCoupon.getCourseUrl());
        CouponDetailsActivity parentActivity = (CouponDetailsActivity) getActivity();
        parentActivity.getSupportActionBar().setTitle(mCoupon.getTitle());
        return layout;
    }

}

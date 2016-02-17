package com.okason.udemycoupons.coupondetails;


import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.analytics.Tracker;
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
    private Tracker mTracker;
    boolean reported = false;


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

        CouponDetailsActivity parentActivity = (CouponDetailsActivity) getActivity();
        parentActivity.getSupportActionBar().setTitle(mCoupon.getTitle());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(false);

       // webView.setWebViewClient(new MyWebViewClient());
        webView.loadUrl(mCoupon.getCourseUrl());
        webView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:
                        if (!reported){
                            Snackbar.make(layout, mCoupon.getTitle(), Snackbar.LENGTH_SHORT);
                            reported = true;
                        }
                        break;

                }
                return false;
            }
        });

        return layout;
    }


    @Override
    public void onPause() {
        super.onPause();
        Log.i("Coupon", "Leaving");
    }


    private class MyWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            //track event
            Snackbar.make(layout, mCoupon.getTitle(), Snackbar.LENGTH_SHORT);

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            getActivity().startActivity(intent);
            return true;
        }

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            Snackbar.make(layout, mCoupon.getTitle(), Snackbar.LENGTH_SHORT);
        }
    }
}

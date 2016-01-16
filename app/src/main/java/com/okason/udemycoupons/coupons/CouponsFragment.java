package com.okason.udemycoupons.coupons;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.okason.udemycoupons.R;
import com.okason.udemycoupons.data.Category;
import com.okason.udemycoupons.data.Coupon;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CouponsFragment extends Fragment{

    private static final int REQUEST_ADD_COUPON = 1;
  //  private CouponsContract.UserActionsListener mActionListener;
    private CouponsAdapter mListAdapter;
    private  View mLayout;
    private List<Coupon> mCoupons = new ArrayList<Coupon>();


    public CouponsFragment() {
        // Required empty public constructor
    }

    public static CouponsFragment newInstance(String serializedCategories){
        CouponsFragment fragment = new CouponsFragment();

        if (serializedCategories != null && !serializedCategories.isEmpty()){
            Bundle args = new Bundle();
            args.putString("category", serializedCategories);
            fragment.setArguments(args);
        }

        return fragment;
    }

    private void getCategories(){
        Bundle args = getArguments();
        if (args != null && args.containsKey("category")){
            String jsonCategory = args.getString("category");
            Gson gson = new Gson();
            Category category = gson.fromJson(jsonCategory, Category.class);
            if (category != null){
                mCoupons = category.getCoupons();
            }
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getCategories();

    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        //if a coupon was successfully added, show snackbar
        if (REQUEST_ADD_COUPON == requestCode && Activity.RESULT_OK == resultCode){
            Snackbar.make(getView(), "Coupon saved", Snackbar.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setRetainInstance(true);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mLayout = inflater.inflate(R.layout.fragment_coupons, container, false);
        RecyclerView recyclerView = (RecyclerView)mLayout.findViewById(R.id.recycerview_coupon_list);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager;
        mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);


//        List<Coupon> coupons = new ArrayList<Coupon>();
//        CouponsRepository repository = new InMemoryCouponRepository();
//        coupons = repository.getCoupons();

        mListAdapter = new CouponsAdapter(mCoupons, getActivity());
        recyclerView.setAdapter(mListAdapter);



        return mLayout;
    }



}

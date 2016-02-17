package com.okason.udemycoupons.coupons;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.okason.udemycoupons.R;
import com.okason.udemycoupons.data.Coupon;
import com.squareup.picasso.Picasso;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Valentine on 1/5/2016.
 */
public class CouponsAdapter extends RecyclerView.Adapter<CouponsAdapter.ViewHolder>{

    private List<Coupon> mCoupons;
    private Context mContext;

    public CouponsAdapter(List<Coupon> coupons, Context context){
        mCoupons = coupons;
        mContext = context;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rowView = null;
        try {
            rowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_coupons_list, parent, false);
        } catch (Exception e) {
            Log.e("Adapter", e.getMessage() + ", " +  e.getCause());
        }
        ViewHolder viewHolder = new ViewHolder(rowView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if (mCoupons != null) {
            try {
                final Coupon coupon = mCoupons.get(position);
                Picasso.with(mContext)
                        .load(coupon.getImageUrl())
                        .fit()
                        .placeholder(R.drawable.default_image)
                        .into(holder.image);
                holder.couponTitle.setText(coupon.getTitle());
                holder.courseDescription.setText(coupon.getHeadline());
               // holder.coupon.setText(coupon.getCouponName());
                holder.salePrice.setText(formatCurrency(coupon.getPrice()));
               // holder.couponDuration.setText(formatCouponExpiration(coupon.getExpirationDate()));
                holder.buyButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse(coupon.getCourseUrl()));
                        mContext.startActivity(i);
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public int getItemCount() {
        if (mCoupons != null) {
            return mCoupons.size();
        } else {
            return 0;
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public ImageView image;
        public TextView coupon;
        public TextView couponTitle;
        public TextView salePrice;
        public TextView courseDescription;
        public TextView couponDuration;
        public TextView buyButton;

        public ViewHolder(View itemView) {
            super(itemView);
            image = (ImageView)itemView.findViewById(R.id.coupon_list_image);
            coupon = (TextView)itemView.findViewById(R.id.coupon_list_promo);
            couponTitle = (TextView)itemView.findViewById(R.id.coupon_list_title);
            salePrice = (TextView)itemView.findViewById(R.id.coupon_list_price);
            courseDescription = (TextView)itemView.findViewById(R.id.coupon_list_description);
            couponDuration = (TextView)itemView.findViewById(R.id.coupon_list_duration);
            buyButton = (TextView)itemView.findViewById(R.id.coupon_list_buy_button);
            coupon.setVisibility(View.GONE);
            couponDuration.setVisibility(View.GONE);

        }
    }

    private String formatCurrency(double amount){

        NumberFormat baseFormat = NumberFormat.getCurrencyInstance();
        String moneyString = baseFormat.format(amount);
        return moneyString;
    }

    private String formatCouponExpiration(String dateString){
        if (dateString != null || !dateString.isEmpty() ) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date convertDate = new Date();
            try {
                convertDate = dateFormat.parse(dateString);
                long diff = convertDate.getTime() - Calendar.getInstance().getTime().getTime();
                String daysDiff = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS) + " Days!";
                return  "Only " + daysDiff;
            } catch (ParseException e) {
                e.printStackTrace();
                return "Only this Week!";
            }
        } else {
            return "Only this Week!";
        }
    }
}

package com.okason.udemycoupons.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valentine on 1/13/2016.
 */
public class Category {
    private long id;
    private String name;
    private String cleanName;
    private List<Coupon> coupons;
    private String serializedCoupons;

    public Category(int id, String name){
        this.id = id;
        this.name = name;
        coupons = new ArrayList<Coupon>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCleanName() {
        return cleanName;
    }

    public void setCleanName(String cleanName) {
        this.cleanName = cleanName;
    }

    public List<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(List<Coupon> coupons) {
        this.coupons = coupons;
    }
}

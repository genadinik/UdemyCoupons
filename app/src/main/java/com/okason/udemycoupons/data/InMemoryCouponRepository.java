package com.okason.udemycoupons.data;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Valentine on 1/5/2016.
 */
public class InMemoryCouponRepository implements CouponsRepository {
    private List<Coupon> coupons = new ArrayList<Coupon>();
    List<Category> categories = new ArrayList<Category>();

    public InMemoryCouponRepository(){
        generateCoupons();
        getCategories();
    }

    @Override
    public List<Coupon> getCoupons() {

        return coupons;
    }


    @Override
    public void getCoupon(@NonNull String couponId) {

    }

    @Override
    public void saveCoupon(@NonNull Coupon coupon) {

    }

    @Override
    public void refreshData() {

    }



    public List<Category> getPopulatedCategories(){
        List<Category> categoriesWithCoupon = new ArrayList<>();


        for (Coupon coupon: coupons){
            long catId = coupon.getCategoryId();
            if (catId > 0 ){
                for (Category cat: categories){
                    if (cat.getId() == catId){
                        cat.getCoupons().add(coupon);
                    }
                }
            }
        }
        for (Category category: categories){
            if (category.getCoupons().size() > 0){
                categoriesWithCoupon.add(category);
            }
        }
        return categoriesWithCoupon;

    }


    private List<Category> getCategories(){
        Category category1 = new Category(1, "Academics");
        categories.add(category1);

        Category category2 = new Category(2, "Business");
        categories.add(category2);

        Category category3 = new Category(3, "Crafts-and-Hobbies");
        categories.add(category3);

        Category category4 = new Category(4, "Design");
        categories.add(category4);

        Category category5 = new Category(5, "Development");
        categories.add(category5);

        Category category6 = new Category(6, "Games");
        categories.add(category6);

        Category category7 = new Category(7, "Health-and-Fitness");
        categories.add(category7);

        Category category8 = new Category(8, "Humanities");
        categories.add(category8);

        Category category9 = new Category(9, "IT-and-Software");
        categories.add(category9);

        Category category10 = new Category(10, "Language");
        categories.add(category10);

        Category category11 = new Category(11, "Lifestyle");
        categories.add(category11);

        Category category12 = new Category(12, "Marketing");
        categories.add(category12);

        Category category13 = new Category(13, "Math-and-Science");
        categories.add(category13);

        Category category14 = new Category(14, "Music");
        categories.add(category14);

        Category category15 = new Category(15, "Office-Productivity");
        categories.add(category15);

        Category category16 = new Category(16, "Personal-Development");
        categories.add(category16);

        Category category17 = new Category(17, "Photography");
        categories.add(category17);

        Category category18 = new Category(18, "Social-Science");
        categories.add(category18);

        Category category19 = new Category(19, "Sports");
        categories.add(category19);

        Category category20 = new Category(20, "Teacher-Training");
        categories.add(category20);

        Category category21 = new Category(21, "Technology");
        categories.add(category21);

        Category category22 = new Category(22, "Test");
        categories.add(category22);

        Category category23 = new Category(23, "Test Prep");
        categories.add(category23);

        return categories;
    }

    private void generateCoupons() {

        Coupon coupon2 = new Coupon();
        coupon2.setTitle("Learn Android App Development & Promote Your App like a Pro");
        coupon2.setCouponName("discountapp");
        coupon2.setHeadline("Learn how to create a Productivity Android App and how to rank #1 in Play Store and get 1,000,000 downloads.");
        coupon2.setImageUrl("https://udemy-images.udemy.com/course/480x270/492556_da80_4.jpg");
        coupon2.setCourseUrl("https://www.udemy.com/android-app-development-in-3-days-1000000-downloads/?couponCode=discountapp");
        coupon2.setExpirationDate("01/31/2016");
        coupon2.setPrice(5.00);
        coupon2.setCategoryId(2);
        coupons.add(coupon2);



        Coupon coupon3 = new Coupon();
        coupon3.setTitle("How To Start A Business: Business Ideas To Success");
        coupon3.setCouponName("discountapp");
        coupon3.setHeadline("How to start a business: learn from 300,000 entrepreneurs & create YOUR successful business");
        coupon3.setImageUrl("https://udemy-images.udemy.com/course/480x270/176758_bdf3_3.jpg");
        coupon3.setCourseUrl("https://www.udemy.com/how-to-start-a-business-go-from-business-idea-to-a-business/?couponCode=discountapp");
        coupon3.setExpirationDate("None");
        coupon3.setPrice(5.00);
        coupon3.setCategoryId(2);
        coupons.add(coupon3);

        Coupon coupon4 = new Coupon();
        coupon4.setTitle("Marketing strategy to reach 1,000,000 people");
        coupon4.setCouponName("discountapp");
        coupon4.setHeadline("Marketing strategy: cutting edge, practical and effective marketing strategies to reach 1,000,00 people");
        coupon4.setImageUrl("https://udemy-images.udemy.com/course/480x270/184636_92a8_3.jpg");
        coupon4.setCourseUrl("https://www.udemy.com/marketing-plan-strategy-become-a-great-marketer/?couponCode=discountapp");
        coupon4.setExpirationDate("None");
        coupon4.setPrice(5.00);
        coupon4.setCategoryId(12);
        coupons.add(coupon4);

        Coupon coupon5 = new Coupon();
        coupon5.setTitle("Boxing, kickboxing & self defense: learn fighting");
        coupon5.setCouponName("discountapp");
        coupon5.setHeadline("Learn to fight with boxing, kickboxing, Muay Thai & self defense. Punches, kicks, & defense moves");
        coupon5.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon5.setCourseUrl("https://www.udemy.com/learn-to-fight-get-fit-boxing-kickboxing-self-defense/?couponCode=discountapp");
        coupon5.setExpirationDate("None");
        coupon5.setPrice(5.00);
        coupon5.setCategoryId(5);
        coupons.add(coupon5);

        Coupon coupon6 = new Coupon();
        coupon6.setTitle("Link-building for SEO");
        coupon6.setCouponName("discountapp");
        coupon6.setHeadline("Get amazing links by using publicity and other creative link-building strategies (sometimes written as linkbuilding)");
        coupon6.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon6.setCourseUrl("https://www.udemy.com/link-building-for-seo/?couponCode=discountapp");
        coupon6.setExpirationDate("None");
        coupon6.setPrice(5.00);
        coupon6.setCategoryId(12);
        coupons.add(coupon6);

        Coupon coupon7 = new Coupon();
        coupon7.setTitle("How to make significant money on Fiverr");
        coupon7.setCouponName("discountapp");
        coupon7.setHeadline("How to make enough money from Fiverr to make it your full time job, or even get rich from it.");
        coupon7.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon7.setCourseUrl("https://www.udemy.com/fiverr-how-to-get-rich-from-fiverr/?couponCode=discountapp");
        coupon7.setExpirationDate("None");
        coupon7.setPrice(5.00);
        coupon7.setCategoryId(2);
        coupons.add(coupon7);

        Coupon coupon8 = new Coupon();
        coupon8.setTitle("How to write a business plan");
        coupon8.setCouponName("discountapp");
        coupon8.setHeadline("Business plan course: Learn to write a great business plan, create a great business strategy & impress investors");
        coupon8.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon8.setCourseUrl("https://www.udemy.com/how-to-write-a-business-plan/?couponCode=discountapp");
        coupon8.setExpirationDate("None");
        coupon8.setPrice(5.00);
        coupon8.setCategoryId(2);
        coupons.add(coupon8);

        Coupon coupon9 = new Coupon();
        coupon9.setTitle("Marketing plan template: How to write a marketing plan");
        coupon9.setCouponName("discountapp");
        coupon9.setHeadline("With marketing plan template and example. Every marketing plan section explained so you can have a fantastic strategy");
        coupon9.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon9.setCourseUrl("https://www.udemy.com/how-to-write-a-marketing-plan/?couponCode=discountapp");
        coupon9.setExpirationDate("None");
        coupon9.setPrice(5.00);
        coupon9.setCategoryId(12);
        coupons.add(coupon9);

        Coupon coupon10 = new Coupon();
        coupon10.setTitle("Affiliate Marketing");
        coupon10.setCouponName("discountapp");
        coupon10.setHeadline("Best affiliate marketing training: strategies to make money with affiliate marketing passive income business for 2015");
        coupon10.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon10.setCourseUrl("https://www.udemy.com/make-money-with-affiliate-marketing-earn-passive-income/?couponCode=discountapp");
        coupon10.setExpirationDate("None");
        coupon10.setPrice(5.00);
        coupon10.setCategoryId(2);
        coupons.add(coupon10);

        Coupon coupon11 = new Coupon();
        coupon11.setTitle("YouTube success tips: How I got 1,000,000 views");
        coupon11.setCouponName("discountapp");
        coupon11.setHeadline("Learn the secrets and insight behind creating a successful YouTube channel and promote anything you want");
        coupon11.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon11.setCourseUrl("https://www.udemy.com/youtube-success-tips-how-to-get-views/?couponCode=discountapp");
        coupon11.setExpirationDate("None");
        coupon11.setPrice(5.00);
        coupon11.setCategoryId(12);
        coupons.add(coupon11);

        Coupon coupon12 = new Coupon();
        coupon12.setTitle("22 Ways To Make Money Online");
        coupon12.setCouponName("discountapp");
        coupon12.setHeadline("Learn to fight with boxing, kickboxing, Muay Thai & self defense. Punches, kicks, & defense moves");
        coupon12.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon12.setCourseUrl("https://www.udemy.com/how-to-make-money/?couponCode=discountapp");
        coupon12.setExpirationDate("None");
        coupon12.setPrice(5.00);
        coupon12.setCategoryId(2);
        coupons.add(coupon12);

        Coupon coupon13 = new Coupon();
        coupon13.setTitle("Facebook marketing 2016: 1000%+ engagement");
        coupon13.setCouponName("discountapp");
        coupon13.setHeadline("Facebook marketing: increase organic engagement like comments, like and sharing by as much as 1,000% with these tactics");
        coupon13.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon13.setCourseUrl("https://www.udemy.com/facebook-marketing-course/?couponCode=discountapp");
        coupon13.setExpirationDate("None");
        coupon13.setPrice(5.00);
        coupon13.setCategoryId(12);
        coupons.add(coupon13);

        Coupon coupon14 = new Coupon();
        coupon14.setTitle("Twitter marketing: 1000% engagement");
        coupon14.setCouponName("discountapp");
        coupon14.setHeadline("Twitter marketing: promote your business on Twitter, get more customers, retweets, and followers starting today!");
        coupon14.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon14.setCourseUrl("https://www.udemy.com/twitter-marketing-course/?couponCode=discountapp");
        coupon14.setExpirationDate("None");
        coupon14.setPrice(5.00);
        coupon14.setCategoryId(12);
        coupons.add(coupon14);

        Coupon coupon15 = new Coupon();
        coupon15.setTitle("How to sell more handmade, affiliate & digital products NOW!");
        coupon15.setCouponName("discountapp");
        coupon15.setHeadline("How to sell any product or service on Amazon, Etsy,  SEO, social media, many other sites. & improve sales conversion");
        coupon15.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon15.setCourseUrl("https://www.udemy.com/how-to-sell-any-product-generate-sales/?couponCode=discountapp");
        coupon15.setExpirationDate("None");
        coupon15.setPrice(5.00);
        coupon15.setCategoryId(2);
        coupons.add(coupon15);

        Coupon coupon16 = new Coupon();
        coupon16.setTitle("Publicity & Public Relations: Get Press Coverage Like A Pro");
        coupon16.setCouponName("discountapp");
        coupon16.setHeadline("Public Relations (PR): reach 100,000+ potential clients with fantastic strategies to get publicity & press coverage ASAP");
        coupon16.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon16.setCourseUrl("https://www.udemy.com/how-to-get-publicity-and-press-coverage-for-your-business/?couponCode=discountapp");
        coupon16.setExpirationDate("None");
        coupon16.setPrice(5.00);
        coupon16.setCategoryId(12);
        coupons.add(coupon16);

        Coupon coupon17 = new Coupon();
        coupon17.setTitle("How to sell on YouTube: 5 strategies to sell with video");
        coupon17.setCouponName("discountapp");
        coupon17.setHeadline("Learn 5 different video formats to increase sales via YouTube & drive leads to your product or business on YouTube ");
        coupon17.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon17.setCourseUrl("https://www.udemy.com/how-to-sell-with-video/?couponCode=discountapp");
        coupon17.setExpirationDate("None");
        coupon17.setPrice(5.00);
        coupon17.setCategoryId(2);
        coupons.add(coupon17);

        Coupon coupon18 = new Coupon();
        coupon18.setTitle("Startup & small business law: business registration & more");
        coupon18.setCouponName("discountapp");
        coupon18.setHeadline("Startup & small business law: business registration, intellectual property protection, online privacy & more");
        coupon18.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon18.setCourseUrl("https://www.udemy.com/startup-small-business-law-business-registration/?couponCode=discountapp");
        coupon18.setExpirationDate("None");
        coupon18.setPrice(5.00);
        coupon18.setCategoryId(2);
        coupons.add(coupon18);


        Coupon coupon19 = new Coupon();
        coupon19.setTitle("How to write your great book even if you are a bad writer");
        coupon19.setCouponName("discountapp");
        coupon19.setHeadline("How to writer your first great book with no writing or if you think you are a bad writer, and make money as an author");
        coupon19.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon19.setCourseUrl("https://www.udemy.com/how-to-write-your-great-book-even-if-you-are-a-bad-writer/?couponCode=discountapp");
        coupon19.setExpirationDate("None");
        coupon19.setPrice(5.00);
        coupon19.setCategoryId(2);
        coupons.add(coupon19);

        Coupon coupon20 = new Coupon();
        coupon20.setTitle("Real Estate Careers");
        coupon20.setCouponName("discountapp");
        coupon20.setHeadline("Real estate career course. Get real estate career advice from a successful real estate agent who sold over $10,000,000");
        coupon20.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon20.setCourseUrl("https://www.udemy.com/how-to-start-a-career-in-real-estate/?couponCode=discountapp");
        coupon20.setExpirationDate("None");
        coupon20.setPrice(5.00);
        coupon20.setCategoryId(2);
        coupons.add(coupon20);

        Coupon coupon21 = new Coupon();
        coupon21.setTitle("How to find your business niche");
        coupon21.setCouponName("discountapp");
        coupon21.setHeadline("Suggestions and guidance on how to find your business niche if you are struggling with starting your business");
        coupon21.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon21.setCourseUrl("https://www.udemy.com/how-to-find-your-business-niche/?couponCode=discountapp");
        coupon21.setExpirationDate("None");
        coupon21.setPrice(5.00);
        coupon21.setCategoryId(2);
        coupons.add(coupon21);

        Coupon coupon22 = new Coupon();
        coupon22.setTitle("Calisthenics: full body workout without the gym");
        coupon22.setCouponName("discountapp");
        coupon22.setHeadline("Learn how to do weight training with just the weight of your body from your home, office or a park, and without a gym.");
        coupon22.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon22.setCourseUrl("https://www.udemy.com/calisthenics-full-body-weight-training-and-body-building/?couponCode=discountapp");
        coupon22.setExpirationDate("None");
        coupon22.setPrice(5.00);
        coupon22.setCategoryId(19);
        coupons.add(coupon22);


        Coupon coupon23 = new Coupon();
        coupon23.setTitle("LinkedIn marketing: business lead generation to drive sales");
        coupon23.setCouponName("discountapp");
        coupon23.setHeadline("We will teach you LinkedIn marketing strategies for your business to drive targeted leads that convert to sales");
        coupon23.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon23.setCourseUrl("https://www.udemy.com/ultimate-secret-linkedin-strategies-for-networking-or-leads/?couponCode=discountapp");
        coupon23.setExpirationDate("None");
        coupon23.setPrice(5.00);
        coupon23.setCategoryId(12);
        coupons.add(coupon23);

        Coupon coupon24 = new Coupon();
        coupon24.setTitle("Philosophy of religion: spirituality and politics");
        coupon24.setCouponName("discountapp");
        coupon24.setHeadline("Philosophy of religion: spirituality and politics in religion (Buddhism, Islam, Christianity, Judaism, Hinduism, Taoism)");
        coupon24.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon24.setCourseUrl("https://www.udemy.com/philosophy-of-religion-spirituality/?couponCode=discountapp");
        coupon24.setExpirationDate("None");
        coupon24.setPrice(5.00);
        coupon24.setCategoryId(8);
        coupons.add(coupon24);



        Coupon coupon25 = new Coupon();
        coupon25.setTitle("How to Strike Up Conversations with Women and Enjoy Doing it");
        coupon25.setCouponName("discountapp");
        coupon25.setHeadline("Meet more women by learning to approach them more successfully");
        coupon25.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon25.setCourseUrl("https://www.udemy.com/how-to-successfully-approach-women-anywhere/?couponCode=discountapp");
        coupon25.setExpirationDate("None");
        coupon25.setPrice(5.00);
        coupon25.setCategoryId(11);
        coupons.add(coupon25);


    }
}

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

        Category category6 = new Category(6, "SEO");
        categories.add(category6);

        Category category7 = new Category(7, "Health-and-Fitness");
        categories.add(category7);

        Category category8 = new Category(8, "Humanities");
        categories.add(category8);

        Category category9 = new Category(9, "IT-and-Software");
        categories.add(category9);

        Category category10 = new Category(10, "Author Entrepreneur");
        categories.add(category10);

        Category category11 = new Category(11, "Lifestyle");
        categories.add(category11);

        Category category12 = new Category(12, "Marketing");
        categories.add(category12);

        Category category13 = new Category(13, "Social Media");
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

        Category category20 = new Category(20, "Publicity");
        categories.add(category20);

        Category category21 = new Category(21, "Technology");
        categories.add(category21);

        Category category22 = new Category(22, "Offline Marketing");
        categories.add(category22);

        Category category23 = new Category(23, "Make Money");
        categories.add(category23);

        Category category24 = new Category(24, "More courses");
        categories.add(category24);

        Category category25 = new Category(25, "FREE");
        categories.add(category25);

        return categories;
    }

    private void generateCoupons() {

        Coupon coupon2 = new Coupon();
        coupon2.setTitle("Learn Android App Development & Promote Your App like a Pro");
        coupon2.setCouponName("ten_discountapp");
        coupon2.setHeadline("Learn how to create a Productivity Android App and how to rank #1 in Play Store and get 1,000,000 downloads.");
        coupon2.setImageUrl("https://udemy-images.udemy.com/course/480x270/492556_da80_4.jpg");
        coupon2.setCourseUrl("https://www.udemy.com/android-app-development-in-3-days-1000000-downloads/?couponCode=ten_discountapp");
        coupon2.setExpirationDate("01/31/2016");
        coupon2.setPrice(10.00);
        coupon2.setCategoryId(5);
        coupons.add(coupon2);



        Coupon coupon3 = new Coupon();
        coupon3.setTitle("How To Start A Business: Business Ideas To Success");
        coupon3.setCouponName("ten_discountapp");
        coupon3.setHeadline("How to start a business: learn from 300,000 entrepreneurs & create YOUR successful business");
        coupon3.setImageUrl("https://udemy-images.udemy.com/course/480x270/176758_bdf3_3.jpg");
        coupon3.setCourseUrl("https://www.udemy.com/how-to-start-a-business-go-from-business-idea-to-a-business/?couponCode=ten_discountapp");
        coupon3.setExpirationDate("None");
        coupon3.setPrice(10.00);
        coupon3.setCategoryId(2);
        coupons.add(coupon3);

        Coupon coupon4 = new Coupon();
        coupon4.setTitle("Marketing strategy to reach 1,000,000 people");
        coupon4.setCouponName("ten_discountapp");
        coupon4.setHeadline("Marketing strategy: cutting edge, practical and effective marketing strategies to reach 1,000,00 people");
        coupon4.setImageUrl("https://udemy-images.udemy.com/course/480x270/184636_92a8_3.jpg");
        coupon4.setCourseUrl("https://www.udemy.com/marketing-plan-strategy-become-a-great-marketer/?couponCode=ten_discountapp");
        coupon4.setExpirationDate("None");
        coupon4.setPrice(10.00);
        coupon4.setCategoryId(12);
        coupons.add(coupon4);

        Coupon coupon5 = new Coupon();
        coupon5.setTitle("Boxing, kickboxing & self defense: learn fighting");
        coupon5.setCouponName("ten_discountapp");
        coupon5.setHeadline("Learn to fight with boxing, kickboxing, Muay Thai & self defense. Punches, kicks, & defense moves");
        coupon5.setImageUrl("https://udemy-images.udemy.com/course/480x270/375288_7faa_3.jpg");
        coupon5.setCourseUrl("https://www.udemy.com/learn-to-fight-get-fit-boxing-kickboxing-self-defense/?couponCode=ten_discountapp");
        coupon5.setExpirationDate("None");
        coupon5.setPrice(10.00);
        coupon5.setCategoryId(19);
        coupons.add(coupon5);

        Coupon coupon6 = new Coupon();
        coupon6.setTitle("Link-building for SEO");
        coupon6.setCouponName("ten_discountapp");
        coupon6.setHeadline("Get amazing links by using publicity and other creative link-building strategies (sometimes written as linkbuilding)");
        coupon6.setImageUrl("https://udemy-images.udemy.com/course/480x270/601864_f3f3_2.jpg");
        coupon6.setCourseUrl("https://www.udemy.com/link-building-for-seo/?couponCode=ten_discountapp");
        coupon6.setExpirationDate("None");
        coupon6.setPrice(10.00);
        coupon6.setCategoryId(6);
        coupons.add(coupon6);

        Coupon coupon7 = new Coupon();
        coupon7.setTitle("How to make significant money on Fiverr");
        coupon7.setCouponName("ten_discountapp");
        coupon7.setHeadline("How to make enough money from Fiverr to make it your full time job, or even get rich from it.");
        coupon7.setImageUrl("https://udemy-images.udemy.com/course/750x422/516460_2178_3.jpg");
        coupon7.setCourseUrl("https://www.udemy.com/fiverr-how-to-get-rich-from-fiverr/?couponCode=ten_discountapp");
        coupon7.setExpirationDate("None");
        coupon7.setPrice(10.00);
        coupon7.setCategoryId(23);
        coupons.add(coupon7);

        Coupon coupon8 = new Coupon();
        coupon8.setTitle("How to write a business plan");
        coupon8.setCouponName("ten_discountapp");
        coupon8.setHeadline("Business plan course: Learn to write a great business plan, create a great business strategy & impress investors");
        coupon8.setImageUrl("https://udemy-images.udemy.com/course/750x422/179174_fe95_3.jpg");
        coupon8.setCourseUrl("https://www.udemy.com/how-to-write-a-business-plan/?couponCode=ten_discountapp");
        coupon8.setExpirationDate("None");
        coupon8.setPrice(10.00);
        coupon8.setCategoryId(10);
        coupons.add(coupon8);

        Coupon coupon9 = new Coupon();
        coupon9.setTitle("Marketing plan template: How to write a marketing plan");
        coupon9.setCouponName("ten_discountapp");
        coupon9.setHeadline("With marketing plan template and example. Every marketing plan section explained so you can have a fantastic strategy");
        coupon9.setImageUrl("https://udemy-images.udemy.com/course/750x422/581436_6a0c_2.jpg");
        coupon9.setCourseUrl("https://www.udemy.com/how-to-write-a-marketing-plan/?couponCode=ten_discountapp");
        coupon9.setExpirationDate("None");
        coupon9.setPrice(10.00);
        coupon9.setCategoryId(12);
        coupons.add(coupon9);

        Coupon coupon10 = new Coupon();
        coupon10.setTitle("Affiliate Marketing");
        coupon10.setCouponName("ten_discountapp");
        coupon10.setHeadline("Best affiliate marketing training: strategies to make money with affiliate marketing passive income business for 2015");
        coupon10.setImageUrl("https://udemy-images.udemy.com/course/750x422/187248_731a_3.jpg");
        coupon10.setCourseUrl("https://www.udemy.com/make-money-with-affiliate-marketing-earn-passive-income/?couponCode=ten_discountapp");
        coupon10.setExpirationDate("None");
        coupon10.setPrice(10.00);
        coupon10.setCategoryId(23);
        coupons.add(coupon10);

        Coupon coupon11 = new Coupon();
        coupon11.setTitle("YouTube success tips: How I got 1,000,000 views");
        coupon11.setCouponName("ten_discountapp");
        coupon11.setHeadline("Learn the secrets and insight behind creating a successful YouTube channel and promote anything you want");
        coupon11.setImageUrl("https://udemy-images.udemy.com/course/750x422/690694_f5f5_2.jpg");
        coupon11.setCourseUrl("https://www.udemy.com/youtube-success-tips-how-to-get-views/?couponCode=ten_discountapp");
        coupon11.setExpirationDate("None");
        coupon11.setPrice(10.00);
        coupon11.setCategoryId(13);
        coupons.add(coupon11);

        Coupon coupon12 = new Coupon();
        coupon12.setTitle("22 Ways To Make Money Online");
        coupon12.setCouponName("ten_discountapp");
        coupon12.setHeadline("Learn to fight with boxing, kickboxing, Muay Thai & self defense. Punches, kicks, & defense moves");
        coupon12.setImageUrl("https://udemy-images.udemy.com/course/750x422/238728_81fb_3.jpg");
        coupon12.setCourseUrl("https://www.udemy.com/how-to-make-money/?couponCode=ten_discountapp");
        coupon12.setExpirationDate("None");
        coupon12.setPrice(10.00);
        coupon12.setCategoryId(23);
        coupons.add(coupon12);

        Coupon coupon13 = new Coupon();
        coupon13.setTitle("Facebook marketing 2016: 1000%+ engagement");
        coupon13.setCouponName("ten_discountapp");
        coupon13.setHeadline("Facebook marketing: increase organic engagement like comments, like and sharing by as much as 1,000% with these tactics");
        coupon13.setImageUrl("https://udemy-images.udemy.com/course/750x422/242084_b4fd_3.jpg");
        coupon13.setCourseUrl("https://www.udemy.com/facebook-marketing-course/?couponCode=ten_discountapp");
        coupon13.setExpirationDate("None");
        coupon13.setPrice(10.00);
        coupon13.setCategoryId(13);
        coupons.add(coupon13);

        Coupon coupon14 = new Coupon();
        coupon14.setTitle("Twitter marketing: 1000% engagement");
        coupon14.setCouponName("ten_discountapp");
        coupon14.setHeadline("Twitter marketing: promote your business on Twitter, get more customers, retweets, and followers starting today!");
        coupon14.setImageUrl("https://udemy-images.udemy.com/course/750x422/246450_8ab2_3.jpg");
        coupon14.setCourseUrl("https://www.udemy.com/twitter-marketing-course/?couponCode=ten_discountapp");
        coupon14.setExpirationDate("None");
        coupon14.setPrice(10.00);
        coupon14.setCategoryId(13);
        coupons.add(coupon14);

        Coupon coupon15 = new Coupon();
        coupon15.setTitle("How to sell more handmade, affiliate & digital products NOW!");
        coupon15.setCouponName("ten_discountapp");
        coupon15.setHeadline("How to sell any product or service on Amazon, Etsy,  SEO, social media, many other sites. & improve sales conversion");
        coupon15.setImageUrl("https://udemy-images.udemy.com/course/750x422/368816_b594_2.jpg");
        coupon15.setCourseUrl("https://www.udemy.com/how-to-sell-any-product-generate-sales/?couponCode=ten_discountapp");
        coupon15.setExpirationDate("None");
        coupon15.setPrice(10.00);
        coupon15.setCategoryId(23);
        coupons.add(coupon15);

        Coupon coupon16 = new Coupon();
        coupon16.setTitle("Publicity & Public Relations: Get Press Coverage Like A Pro");
        coupon16.setCouponName("ten_discountapp");
        coupon16.setHeadline("Public Relations (PR): reach 100,000+ potential clients with fantastic strategies to get publicity & press coverage ASAP");
        coupon16.setImageUrl("https://udemy-images.udemy.com/course/750x422/208456_3337_3.jpg");
        coupon16.setCourseUrl("https://www.udemy.com/how-to-get-publicity-and-press-coverage-for-your-business/?couponCode=ten_discountapp");
        coupon16.setExpirationDate("None");
        coupon16.setPrice(10.00);
        coupon16.setCategoryId(20);
        coupons.add(coupon16);

        Coupon coupon17 = new Coupon();
        coupon17.setTitle("How to sell on YouTube: 5 strategies to sell with video");
        coupon17.setCouponName("ten_discountapp");
        coupon17.setHeadline("Learn 5 different video formats to increase sales via YouTube & drive leads to your product or business on YouTube ");
        coupon17.setImageUrl("https://udemy-images.udemy.com/course/480x270/585502_76c9_4.jpg");
        coupon17.setCourseUrl("https://www.udemy.com/how-to-sell-with-video/?couponCode=ten_discountapp");
        coupon17.setExpirationDate("None");
        coupon17.setPrice(10.00);
        coupon17.setCategoryId(13);
        coupons.add(coupon17);

        Coupon coupon18 = new Coupon();
        coupon18.setTitle("Startup & small business law: business registration & more");
        coupon18.setCouponName("ten_discountapp");
        coupon18.setHeadline("Startup & small business law: business registration, intellectual property protection, online privacy & more");
        coupon18.setImageUrl("https://udemy-images.udemy.com/course/480x270/478580_89e6_2.jpg");
        coupon18.setCourseUrl("https://www.udemy.com/startup-small-business-law-business-registration/?couponCode=ten_discountapp");
        coupon18.setExpirationDate("None");
        coupon18.setPrice(10.00);
        coupon18.setCategoryId(2);
        coupons.add(coupon18);


        Coupon coupon19 = new Coupon();
        coupon19.setTitle("How to write your great book even if you are a bad writer");
        coupon19.setCouponName("ten_discountapp");
        coupon19.setHeadline("How to writer your first great book with no writing or if you think you are a bad writer, and make money as an author");
        coupon19.setImageUrl("https://udemy-images.udemy.com/course/750x422/704140_7d19_2.jpg");
        coupon19.setCourseUrl("https://www.udemy.com/how-to-write-your-great-book-even-if-you-are-a-bad-writer/?couponCode=ten_discountapp");
        coupon19.setExpirationDate("None");
        coupon19.setPrice(10.00);
        coupon19.setCategoryId(23);
        coupons.add(coupon19);

        Coupon coupon20 = new Coupon();
        coupon20.setTitle("Real Estate Careers");
        coupon20.setCouponName("ten_discountapp");
        coupon20.setHeadline("Real estate career course. Get real estate career advice from a successful real estate agent who sold over $10,000,000");
        coupon20.setImageUrl("https://udemy-images.udemy.com/course/750x422/207970_2dfd_2.jpg");
        coupon20.setCourseUrl("https://www.udemy.com/how-to-start-a-career-in-real-estate/?couponCode=ten_discountapp");
        coupon20.setExpirationDate("None");
        coupon20.setPrice(10.00);
        coupon20.setCategoryId(2);
        coupons.add(coupon20);

        Coupon coupon21 = new Coupon();
        coupon21.setTitle("How to find your business niche");
        coupon21.setCouponName("ten_discountapp");
        coupon21.setHeadline("Suggestions and guidance on how to find your business niche if you are struggling with starting your business");
        coupon21.setImageUrl("https://udemy-images.udemy.com/course/750x422/477266_9395.jpg");
        coupon21.setCourseUrl("https://www.udemy.com/how-to-find-your-business-niche/?couponCode=ten_discountapp");
        coupon21.setExpirationDate("None");
        coupon21.setPrice(10.00);
        coupon21.setCategoryId(2);
        coupons.add(coupon21);

        Coupon coupon22 = new Coupon();
        coupon22.setTitle("Calisthenics: full body workout without the gym");
        coupon22.setCouponName("ten_discountapp");
        coupon22.setHeadline("Learn how to do weight training with just the weight of your body from your home, office or a park, and without a gym.");
        coupon22.setImageUrl("https://udemy-images.udemy.com/course/480x270/399104_4dc9.jpg");
        coupon22.setCourseUrl("https://www.udemy.com/calisthenics-full-body-weight-training-and-body-building/?couponCode=ten_discountapp");
        coupon22.setExpirationDate("None");
        coupon22.setPrice(10.00);
        coupon22.setCategoryId(19);
        coupons.add(coupon22);


        Coupon coupon23 = new Coupon();
        coupon23.setTitle("LinkedIn marketing: business lead generation to drive sales");
        coupon23.setCouponName("ten_discountapp");
        coupon23.setHeadline("We will teach you LinkedIn marketing strategies for your business to drive targeted leads that convert to sales");
        coupon23.setImageUrl("https://udemy-images.udemy.com/course/750x422/431986_9db7_3.jpg");
        coupon23.setCourseUrl("https://www.udemy.com/ultimate-secret-linkedin-strategies-for-networking-or-leads/?couponCode=ten_discountapp");
        coupon23.setExpirationDate("None");
        coupon23.setPrice(10.00);
        coupon23.setCategoryId(13);
        coupons.add(coupon23);

        Coupon coupon24 = new Coupon();
        coupon24.setTitle("Philosophy of religion: spirituality and politics");
        coupon24.setCouponName("ten_discountapp");
        coupon24.setHeadline("Philosophy of religion: spirituality and politics in religion (Buddhism, Islam, Christianity, Judaism, Hinduism, Taoism)");
        coupon24.setImageUrl("https://udemy-images.udemy.com/course/750x422/424998_bd9c.jpg");
        coupon24.setCourseUrl("https://www.udemy.com/philosophy-of-religion-spirituality/?couponCode=ten_discountapp");
        coupon24.setExpirationDate("None");
        coupon24.setPrice(10.00);
        coupon24.setCategoryId(8);
        coupons.add(coupon24);


        // DATING

        Coupon coupon25 = new Coupon();
        coupon25.setTitle("How to strike up conversations with women and enjoy doing it");
        coupon25.setCouponName("ten_discountapp");
        coupon25.setHeadline("Meet more women by learning to approach them more successfully");
        coupon25.setImageUrl("https://udemy-images.udemy.com/course/750x422/656722_b804_3.jpg");
        coupon25.setCourseUrl("https://www.udemy.com/how-to-successfully-approach-women-anywhere/?couponCode=ten_discountapp");
        coupon25.setExpirationDate("None");
        coupon25.setPrice(10.00);
        coupon25.setCategoryId(11);
        coupons.add(coupon25);

        Coupon coupon32 = new Coupon();
        coupon32.setTitle("Body language for dating");
        coupon32.setCouponName("ten_discountapp");
        coupon32.setHeadline("Body language strategies to use on your dates");
        coupon32.setImageUrl("https://udemy-images.udemy.com/course/480x270/657108_5816_3.jpg");
        coupon32.setCourseUrl("https://www.udemy.com/non-verbal-communication-for-dating/?couponCode=ten_discountapp");
        coupon32.setExpirationDate("None");
        coupon32.setPrice(10.00);
        coupon32.setCategoryId(11);
        coupons.add(coupon32);

        Coupon coupon33 = new Coupon();
        coupon33.setTitle("Unlock your charisma for dating");
        coupon33.setCouponName("ten_discountapp");
        coupon33.setHeadline("Master confidence and appear charismatic");
        coupon33.setImageUrl("https://udemy-images.udemy.com/course/480x270/656710_064a.jpg");
        coupon33.setCourseUrl("https://www.udemy.com/dating-confidence-for-men/?couponCode=ten_discountapp");
        coupon33.setExpirationDate("None");
        coupon33.setPrice(10.00);
        coupon33.setCategoryId(11);
        coupons.add(coupon33);

        Coupon coupon34 = new Coupon();
        coupon34.setTitle("Men: what to do on your first date");
        coupon34.setCouponName("ten_discountapp");
        coupon34.setHeadline("Learn how to have successful first dates");
        coupon34.setImageUrl("https://udemy-images.udemy.com/course/480x270/656414_4220_4.jpg");
        coupon34.setCourseUrl("https://www.udemy.com/for-men-what-to-do-on-a-first-date-and-have-dating-success/?couponCode=ten_discountapp");
        coupon34.setExpirationDate("None");
        coupon34.setPrice(10.00);
        coupon34.setCategoryId(11);
        coupons.add(coupon34);

        Coupon coupon35 = new Coupon();
        coupon35.setTitle("Men: what to do on your second date");
        coupon35.setCouponName("ten_discountapp");
        coupon35.setHeadline("Learn how to have successful second dates");
        coupon35.setImageUrl("https://udemy-images.udemy.com/course/480x270/656506_fe77_4.jpg");
        coupon35.setCourseUrl("https://www.udemy.com/men-what-to-do-on-a-second-date/?couponCode=ten_discountapp");
        coupon35.setExpirationDate("None");
        coupon35.setPrice(10.00);
        coupon35.setCategoryId(11);
        coupons.add(coupon35);

        Coupon coupon36 = new Coupon();
        coupon36.setTitle("Dating image for men");
        coupon36.setCouponName("ten_discountapp");
        coupon36.setHeadline("Learn how to come across as your coolest and best self");
        coupon36.setImageUrl("https://udemy-images.udemy.com/course/480x270/655344_0aa4_3.jpg");
        coupon36.setCourseUrl("https://www.udemy.com/men-improve-your-image-style-for-dating-to-wow-women/?couponCode=ten_discountapp");
        coupon36.setExpirationDate("None");
        coupon36.setPrice(10.00);
        coupon36.setCategoryId(11);
        coupons.add(coupon36);

        // END OF DATING

        Coupon coupon26 = new Coupon();
        coupon26.setTitle("Build more engaging consumer products");
        coupon26.setCouponName("ten_discountapp");
        coupon26.setHeadline("How to find your voice that resonates with your customers");
        coupon26.setImageUrl("https://udemy-images.udemy.com/course/480x270/704144_bb16_2.jpg");
        coupon26.setCourseUrl("https://www.udemy.com/how-to-find-your-voice-the-resonates-with-your-customers/?couponCode=ten_discountapp");
        coupon26.setExpirationDate("None");
        coupon26.setPrice(10.00);
        coupon26.setCategoryId(4);
        coupons.add(coupon26);

        Coupon coupon27 = new Coupon();
        coupon27.setTitle("How to make money on clarity");
        coupon27.setCouponName("ten_discountapp");
        coupon27.setHeadline("How to make significant money on claity");
        coupon27.setImageUrl("https://udemy-images.udemy.com/course/480x270/738286_f7b5.jpg");
        coupon27.setCourseUrl("https://www.udemy.com/how-to-make-significant-money-freelancing-on-clarity/?couponCode=ten_discountapp");
        coupon27.setExpirationDate("None");
        coupon27.setPrice(10.00);
        coupon27.setCategoryId(23);
        coupons.add(coupon27);

        Coupon coupon28 = new Coupon();
        coupon28.setTitle("How to make thousands of percent more from customers");
        coupon28.setCouponName("ten_discountapp");
        coupon28.setHeadline("Increase the revenue you get from current customers");
        coupon28.setImageUrl("https://udemy-images.udemy.com/course/480x270/704138_6c4e_2.jpg");
        coupon28.setCourseUrl("https://www.udemy.com/how-to-generate-up-to-1000-more-revenue-from-your-customers/?couponCode=ten_discountapp");
        coupon28.setExpirationDate("None");
        coupon28.setPrice(10.00);
        coupon28.setCategoryId(23);
        coupons.add(coupon28);

        Coupon coupon29 = new Coupon();
        coupon29.setTitle("Flier marketing");
        coupon29.setCouponName("ten_discountapp");
        coupon29.setHeadline("How to promote your business with flyers");
        coupon29.setImageUrl("https://udemy-images.udemy.com/course/480x270/676800_0efb.jpg");
        coupon29.setCourseUrl("https://www.udemy.com/flyers-marketing-design-the-perfect-flier-and-get-clients/?couponCode=ten_discountapp");
        coupon29.setExpirationDate("None");
        coupon29.setPrice(10.00);
        coupon29.setCategoryId(22);
        coupons.add(coupon29);

        Coupon coupon30 = new Coupon();
        coupon30.setTitle("Business card marketing");
        coupon30.setCouponName("ten_discountapp");
        coupon30.setHeadline("How to promote your business with business cards");
        coupon30.setImageUrl("https://udemy-images.udemy.com/course/480x270/676798_d062_2.jpg");
        coupon30.setCourseUrl("https://www.udemy.com/business-card-marketing-business-networking/?couponCode=ten_discountapp");
        coupon30.setExpirationDate("None");
        coupon30.setPrice(10.00);
        coupon30.setCategoryId(22);
        coupons.add(coupon30);

        Coupon coupon31 = new Coupon();
        coupon31.setTitle("Napoleon Hill: 13 keys to success from Think and Grow Rich");
        coupon31.setCouponName("ten_discountapp");
        coupon31.setHeadline("Napoleon Hill: 13 keys to success from Think and Grow Rich");
        coupon31.setImageUrl("https://udemy-images.udemy.com/course/480x270/738298_3085.jpg");
        coupon31.setCourseUrl("https://www.udemy.com/napoleon-hills-keys-to-success-from-think-and-grow-rich/?couponCode=ten_discountapp");
        coupon31.setExpirationDate("None");
        coupon31.setPrice(10.00);
        coupon31.setCategoryId(16);
        coupons.add(coupon31);

        Coupon coupon37 = new Coupon();
        coupon37.setTitle("How to do a pull-up");
        coupon37.setCouponName("ten_discountapp");
        coupon37.setHeadline("Work up to one pull-up and then do many");
        coupon37.setImageUrl("https://udemy-images.udemy.com/course/480x270/652250_02bf_2.jpg");
        coupon37.setCourseUrl("https://www.udemy.com/how-to-do-a-pull-up-or-work-up-to-a-pull-up-and-do-many/?couponCode=ten_discountapp");
        coupon37.setExpirationDate("None");
        coupon37.setPrice(10.00);
        coupon37.setCategoryId(19);
        coupons.add(coupon37);

        Coupon coupon38 = new Coupon();
        coupon38.setTitle("How to get publicity from radio and podcasts");
        coupon38.setCouponName("ten_discountapp");
        coupon38.setHeadline("Learn my strategies that got me 50+ radio and podcast interviews to promote my business in one year");
        coupon38.setImageUrl("https://udemy-images.udemy.com/course/480x270/628008_7d84_2.jpg");
        coupon38.setCourseUrl("https://www.udemy.com/how-i-got-50-podcast-appearances-using-radioguestlist/?couponCode=ten_discountapp");
        coupon38.setExpirationDate("None");
        coupon38.setPrice(10.00);
        coupon38.setCategoryId(20);
        coupons.add(coupon38);

        Coupon coupon39 = new Coupon();
        coupon39.setTitle("Selling on eBay");
        coupon39.setCouponName("ten_discountapp");
        coupon39.setHeadline("Selling on eBay: Make Money Online Dropshipping Products");
        coupon39.setImageUrl("https://udemy-images.udemy.com/course/480x270/127438_37aa_21.jpg");
        coupon39.setCourseUrl("https://www.udemy.com/how-to-make-money-by-spending-no-money-upfront/?couponCode=ten_discountapp");
        coupon39.setExpirationDate("None");
        coupon39.setPrice(10.00);
        coupon39.setCategoryId(24);
        coupons.add(coupon39);

        Coupon coupon40 = new Coupon();
        coupon40.setTitle("Webinar Success");
        coupon40.setCouponName("SuperStar14");
        coupon40.setHeadline("Webinar Success: Broadcast Webinars Like A Pro");
        coupon40.setImageUrl("https://udemy-images.udemy.com/course/480x270/480058_4dc3_3.jpg");
        coupon40.setCourseUrl("https://www.udemy.com/webinar-marketing/?couponCode=SuperStar14");
        coupon40.setExpirationDate("None");
        coupon40.setPrice(10.00);
        coupon40.setCategoryId(20);
        coupons.add(coupon40);

        Coupon coupon41 = new Coupon();
        coupon41.setTitle("Advanced Twitter Marketing");
        coupon41.setCouponName("ten_discountapp");
        coupon41.setHeadline("Use Twitter automation tools to grow followers and engagement");
        coupon41.setImageUrl("https://udemy-images.udemy.com/course/480x270/628006_85c8_2.jpg");
        coupon41.setCourseUrl("https://www.udemy.com/how-to-get-many-new-twitter-followers/?couponCode=ten_discountapp");
        coupon41.setExpirationDate("None");
        coupon41.setPrice(10.00);
        coupon41.setCategoryId(13);
        coupons.add(coupon41);

        Coupon coupon42 = new Coupon();
        coupon42.setTitle("1-hour Yoga class");
        coupon42.setCouponName("ten_discountapp");
        coupon42.setHeadline("1-hour Yoga class for beginners just like you would have at the gym");
        coupon42.setImageUrl("https://udemy-images.udemy.com/course/480x270/538210_9b57.jpg");
        coupon42.setCourseUrl("https://www.udemy.com/yoga-class/?couponCode=ten_discountapp");
        coupon42.setExpirationDate("None");
        coupon42.setPrice(10.00);
        coupon42.setCategoryId(19);
        coupons.add(coupon42);

//        Coupon coupon43 = new Coupon();
//        coupon43.setTitle("Problemio business apps to help your business");
//        coupon43.setCouponName("ten_discountapp");
//        coupon43.setHeadline("How to use the problemio business apps to help your business");
//        coupon43.setImageUrl("https://udemy-images.udemy.com/course/480x270/516462_16c2.jpg");
//        coupon43.setCourseUrl("https://www.udemy.com/get-business-help-with-problemio-entrepreneur-apps/?couponCode=ten_discountapp");
//        coupon43.setExpirationDate("None");
//        coupon43.setPrice(10.00);
//        coupon43.setCategoryId(19);
//        coupons.add(coupon43);


        Coupon coupon44 = new Coupon();
        coupon44.setTitle("Become a bestselling author on Amazon");
        coupon44.setCouponName("ten_discountapp");
        coupon44.setHeadline("Become a bestselling author on Amazon");
        coupon44.setImageUrl("https://udemy-images.udemy.com/course/480x270/496456_b94f_2.jpg");
        coupon44.setCourseUrl("https://www.udemy.com/how-to-become-an-amazon-best-seller/?couponCode=ten_discountapp");
        coupon44.setExpirationDate("None");
        coupon44.setPrice(10.00);
        coupon44.setCategoryId(10);
        coupons.add(coupon44);




        //

        Coupon coupon45 = new Coupon();
        coupon45.setTitle("Udemy Course Creation w/Camtasia");
        coupon45.setCouponName("Camtasia+Alex+Genadinik+Mobile+App");
        coupon45.setHeadline("Udemy Course Creation w/Camtasia: how I make over $1,000/month");
        coupon45.setImageUrl("https://udemy-images.udemy.com/course/480x270/557586_8da4_3.jpg");
        coupon45.setCourseUrl("https://www.udemy.com/udemy-course-creation-design-camtasia-techsmith-screencasts/?couponCode=Camtasia+Alex+Genadinik+Mobile+App");
        coupon45.setExpirationDate("None");
        coupon45.setPrice(10.00);
        coupon45.setCategoryId(24);
        coupons.add(coupon45);

        Coupon coupon46 = new Coupon();
        coupon46.setTitle("Secrets of Body Language");
        coupon46.setCouponName("Alex");
        coupon46.setHeadline("Learn to interpret body language of the people around you");
        coupon46.setImageUrl("https://udemy-images.udemy.com/course/480x270/38266_41b6_10.jpg");
        coupon46.setCourseUrl("https://www.udemy.com/the-secrets-of-body-language-webinar/?couponCode=Alex");
        coupon46.setExpirationDate("None");
        coupon46.setPrice(10.00);
        coupon46.setCategoryId(24);
        coupons.add(coupon46);

        Coupon coupon47 = new Coupon();
        coupon47.setTitle("How to Be a Human Lie Detector");
        coupon47.setCouponName("AlexLie");
        coupon47.setHeadline("Know when someone is lying to you");
        coupon47.setImageUrl("https://udemy-images.udemy.com/course/480x270/59935_17bb_3.jpg");
        coupon47.setCourseUrl("https://www.udemy.com/how-to-be-a-human-lie-detector/?couponCode=AlexLie");
        coupon47.setExpirationDate("None");
        coupon47.setPrice(25.00);
        coupon47.setCategoryId(24);
        coupons.add(coupon47);
    }
}

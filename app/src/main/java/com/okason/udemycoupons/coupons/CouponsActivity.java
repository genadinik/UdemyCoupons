package com.okason.udemycoupons.coupons;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.google.gson.Gson;
import com.okason.udemycoupons.R;
import com.okason.udemycoupons.data.Category;
import com.okason.udemycoupons.data.InMemoryCouponRepository;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CouponsActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)Toolbar toolbar;
    @Bind(R.id.tabs) TabLayout tabLayout;
    @Bind(R.id.viewpager) ViewPager viewPager;

    private List<Category> mCategories;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coupons);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        setupViewPager();
        tabLayout.setupWithViewPager(viewPager);





        //viewPager = (ViewPager)

//        if (savedInstanceState == null){
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.container, CouponsFragment.newInstance())
//                    .commit();
//        }

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    private void setupViewPager()
    {
        InMemoryCouponRepository repository = new InMemoryCouponRepository();
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        mCategories = repository.getPopulatedCategories();
        viewPager.setAdapter(adapter);
    }



    public class ViewPagerAdapter extends FragmentStatePagerAdapter
    {
        public ViewPagerAdapter(FragmentManager fm){
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            Gson gson = new Gson();
            Category selectedCategory = mCategories.get(position);
            String serializedCategory = gson.toJson(selectedCategory);
            return CouponsFragment.newInstance(serializedCategory);
        }

        @Override
        public int getCount() {
            return mCategories.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Category selectedCategory = mCategories.get(position);
            return selectedCategory.getName();
        }


    }
}

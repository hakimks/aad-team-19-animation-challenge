package com.team19.animation.ui;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.team19.animation.DessertsFragment;
import com.team19.animation.DrinksFragment;
import com.team19.animation.MainDishesFragment;
import com.team19.animation.R;
import com.team19.animation.adapters.FragmentsHolderViewPagerAdapter;

import org.jetbrains.annotations.Nullable;

public class MainFragmentActivity extends AppCompatActivity {
    private static final String TAG = "MainFragmentActivity";
    private TabLayout bottomTab;
    private ViewPager viewPager;
    private FragmentsHolderViewPagerAdapter fragmentPagerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomTab = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.view_pager_fragments_holder);
        fragmentPagerAdapter = new FragmentsHolderViewPagerAdapter(getSupportFragmentManager());

        fragmentPagerAdapter.addFragment(new MainDishesFragment(),"Main Dishes");
        fragmentPagerAdapter.addFragment(new DessertsFragment(),"Desserts");
        fragmentPagerAdapter.addFragment(new DrinksFragment(),"Drinks");

        viewPager.setAdapter(fragmentPagerAdapter);
        bottomTab.setupWithViewPager(viewPager);






    }


    public void init(){
        DessertsFragment dessertsFragment = new DessertsFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.layout_main_screen,dessertsFragment,"Desserts");
        transaction.addToBackStack("Desserts");
        transaction.commit();

    }
}

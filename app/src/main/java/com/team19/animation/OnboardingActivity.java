package com.team19.animation;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class OnboardingActivity extends AppCompatActivity {
    private ViewPager layoutPager;
    OnboardingViewPagerAdapter onboardingViewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        List<OnBoardScreenItem> mList = new ArrayList<>();
        mList.add(new OnBoardScreenItem("Fresh Food",getString(R.string.Lorem),R.drawable.img1));
        mList.add(new OnBoardScreenItem("Fast Delivery","",R.drawable.img2));
        mList.add(new OnBoardScreenItem("Easy Payment Options","",R.drawable.img3));


        //viewpager
        layoutPager = findViewById(R.id.viewPager_onboarding);
        onboardingViewPagerAdapter = new OnboardingViewPagerAdapter(this,mList);
        layoutPager.setAdapter(onboardingViewPagerAdapter);

    }
}

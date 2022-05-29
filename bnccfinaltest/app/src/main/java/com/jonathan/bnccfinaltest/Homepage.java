package com.jonathan.bnccfinaltest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        TabLayout tabLayout = findViewById(R.id.tablayout);
        TabItem Counter = findViewById(R.id.countertab);
        TabItem Areacalc = findViewById(R.id.areacalculatortab);
        TabItem Volumecalc = findViewById(R.id.volumecalculatortab);
        ViewPager viewpager = findViewById(R.id.viewpager);

        VPAdapter vpadapter = new
                VPAdapter(getSupportFragmentManager(),
                tabLayout.getTabCount());

        viewpager.setAdapter(vpadapter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
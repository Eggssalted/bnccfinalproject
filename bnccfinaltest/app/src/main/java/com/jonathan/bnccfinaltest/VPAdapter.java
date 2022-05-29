package com.jonathan.bnccfinaltest;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class VPAdapter extends FragmentPagerAdapter {

    private int numoftabs;

    public VPAdapter(FragmentManager fm, int numoftabs){
        super(fm);
        this.numoftabs = numoftabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Counter();
            case 1:
                return new Areacalculator();
            case 2:
                return new Volumecalculator();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numoftabs;
    }
}

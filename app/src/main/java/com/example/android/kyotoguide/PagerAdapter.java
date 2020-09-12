package com.example.android.kyotoguide;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {


    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new historicalSiteFragment();
        }else if (position == 1){
            return new RestaurantFragment();
        }else if (position == 2){
            return new ParksFragment();
        } else{
            return new FestivalsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}

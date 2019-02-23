package com.example.abdullahjubayer.multiplefragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Fragment_Adapter extends FragmentPagerAdapter {

    public Fragment_Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i){
            case 0:
                return new Fragment_1();

            case 1:
                return new Fragment_2();

            case 2:
                return new Fragment_3();

            default:
                return null;

             }
        }

    @Override
    public int getCount() {
        return 3;
    }
}

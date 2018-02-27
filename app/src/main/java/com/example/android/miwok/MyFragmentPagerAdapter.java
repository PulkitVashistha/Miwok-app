package com.example.android.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by pulkit on 2/27/2018.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public  MyFragmentPagerAdapter(FragmentManager fm){super(fm) ;}

    private  String tabTitles[] = new String[]{"Numbers","Family","Colors","Phrases"};

    @Override
    public Fragment getItem(int position) {
        if(position==0) {
            return new NumbersFragment();
        }else if (position==1){
            return new FamilyFragment();
        }else if (position==2){
            return new ColorsFragment();
        }else {
            return new PhrasesFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public int getCount() {
        return 4;
    }
}

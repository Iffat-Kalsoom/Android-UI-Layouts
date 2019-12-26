package com.example.myapplication.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myapplication.ConstraintLayoutClass;
import com.example.myapplication.FrameLayoutClass;
import com.example.myapplication.LinearLayoutClass;
import com.example.myapplication.R;
import com.example.myapplication.RelativeLayoutClass;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {


    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab1, R.string.tab2,R.string.tab3,R.string.tab4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        // Return a PlaceholderFragment (defined as a static inner class below).
        switch (position) {
            case 0:
                Fragment fragment = new RelativeLayoutClass();
                return fragment;

            case 1:
                Fragment fragment1 = new ConstraintLayoutClass();
                return fragment1;

            case 2:
                Fragment fragment2 = new LinearLayoutClass();
                return fragment2;
            case 3:
                Fragment fragment3 = new FrameLayoutClass();
                return fragment3;

            default:
                Fragment fragment4 = null;
                return fragment4;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
}
package com.example.dashboard;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapter extends FragmentPagerAdapter
{

    int tabcount;

    public PageAdapter(@NonNull FragmentManager fm, int behavior)
    {
        super(fm, behavior);
        tabcount = behavior;
    }


    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {

            case 0 : return new reports();
            case 1 :  return new bmi();
            case 2 : return new doctor();
            case 3 : return new profile();
            default:return null;
        }


    }


    @Override
    public int getCount()
    {
        return tabcount;
    }


}

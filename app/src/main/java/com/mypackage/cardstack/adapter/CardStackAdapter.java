package com.mypackage.cardstack.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.mypackage.cardstack.fragment.CardStackFragment;

public class CardStackAdapter extends FragmentStatePagerAdapter
{
    public CardStackAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new CardStackFragment();
    }

    @Override
    public int getCount() {
        return 5;
    }
}

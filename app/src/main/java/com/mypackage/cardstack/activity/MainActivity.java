package com.mypackage.cardstack.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mypackage.cardstack.R;
import com.mypackage.cardstack.adapter.CardStackAdapter;

public class MainActivity extends AppCompatActivity
{

    private ViewPager mPager ;

    private CardStackAdapter mAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mPager = (ViewPager) findViewById(R.id.viewPager);

        mAdapter = new CardStackAdapter(getSupportFragmentManager());

        mPager.setPageTransformer(true, new CardStackTransformer());

        mPager.setOffscreenPageLimit(5);

        mPager.setAdapter(mAdapter);
    }

    private class CardStackTransformer implements ViewPager.PageTransformer
    {
        @Override
        public void transformPage(View page, float position)
        {
            if(position>=0)
            {
                page.setScaleX(0.8f - 0.02f * position);

                page.setScaleY(0.8f);

                page.setTranslationX(- page.getWidth()*position);

                page.setTranslationY(30 * position);
            }

        }
    }
}

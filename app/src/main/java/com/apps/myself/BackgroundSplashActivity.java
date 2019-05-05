package com.apps.myself;

//tanggal pengerjaan : 02-05-2019 sampai 05-05-2019
//nim   : 10116468
//nama  : Muhamad Nurcahya Eko Diputra
//kelas : AKB-11 / IF-11

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BackgroundSplashActivity extends AppCompatActivity {

    private ViewPager nSlideViewPager;
    private LinearLayout mDotLayout;

    private SlideAdapter sliderAdapter;

    private TextView[] mDots;

    private Button btnNext;
    private Button btnBack;

    private  int mCurrentpage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background_splash);

        nSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
        mDotLayout = (LinearLayout) findViewById(R.id.dotLayout);

        sliderAdapter = new SlideAdapter(this);

        btnNext = (Button) findViewById(R.id.btn_next);
        btnBack = (Button) findViewById(R.id.btn_back);



        nSlideViewPager.setAdapter(sliderAdapter);

        addDotsIndicator(0);

        nSlideViewPager.addOnPageChangeListener(viewListener);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nSlideViewPager.setCurrentItem(mCurrentpage + 1);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nSlideViewPager.setCurrentItem(mCurrentpage - 1);
            }
        });

    }


    public void addDotsIndicator(int position){
            mDots = new TextView[3];
            mDotLayout.removeAllViews();

            for(int i = 0; i < mDots.length; i++){
                mDots[i] = new TextView(this);
                mDots[i].setText(Html.fromHtml("&#8226"));
                mDots[i].setTextSize(35);
                mDots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

                mDotLayout.addView(mDots[i]);
            }

            if(mDots.length > 0){
                mDots[position].setTextColor(getResources().getColor(R.color.colorWhite));
            }
    }
    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {

            addDotsIndicator(i);
            mCurrentpage = i;

            if ( i == 0 ){
                btnNext.setEnabled(true);
                btnBack.setEnabled(false);
                btnBack.setVisibility(View.INVISIBLE);

                btnNext.setText("Next");
                btnBack.setText("");
            } else if( i == mDots.length -1){
                btnNext.setEnabled(true);
                btnBack.setEnabled(true);
                btnBack.setVisibility(View.VISIBLE);
                btnNext.setText("Finish");
                btnBack.setText("Back");
                btnNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(BackgroundSplashActivity.this, MainActivity.class);
                        startActivity(i);
                    }
                });
            } else {
                btnNext.setEnabled(true);
                btnBack.setEnabled(true);
                btnBack.setVisibility(View.VISIBLE);
                btnNext.setText("Next");
                btnBack.setText("Back");
            }

            }



        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };

}

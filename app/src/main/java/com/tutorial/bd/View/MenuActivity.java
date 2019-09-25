package com.tutorial.bd.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
/*
import com.gigamole.navigationtabstrip.NavigationTabStrip;
import com.gigamole.sample.R;
import com.gigamole.sample.adapters.MainPagerAdapter;
*/

import com.tutorial.bd.R;

public class MenuActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


    }
/*
    final ViewPager viewPager = (ViewPager) findViewById(R.id.vp_menu);
        viewPager.setAdapter(new MainPagerAdapter(getSupportFragmentManager()));
        viewPager.setOffscreenPageLimit(2);

    final NavigationTabStrip navigationTabStrip = (NavigationTabStrip) findViewById(R.id.nts);
        navigationTabStrip.setTitles("HOW WE WORK", "WE WORK WITH");
        navigationTabStrip.setViewPager(viewPager);
    }*/
}

package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {


    TabLayout tabLayout;
    TabItem tabItem1,tabItem2,tabItem3;
    ViewPager viewPager;
    PageAdapter pageAdapter;


//LinearLayout CBC,LIPID,HBA1C,THYROID,CRP;


    @Override
    protected void onCreate(Bundle savedInstanceState)


    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_main);

//        CBC = (LinearLayout) findViewById(R.id.cbc);
//        LIPID = (LinearLayout) findViewById(R.id.lipid);
//        THYROID = (LinearLayout) findViewById(R.id.thyroid);
//        CRP = (LinearLayout) findViewById(R.id.crp);
//        HBA1C = (LinearLayout) findViewById(R.id.hba1c);

//        CBC.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent1 = new Intent(MainActivity.this, cbc.class);
//                startActivity(intent1);
//            }
//        });
//        LIPID.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent2 = new Intent(MainActivity.this , lipid123.class);
//                startActivity(intent2);
//            }
//        });
////
////
//        THYROID.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent3 = new Intent(MainActivity.this,thyroid.class);
//                startActivity(intent3);
//            }
//        });
////
//
//        HBA1C.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent4 = new Intent(MainActivity.this, hba1c.class);
//                startActivity(intent4);
//            }
//
//        });
//
//
//        CRP.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent5 = new Intent(MainActivity.this, crp.class);
//                startActivity(intent5);
//            }
//
//        });



        tabLayout = (TabLayout) findViewById(R.id.tableLayout1);
        tabItem1 = (TabItem) findViewById(R.id.tab1);
        tabItem2 = (TabItem) findViewById(R.id.tab2);
        tabItem3 = (TabItem) findViewById(R.id.tab3);
        viewPager = (ViewPager) findViewById(R.id.vpager);





        pageAdapter = new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());

                if(tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition()==2)
                    pageAdapter.notifyDataSetChanged();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });



        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));







    }

}
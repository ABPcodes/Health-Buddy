package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {


LinearLayout CBC,LIPID,THYROID,CRP;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        setContentView(R.layout.activity_main);

        CBC = (LinearLayout) findViewById(R.id.cbc);
        LIPID = (LinearLayout) findViewById(R.id.lipid);
        THYROID = (LinearLayout) findViewById(R.id.thyroid);
        CRP = (LinearLayout) findViewById(R.id.crp);


        CBC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, cbc.class);
                startActivity(intent1);
            }
        });

        LIPID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, lipid123.class);
                startActivity(intent2);
            }
        });

       
        THYROID.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this,thyroid.class);
                startActivity(intent3);
            }
        });


        CRP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this,crp.class);
                startActivity(intent4);
            }
        });

    }

}
package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class bmiactivity extends AppCompatActivity {

    android.widget.Button mrecalcuatebmi;
    TextView mbmidisplay,mbmicategory,mgender;
    Intent intent;
    ImageView mimageview;
    String mbmi;
    float intbmi;

    String height, weight;
    float intheight,intweight;
    RelativeLayout mbackground;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity);

        mrecalcuatebmi = findViewById(R.id.recalcuatebmi);

        intent = getIntent();

        mbmidisplay = findViewById(R.id.bmidisplay);
        mbmicategory = findViewById(R.id.bmicategory);
        mgender = findViewById(R.id.genderdisplay);
        mbackground = findViewById(R.id.contentlayout);
        mimageview = findViewById(R.id.imageview);
        mrecalcuatebmi = findViewById(R.id.recalcuatebmi);

        height = intent.getStringExtra("height");
        weight = intent.getStringExtra("weight");
        String gender = intent.getStringExtra("gender");

     intheight = Float.parseFloat(height);
     intweight = Float.parseFloat(weight);


        intheight = intheight/100;

        intbmi = intweight/(intheight*intheight);

        mbmi = Float.toString(intbmi);




        if (intbmi < 16) {
            mbmicategory.setText("Server Thiness");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.wrong);
        } else if (intbmi < 16.9 && intbmi > 16) {
            mbmicategory.setText("Moderate Thiness");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.wrong);
        } else if (intbmi < 18.4 && intbmi > 17) {
            mbmicategory.setText("Mild Thiness");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.wrong);
        } else if (intbmi < 25 && intbmi > 18.4) {
            mbmicategory.setText("Normal");
            // mbackground.setBackgroundColor(Color.YELLOW);
            mimageview.setImageResource(R.drawable.right);
        } else if (intbmi < 29.4 && intbmi > 25) {
            mbmicategory.setText("Overweight");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.wrong);
        } else {
            mbmicategory.setText("Obese Class");
            mbackground.setBackgroundColor(Color.RED);
            mimageview.setImageResource(R.drawable.wrong);
        }






        mgender.setText(intent.getStringExtra("gender"));
        mbmidisplay.setText(mbmi);




        mrecalcuatebmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(bmiactivity.this,bmi.class);
                startActivity(intent);
                finish();
            }
        });


    }
}
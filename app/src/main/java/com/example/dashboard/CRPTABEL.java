package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CRPTABEL extends AppCompatActivity {


    TextView t1;
    boolean a = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crptabel);

        t1 = (TextView) findViewById(R.id.textView1500);

        Double CRP;

        Intent crpr = this.getIntent();

        CRP = crpr.getDoubleExtra("CRP", 0);

        if(CRP != 0)
        {

            if(CRP<=1.0)
            {
                t1.setText("Low risk");
                a=true;
            }
            else if(CRP>=1.1 && CRP<=3.0)
            {
                t1.setText("Moderate risk");
                a=true;
            }
            else if(CRP>=3.1 && CRP<=10.0)
            {
                t1.setText("hige risk");
                a=true;
            }
            else
            {
                t1.setText("Invalid input");
                a=true;

            }

        }

    }
}
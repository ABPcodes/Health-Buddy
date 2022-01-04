package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class THYROIDTABLE extends AppCompatActivity {

    TextView t1,t2,t3,t4;
    boolean a = true;
    boolean b = true;
    boolean c = true;
    boolean d = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thyroidtable);

        t1 = (TextView) findViewById(R.id.textView1500);
        t2 = (TextView) findViewById(R.id.textView1501);
        t3 = (TextView) findViewById(R.id.textView1502);
        t4 = (TextView) findViewById(R.id.textView1503);

        Double TSH;
        Double TYI;
        Double T3U ;
        Double FIT;

        Intent thyroidr = this.getIntent();

        TSH = thyroidr.getDoubleExtra("TSH", 0);
        TYI = thyroidr.getDoubleExtra("TYI", 0);
        T3U = thyroidr.getDoubleExtra("T3U", 0);
        FIT = thyroidr.getDoubleExtra("FIT", 0);



        if (TSH != null) {

             if (TSH >= 0.450 && TSH <= 4.500) {
                t1.setText("NORMAL");
                a = true;
            } else if (TSH < 0.450) {
                t1.setText("LESS BY: " + (0.450 - TSH));
                a = false;

            } else if (TSH > 4.500) {
                t1.setText("MORE BY: " + (TSH - 4.500));
                a = false;
            } else {
                t1.setText("INVALID INPUT");
            }


        }


        //////////////////////////////////////


        if (TYI != null) {


            if (TYI >= 4.5 && TYI <= 12.0) {
                t2.setText("NORMAL");
                b = true;

            } else if (TYI < 4.5) {
                t2.setText("LESS BY: " + (4.5 - TYI));
                b = false;

            } else if (TYI > 12.0) {
                t2.setText("MORE BY: " + (TYI - 12.0));
                b = false;
            } else {
                t2.setText("Invalid input");
                b = false;

            }

        }
//


        ///////////////////////////////////////////////////////


        if (T3U != null) {



            if (T3U >= 24 && T3U <= 39) {
                t3.setText("NORMAL");
                c = true;

            } else if (T3U < 24) {
                t3.setText("LESS BY: " + (24 - T3U));
                c = false;

            } else if (T3U > 39) {
                t3.setText("MORE BY: " + (T3U - 39));
                c = false;
            } else {
                t3.setText("Invalid input");
                c = false;
            }

        }


        /////////////////////////////////////////


        if (FIT != null) {


            if (FIT >= 1.2 && FIT <= 4.9) {
                t4.setText("NORMAL");
                d = true;
            } else if (FIT < 1.2) {
                t4.setText("LESS BY:" + (1.2 - FIT));
                d = false;

            } else if (FIT > 4.9) {
                t4.setText("MORE BY:" + (FIT - 4.9));
                d = false;
            } else {
                t4.setText("Invalid input");
                d = false;
            }

        }


    }
}
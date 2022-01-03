package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LIPIDTABLE123 extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6,t7,t8;
    boolean a = true;
    boolean b = true;
    boolean c = true;
    boolean d = true;
    boolean e = true;
    boolean f = true;
    boolean g = true;
    boolean h = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lipidtable123);



        t1 = (TextView) findViewById(R.id.textView1500);
        t2 = (TextView) findViewById(R.id.textView1501);
        t3 = (TextView) findViewById(R.id.textView1502);
        t4 = (TextView) findViewById(R.id.textView1503);
        t5 = (TextView) findViewById(R.id.textView1504);
        t6 = (TextView) findViewById(R.id.textView1505);
        t7 = (TextView) findViewById(R.id.textView1506);
        t8 = (TextView) findViewById(R.id.textView1507);

//        lipids.putExtra("chl",chl);
//        lipids.putExtra("til",til);
//        lipids.putExtra("hdlc",hdlc);
//        lipids.putExtra("ldlc",ldlc);
//        lipids.putExtra("vldlc",vldlc);
//        lipids.putExtra("chohdl",chohdl);
//        lipids.putExtra("ldlhdl",ldlhdl);
//        lipids.putExtra("non_hdl",non_hdl);


        Double chl;
        Double til;
        Double hdlc ;
        Double ldlc;
        Double vldlc;
        Double chohdl ;
        Double ldlhdl;
        Double non_hdl;

        Intent lipidr = this.getIntent();

        chl = lipidr.getDoubleExtra("chl", 0);
        til = lipidr.getDoubleExtra("til", 0);
        hdlc = lipidr.getDoubleExtra("hdlc", 0);
        ldlc = lipidr.getDoubleExtra("ldlc", 0);
        vldlc = lipidr.getDoubleExtra("vldlc", 0);
        chohdl = lipidr.getDoubleExtra("chohdl", 0);
        ldlhdl = lipidr.getDoubleExtra("ldlhdl", 0);
        non_hdl = lipidr.getDoubleExtra("non_hdl", 0);


        if (chl != null) {


            if (chl == 10) {
                t1.setText("you entered 10");
            } else if (chl >= 0 && chl <= 240) {
                t1.setText("NORMAL");
                a = true;
            } else if (chl < 0) {
                t1.setText("LESS BY: " + (0 - chl));
                a = false;

            } else if (chl > 240) {
                t1.setText("MORE BY: " + (chl - 240));
                a = false;
            } else {
                t1.setText("INVALID INPUT");
            }


        }


        //////////////////////////////////////


        if (til != null) {


            if (til >= 0 && til <= 499) {
                t2.setText("NORMAL");
                b = true;

            } else if (til < 0) {
                t2.setText("LESS BY: " + (0 - til));
                b = false;

            } else if (til > 499) {
                t2.setText("MORE BY: " + (til - 499));
                b = false;
            } else {
                t2.setText("Invalid input");
                b = false;

            }

        }
//


        ///////////////////////////////////////////////////////


        if (hdlc != null) {



            if (hdlc >= 35 && hdlc <= 60) {
                t3.setText("NORMAL");
                c = true;

            } else if (hdlc < 35 && hdlc > 0) {
                t3.setText("LESS BY: " + (35 - hdlc));
                c = false;

            } else if (hdlc > 60) {
                t3.setText("MORE BY: " + (hdlc - 60));
                c = false;
            } else {
                t3.setText("Invalid input");
                c = false;
            }

        }


        /////////////////////////////////////////


        if (ldlc != null) {



            if (ldlc >= 0 && ldlc <= 160) {
                t4.setText("NORMAL");
                d = true;
            } else if (ldlc < 0) {
                t4.setText("LESS BY:" + (0 - ldlc));
                d = false;

            } else if (ldlc > 160) {
                t4.setText("MORE BY:" + (ldlc - 160));
                d = false;
            } else {
                t4.setText("Invalid input");
                d = false;
            }

        }

        //////////////////////////////////////


        if (vldlc != null) {


            if ( vldlc >= 6.0 && vldlc <= 38.0) {
                t5.setText("NORMAL");
                e = true;
            } else if (vldlc < 6.0 && vldlc > 0) {
                t5.setText("LESS BY:" + (6.0 - vldlc));
                e = false;

            } else if (vldlc > 38.0) {
                t5.setText("MORE BY:" + (vldlc - 38.0));
                e = false;
            } else {
                t5.setText("Invalid input");
                e = false;
            }


        }


        //////////////////////////////////


        if (chohdl != null) {


            if (chohdl >= 3.5 && chohdl <= 5.0) {
                t6.setText("NORMAL");
                f = true;
            } else if (chohdl < 3.5 && chohdl > 0) {
                t6.setText("LESS BY:" + (3.5 - chohdl));
                f = false;

            } else if (chohdl > 5.0) {
                t6.setText("MORE BY:" + (chohdl - 5.0));
                f = false;
            } else {
                t6.setText("Invalid input");
                f = false;
            }

        }

        ////////////////////////////////////


        if (ldlhdl != null) {


            if (ldlhdl >= 1.5 && ldlhdl <= 3.5) {
                t7.setText("NORMAL");
                g = true;
            } else if (ldlhdl < 1.5 && ldlhdl > 0) {
                t7.setText("LESS BY:" + (1.5 - ldlhdl));
                g = false;

            } else if (ldlhdl > 3.5) {
                t7.setText("MORE BY:" + (ldlhdl - 3.5));
                g = false;
            } else {
                t7.setText("Invalid input");
                g = false;
            }


        }

        ////////////////////////////////////


        if (non_hdl != null) {

            if (non_hdl >= 0 && non_hdl <= 160) {
                t8.setText("NORMAL");
                h = true;
            } else if (non_hdl < 0) {
                t8.setText("LESS BY:" + (0 - non_hdl));
                h = false;

            } else if (non_hdl > 160) {
                t8.setText("MORE BY:" + (non_hdl - 160));
                h = false;
            } else {
                t8.setText("Invalid input");
                h = false;
            }

        }

    }
}
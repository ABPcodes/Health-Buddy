package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CBCTABEL extends AppCompatActivity {


    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
    boolean a = true;
    boolean b = true;
    boolean c = true;
    boolean d = true;
    boolean e = true;
    boolean f = true;
    boolean g = true;
    boolean h = true;
    boolean i = true;
    boolean j = true;
    boolean k = true;
    boolean l = true;
    boolean m = true;
    boolean n = true;
    boolean o = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbctabel);







        t1 = (TextView) findViewById(R.id.textView1500);
        t2 = (TextView) findViewById(R.id.textView1501);
        t3 = (TextView) findViewById(R.id.textView1502);
        t4 = (TextView) findViewById(R.id.textView1503);
        t5 = (TextView) findViewById(R.id.textView1504);
        t6 = (TextView) findViewById(R.id.textView1505);
        t7 = (TextView) findViewById(R.id.textView1506);
        t8 = (TextView) findViewById(R.id.textView1507);
        t9 = (TextView) findViewById(R.id.textView1508);
        t10 = (TextView) findViewById(R.id.textView1509);
        t11 = (TextView) findViewById(R.id.textView15010);
        t12 = (TextView) findViewById(R.id.textView15011);
        t13 = (TextView) findViewById(R.id.textView15012);
        t14 = (TextView) findViewById(R.id.textView15013);
        t15 = (TextView) findViewById(R.id.textView15014);
        t16 = (TextView) findViewById(R.id.dipoutput);




        Double wbc;
        Double rbc;
        Double plc ;
        Double hmb;
        Double pcv;
        Double mcv ;
        Double mch;
        Double mchc;
        Double rcd;
        Double nt ;
        Double lp;
        Double ep ;
        Double pm ;
        Double mc ;
        Double bp ;



        Intent cbcr = this.getIntent();

        wbc = cbcr.getDoubleExtra("wbc", 0);
        rbc = cbcr.getDoubleExtra("rbc", 0);
        plc = cbcr.getDoubleExtra("plc", 0);
        hmb = cbcr.getDoubleExtra("hmb", 0);
        pcv = cbcr.getDoubleExtra("pcv", 0);
        mcv = cbcr.getDoubleExtra("mcv", 0);
        mch = cbcr.getDoubleExtra("mch", 0);
        mchc = cbcr.getDoubleExtra("mchc", 0);
        rcd = cbcr.getDoubleExtra("rcd", 0);
        nt = cbcr.getDoubleExtra("nt", 0);
        lp = cbcr.getDoubleExtra("lp", 0);
        ep = cbcr.getDoubleExtra("ep", 0);
        pm = cbcr.getDoubleExtra("pm", 0);
        mc = cbcr.getDoubleExtra("mc", 0);
        bp = cbcr.getDoubleExtra("bp", 0);









        if(wbc != null)
        {


            if (wbc >= 4000 && wbc <= 10000)
            {
                t1.setText("NORMAL");
                a = true;
            }


            else if (wbc < 4000 && wbc>0)
            {
                t1.setText("LESS BY: " + (4000 - wbc));
                a = false;

            }

            else if (wbc > 10000)
            {
                t1.setText("MORE BY: " + (wbc - 10500));
                a = false;
            }

            else
            {
                t1.setText("INVALID INPUT");
            }


        }





        //////////////////////////////////////








        if(rbc != null)

        {


            if (rbc >= 4.2 && rbc <= 5.9) {
                t2.setText("NORMAL");
                b = true;

            } else if (rbc < 4.2 && rbc>0) {
                t2.setText("LESS BY: " + (4.2 - rbc));
                b = false;

            } else if (rbc > 5.90) {
                t2.setText("MORE BY: " + (rbc - 5.9));
                b = false;
            } else {
                t2.setText("Invalid input");
                b = false;

            }

        }




        ///////////////////////////////////////////////////////






        if(plc != null)

        {



            if (plc >= 150000 && plc <= 450000) {
                t3.setText("NORMAL");
                c = true;

            } else if (plc < 150000 && plc>0) {
                t3.setText("LESS BY: " + (150000 - plc));
                c = false;

            } else if (plc > 450000) {
                t3.setText("MORE BY: " + (plc - 450000));
                c = false;
            } else  {
                t3.setText("Invalid input");
                c = false;
            }

        }


        /////////////////////////////////////////







        if(hmb !=null)

        {



            if (hmb >= 13.5 && hmb <= 17.5) {
                t4.setText("NORMAL");
                d = true;
            } else if (hmb < 13.5 && hmb>0) {
                t4.setText("LESS BY:" + (14.0 - hmb));
                d = false;

            } else if (hmb > 17.5) {
                t4.setText("MORE BY:" + (hmb - 15.0));
                d = false;
            } else {
                t4.setText("Invalid input");
                d = false;
            }

        }

        //////////////////////////////////////







        if(pcv != null)

        {


            if (pcv >= 42 && pcv <= 52) {
                t5.setText("NORMAL");
                e = true;
            } else if (pcv < 42 && pcv>0) {
                t5.setText("LESS BY:" + (45 - pcv));
                e = false;

            } else if (pcv > 52) {
                t5.setText("MORE BY:" + (pcv - 52));
                e = false;
            } else {
                t5.setText("Invalid input");
                e = false;
            }


        }


        //////////////////////////////////







        if(mcv != null)

        {


            if (mcv >= 80 && mcv <= 100) {
                t6.setText("NORMAL");
                f = true;
            } else if (mcv < 80  && mcv>0) {
                t6.setText("LESS BY:" + (80 - mcv));
                f = false;

            } else if (mcv > 100) {
                t6.setText("MORE BY:" + (mcv - 100));
                f = false;
            } else {
                t6.setText("Invalid input");
                f = false;
            }

        }

        ////////////////////////////////////






        if(mch != null)

        {


            if (mch >= 27.0 && mch <= 32.0) {
                t7.setText("NORMAL");
                g = true;
            } else if (mch < 32.0  && mch>0) {
                t7.setText("LESS BY:" + (27.0 - mch));
                g = false;

            } else if (mch > 32.0) {
                t7.setText("MORE BY:" + (mch - 32.0));
                g = false;
            } else {
                t7.setText("Invalid input");
                g = false;
            }


        }

        ////////////////////////////////////





        if(mchc != null)

        {


            if (mchc >= 32.0 && mchc <= 36.0) {
                t8.setText("NORMAL");
                h = true;
            } else if (mchc < 32.0  && mchc>0) {
                t8.setText("LESS BY:" + (32.0 - mchc));
                h = false;

            } else if (mchc > 36.0) {
                t8.setText("MORE BY:" + (mchc - 36.0));
                h = false;
            } else {
                t8.setText("Invalid input");
                h = false;
            }

        }

        ////////////////////////////////////////






        if(rcd != null)

        {


            if (rcd >= 11.5 && rcd <= 14.5) {
                t9.setText("NORMAL");
                i = true;
            } else if (rcd < 11.5  && rcd>0) {
                t9.setText("LESS BY:" + (11.5 - rcd));
                i = false;

            } else if (rcd > 14.5) {
                t9.setText("MORE BY:" + (rcd - 14.5));
                i = false;
            } else {
                t9.setText("Invalid input");
                i = false;
            }

        }

        ////////////////////////////////////////







        if(nt != null)

        {


            if (nt >= 33 && nt <= 77) {
                t10.setText("NORMAL");
                j = true;
            } else if (nt < 33  && nt>0) {
                t10.setText("LESS BY:" + (33 - nt));
                j = false;

            } else if (nt > 77) {
                t10.setText("MORE BY:" + (nt - 77));
                j = false;
            } else {
                t10.setText("Invalid input");
                j = false;
            }

        }


        ///////////////////////////////////////









        if(lp != null)

        {


            if (lp >= 13 && lp <= 52) {
                t11.setText("NORMAL");
                k = true;
            } else if (lp < 13  && lp>0) {
                t11.setText("LESS BY:" + (13 - lp));
                k = false;

            } else if (lp > 52) {
                t11.setText("MORE BY:" + (lp - 52));
                k = false;
            } else {
                t11.setText("Invalid input");
                k = false;
            }
        }

        /////////////////////////////////////







        if(ep != null)

        {



            if (ep >= 0 && ep <= 5) {
                t12.setText("NORMAL");
                l = true;
            } else if (ep < 0 ) {
                t12.setText("LESS BY:" + (0 - ep));
                l = false;

            } else if (ep > 5 )  {
                t12.setText("MORE BY:" + (ep - 5));
                l = false;
            } else {
                t12.setText("Invalid input");
                l = false;
            }
        }
        ///////////////////////////////////





        if(pm != null)

        {


            if (pm >= 40 && pm <= 80) {
                t13.setText("NORMAL");
                m = true;
            } else if (pm < 40  && pm>0) {
                t13.setText("LESS BY:" + (40 - pm));
                m = false;

            } else if (pm > 80) {
                t13.setText("MORE BY:" + (pm - 80));
                m = false;
            } else {
                t13.setText("Invalid input");
                m = false;
            }
        }
        ////////////////////////////////////////////////








        if(mc != null)
        {


            if (mc >= 0 && mc <= 10) {
                t14.setText("NORMAL");
                n = true;
            } else if (mc < 0) {
                t14.setText("LESS BY:" + (0 - mc));
                n = false;

            } else if (mc > 10) {
                t14.setText("MORE BY:" + (mc - 10));
                n = false;
            } else {
                t14.setText("Invalid input");
                n = false;
            }

        }
        ////////////////////////////////////////





        if(bp != null)
        {


            if (bp >= 0 && bp <= 2) {
                t15.setText("NORMAL");
                o = true;
            } else if (bp < 0) {
                t15.setText("LESS BY:" + (0 - bp));
                o = false;

            } else if (bp > 10) {
                t15.setText("MORE BY:" + (bp - 2));
                o = false;
            } else {
                t15.setText("Invalid input");
                o = false;
            }

        }


        if(a == true &&      b == true && c == true &&
                d == true && e == true &&
                f == true && g == true &&
                h == true && i == true &&
                j == true && k == true &&
                l == true && m == true &&
                n == true && o == true  )
        {

            t16.setText("CONGRATES! YOU REPORT IS NORMAL");

        }

        else
        {
            t16.setText("YOUR REPORT IS NOT NORMAL");
        }


    }











    }

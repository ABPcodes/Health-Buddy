package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SGPTTABLE extends AppCompatActivity {



    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    boolean a = true;
    boolean b = true;
    boolean c = true;
    boolean d = true;
    boolean e = true;
    boolean f = true;
    boolean G = true;
    boolean h = true;
    boolean i = true;
    boolean j = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpttable);



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
        t11 = (TextView) findViewById(R.id.dipoutput);



        Double bit;
        Double biu;
        Double bic ;
        Double sgot;
        Double sgpt;
        Double ap ;
        Double tp;
        Double as;
        Double g;
        Double ag ;




        Intent sgptr = this.getIntent();

        bit = sgptr.getDoubleExtra("bit", 0);
        biu = sgptr.getDoubleExtra("biu", 0);
        bic = sgptr.getDoubleExtra("bic", 0);
        sgot = sgptr.getDoubleExtra("sgot", 0);
        sgpt = sgptr.getDoubleExtra("sgpt", 0);
        ap = sgptr.getDoubleExtra("ap", 0);
        tp = sgptr.getDoubleExtra("tp", 0);
        as = sgptr.getDoubleExtra("as", 0);
        g = sgptr.getDoubleExtra("g", 0);
        ag = sgptr.getDoubleExtra("ag", 0);


        if(bit != null) {

              if (bit >= 0.2 && bit <= 1.3) {
                    t1.setText("NORMAL");
                    a = true;
                } else if (bit < 0.2) {
                    t1.setText("LESS BY: " + (0.2 - bit));
                    a = false;

                } else if (bit > 1.3) {
                    t1.setText("MORE BY: " + (bit - 1.3));
                    a = false;
                } else {
                    t1.setText("INVALID INPUT");
                }
        }





        //////////////////////////////////////








        if(biu != null)

        {


            if (biu >= 0 && biu <= 1.1)
            {
                t2.setText("NORMAL");
                b = true;

            }

            else if (biu < 0)
            {
                t2.setText("LESS BY: " + (0 - biu));
                b = false;
            }

            else if (biu > 1.1)
            {
                t2.setText("MORE BY: " + (biu - 1.1));
                b = false;
            }

            else
            {
                t2.setText("Invalid input");
                b = false;

            }

        }
//



        ///////////////////////////////////////////////////////






        if(bic != null)

        {



            if (bic >= 0 && bic <= 0.3) {
                t3.setText("NORMAL");
                c = true;

            } else if (bic < 0) {
                t3.setText("LESS BY: " + (0 - bic));
                c = false;

            } else if (bic > 0.3) {
                t3.setText("MORE BY: " + (bic - 0.3));
                c = false;
            } else {
                t3.setText("Invalid input");
                c = false;
            }

        }


        /////////////////////////////////////////







        if(sgot != null)

        {



            if (sgot >= 14 && sgot <= 36) {
                t4.setText("NORMAL");
                d = true;
            } else if (sgot < 14) {
                t4.setText("LESS BY:" + (14 - sgot));
                d = false;

            } else if (sgot > 36) {
                t4.setText("MORE BY:" + (sgot - 36));
                d = false;
            } else {
                t4.setText("Invalid input");
                d = false;
            }

        }

        //////////////////////////////////////






        if(sgpt != null)

        {


            if (sgpt >= 0 && sgpt <= 35) {
                t5.setText("NORMAL");
                e = true;
            } else if (sgpt < 0) {
                t5.setText("LESS BY:" + (0 - sgpt));
                e = false;

            } else if (sgpt > 35) {
                t5.setText("MORE BY:" + (sgpt - 35));
                e = false;
            } else {
                t5.setText("Invalid input");
                e = false;
            }


        }


        //////////////////////////////////







        if(ap != null)

        {


            if (ap >= 38 && ap <= 126) {
                t6.setText("NORMAL");
                f = true;
            } else if (ap < 38) {
                t6.setText("LESS BY:" + (38 - ap));
                f = false;

            } else if (ap > 126) {
                t6.setText("MORE BY:" + (ap - 126));
                f = false;
            } else {
                t6.setText("Invalid input");
                f = false;
            }

        }

        ////////////////////////////////////






        if(tp != null)

        {


            if (tp >= 6.3 && tp <= 8.2) {
                t7.setText("NORMAL");
                G = true;
            } else if (tp < 6.3) {
                t7.setText("LESS BY:" + (6.3 - tp));
                G = false;

            } else if (tp > 8.2) {
                t7.setText("MORE BY:" + (tp - 8.2));
                G = false;
            } else {
                t7.setText("Invalid input");
                G = false;
            }


        }

        ////////////////////////////////////





        if(as != null)

        {


            if (as >= 3.5 && as <= 5) {
                t8.setText("NORMAL");
                h = true;
            } else if (as < 3.5) {
                t8.setText("LESS BY:" + (3.5 - as));
                h = false;

            } else if (as > 5) {
                t8.setText("MORE BY:" + (as - 5));
                h = false;
            } else {
                t8.setText("Invalid input");
                h = false;
            }

        }

        ////////////////////////////////////////






        if(g != null)

        {


            if (g >= 2.3 && g <= 3.5) {
                t9.setText("NORMAL");
                i = true;
            } else if (g < 2.3) {
                t9.setText("LESS BY:" + (2.3 - g));
                i = false;

            } else if (g > 3.5) {
                t9.setText("MORE BY:" + (g - 3.5));
                i = false;
            } else {
                t9.setText("Invalid input");
                i = false;
            }

        }

        ////////////////////////////////////////







        if(ag != null)

        {


            if (ag >= 1 && ag <= 2.1) {
                t10.setText("NORMAL");
                j = true;
            } else if (ag < 1) {
                t10.setText("LESS BY:" + (1 - ag));
                j = false;

            } else if (ag > 2.1) {
                t10.setText("MORE BY:" + (ag - 2.1));
                j = false;
            } else {
                t10.setText("Invalid input");
                j = false;
            }

        }




        if(a == true &&      b == true && c == true &&
                d == true && e == true &&
                f == true && G == true &&
                h == true && i == true &&
                j == true  )
        {

            t11.setText("CONGRATES! YOU REPORT IS NORMAL");

        }

        else
        {
            t11.setText("YOUR REPORT IS NOT NORMAL");
        }





    }
}
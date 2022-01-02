package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class lipid extends AppCompatActivity {

    TextInputLayout ti1,ti2,ti3,ti4,ti5,ti6,ti7,ti8;
    EditText e1,e2,e3,e4,e5,e6,e7,e8;
    MaterialButton check;
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
        setContentView(R.layout.lipid);
        ti1 = findViewById(R.id.CholesterolL);
        ti2 = findViewById(R.id.trlglycerideL);
        ti3 = findViewById(R.id.HdlcL);
        ti4 = findViewById(R.id.ldlcL);
        ti5 = findViewById(R.id.vldlcL);
        ti6 = findViewById(R.id.cho_hdlL);
        ti7 = findViewById(R.id.ldl_hdlL);
        ti8 = findViewById(R.id.Non_HdlL);





        e1 = findViewById(R.id.Cholesterol);
        e2 = findViewById(R.id.trlglyceride);
        e3= findViewById(R.id.Hdlc);
        e4 = findViewById(R.id.ldlc);
        e5 = findViewById(R.id.vldlc);
        e6 = findViewById(R.id.cho_hdl);
        e7 = findViewById(R.id.ldl_hdl);
        e8 = findViewById(R.id.Non_Hdl);




        t1 = (TextView) findViewById(R.id.textView1500);
        t2 = (TextView) findViewById(R.id.textView1501);
        t3 = (TextView) findViewById(R.id.textView1502);
        t4 = (TextView) findViewById(R.id.textView1503);
        t5 = (TextView) findViewById(R.id.textView1504);
        t6 = (TextView) findViewById(R.id.textView1505);
        t7 = (TextView) findViewById(R.id.textView1506);
        t8 = (TextView) findViewById(R.id.textView1507);



        check = findViewById(R.id.check);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(e1.getText().toString().isEmpty()== true || e2.getText().toString().isEmpty() == true || e3.getText().toString().isEmpty()==true
                        && e4.getText().toString().isEmpty()== true || e5.getText().toString().isEmpty()==true || e6.getText().toString().isEmpty()==true
                        && e7.getText().toString().isEmpty()==true || e8.getText().toString().isEmpty()==true)
                {
                    if(e1.getText().toString().isEmpty() == true){
                        Toast.makeText(getApplicationContext(), "Enter cholesterol", Toast.LENGTH_SHORT).show();
                    }
                    if(e2.getText().toString().isEmpty() == true){
                        Toast.makeText(getApplicationContext(), "Enter Triglycrride ", Toast.LENGTH_SHORT).show();
                    }
                    if(e3.getText().toString().isEmpty() == true){
                        Toast.makeText(getApplicationContext(), "Enter HDL Cholesterol", Toast.LENGTH_SHORT).show();
                    }
                    if(e4.getText().toString().isEmpty() == true){
                        Toast.makeText(getApplicationContext(), "Enter LDL Cholesterol", Toast.LENGTH_SHORT).show();
                    }
                    if(e5.getText().toString().isEmpty() == true){
                        Toast.makeText(getApplicationContext(), "Enter VLDL Cholesterol", Toast.LENGTH_SHORT).show();
                    }
                    if(e6.getText().toString().isEmpty() == true){
                        Toast.makeText(getApplicationContext(), "Enter CHOL/HDL Ratio", Toast.LENGTH_SHORT).show();
                    }
                    if(e7.getText().toString().isEmpty() == true){
                        Toast.makeText(getApplicationContext(), "Enter LDL/HDL Ratio", Toast.LENGTH_SHORT).show();
                    }
                    if(e8.getText().toString().isEmpty() == true){
                        Toast.makeText(getApplicationContext(), "Enter NON HDL Cholesterol", Toast.LENGTH_SHORT).show();
                    }

                }


                else if(e1.getText().toString().isEmpty()== true && e2.getText().toString().isEmpty() == true && e3.getText().toString().isEmpty()==true
                        && e4.getText().toString().isEmpty()== true && e5.getText().toString().isEmpty()==true && e6.getText().toString().isEmpty()==true
                        && e7.getText().toString().isEmpty()==true && e8.getText().toString().isEmpty()==true )
                {
                    Toast.makeText(getApplicationContext(), "All boxes are compulsory", Toast.LENGTH_SHORT).show();
                }


                ///////////////////////////


                if(e1.getText().toString().isEmpty()== false && e2.getText().toString().isEmpty() == false && e3.getText().toString().isEmpty()==false
                        && e4.getText().toString().isEmpty()== false && e5.getText().toString().isEmpty()==false && e6.getText().toString().isEmpty()==false
                        && e7.getText().toString().isEmpty()==false && e8.getText().toString().isEmpty()==false) {

                    if (e1.getText().toString().isEmpty() == false) {
                        double Cholesterol = Double.parseDouble(e1.getText().toString());

                        if (Cholesterol == 10) {
                            t1.setText("you entered 10");
                        } else if (Cholesterol >= 0 && Cholesterol <= 240) {
                            t1.setText("NORMAL");
                            a = true;
                        } else if (Cholesterol < 0) {
                            t1.setText("LESS BY: " + (0 - Cholesterol));
                            a = false;

                        } else if (Cholesterol > 240) {
                            t1.setText("MORE BY: " + (Cholesterol - 240));
                            a = false;
                        } else {
                            t1.setText("INVALID INPUT");
                        }


                    }


                    //////////////////////////////////////


                    if (e2.getText().toString().isEmpty() == false) {

                        double trlglyceride = Double.parseDouble(e2.getText().toString());

                        if (trlglyceride >= 0 && trlglyceride <= 499) {
                            t2.setText("NORMAL");
                            b = true;

                        } else if (trlglyceride < 0) {
                            t2.setText("LESS BY: " + (0 - trlglyceride));
                            b = false;

                        } else if (trlglyceride > 499) {
                            t2.setText("MORE BY: " + (trlglyceride - 499));
                            b = false;
                        } else {
                            t2.setText("Invalid input");
                            b = false;

                        }

                    }
//


                    ///////////////////////////////////////////////////////


                    if (e3.getText().toString().isEmpty() == false) {

                        double Hdlc = Double.parseDouble(e3.getText().toString());

                        if (Hdlc >= 35 && Hdlc <= 60) {
                            t3.setText("NORMAL");
                            c = true;

                        } else if (Hdlc < 35) {
                            t3.setText("LESS BY: " + (35 - Hdlc));
                            c = false;

                        } else if (Hdlc > 60) {
                            t3.setText("MORE BY: " + (Hdlc - 60));
                            c = false;
                        } else {
                            t3.setText("Invalid input");
                            c = false;
                        }

                    }


                    /////////////////////////////////////////


                    if (e4.getText().toString().isEmpty() == false) {

                        float ldlc = Float.parseFloat(e4.getText().toString());

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


                    if (e5.getText().toString().isEmpty() == false) {
                        float vldlcL = Float.parseFloat(e5.getText().toString());

                        if (vldlcL >= 6.0 && vldlcL <= 38.0) {
                            t5.setText("NORMAL");
                            e = true;
                        } else if (vldlcL < 6.0) {
                            t5.setText("LESS BY:" + (6.0 - vldlcL));
                            e = false;

                        } else if (vldlcL > 38.0) {
                            t5.setText("MORE BY:" + (vldlcL - 38.0));
                            e = false;
                        } else {
                            t5.setText("Invalid input");
                            e = false;
                        }


                    }


                    //////////////////////////////////


                    if (e6.getText().toString().isEmpty() == false) {
                        float cho_hdl = Float.parseFloat(e6.getText().toString());

                        if (cho_hdl >= 3.5 && cho_hdl <= 5.0) {
                            t6.setText("NORMAL");
                            f = true;
                        } else if (cho_hdl < 3.5) {
                            t6.setText("LESS BY:" + (3.5 - cho_hdl));
                            f = false;

                        } else if (cho_hdl > 5.0) {
                            t6.setText("MORE BY:" + (cho_hdl - 5.0));
                            f = false;
                        } else {
                            t6.setText("Invalid input");
                            f = false;
                        }

                    }

                    ////////////////////////////////////


                    if (e7.getText().toString().isEmpty() == false) {
                        float ldl_hdl = Float.parseFloat(e7.getText().toString());

                        if (ldl_hdl >= 1.5 && ldl_hdl <= 3.5) {
                            t7.setText("NORMAL");
                            g = true;
                        } else if (ldl_hdl < 1.5) {
                            t7.setText("LESS BY:" + (1.5 - ldl_hdl));
                            g = false;

                        } else if (ldl_hdl > 3.5) {
                            t7.setText("MORE BY:" + (ldl_hdl - 3.5));
                            g = false;
                        } else {
                            t7.setText("Invalid input");
                            g = false;
                        }


                    }

                    ////////////////////////////////////


                    if (e8.getText().toString().isEmpty() == false) {
                        float Non_Hdl = Float.parseFloat(e8.getText().toString());

                        if (Non_Hdl >= 0 && Non_Hdl <= 160) {
                            t8.setText("NORMAL");
                            h = true;
                        } else if (Non_Hdl < 0) {
                            t8.setText("LESS BY:" + (0 - Non_Hdl));
                            h = false;

                        } else if (Non_Hdl > 160) {
                            t8.setText("MORE BY:" + (Non_Hdl - 160));
                            h = false;
                        } else {
                            t8.setText("Invalid input");
                            h = false;
                        }

                    }

                    ////////////////////////////////////////
                }

            }

        });


    }
}
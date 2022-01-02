package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class cbc extends AppCompatActivity {

    TextInputLayout ti1,ti2,ti3,ti4,ti5,ti6,ti7,ti8,ti9,ti10,ti11,ti12,ti13,ti14,ti15;
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15;
    MaterialButton check;
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
        setContentView(R.layout.cbc);





                ti1 = findViewById(R.id.WBCL);
                ti2 = findViewById(R.id.RBCL);
                ti3 = findViewById(R.id.PLCL);
                ti4 = findViewById(R.id.HMBL);
                ti5 = findViewById(R.id.PCVL);
                ti6 = findViewById(R.id.MCVL);
                ti7 = findViewById(R.id.MCHL);
                ti8 = findViewById(R.id.MCHCL);
                ti9 = findViewById(R.id.RCDL);
                ti10 = findViewById(R.id.NTL);
                ti11 = findViewById(R.id.LPL);
                ti12 = findViewById(R.id.EPL);
                ti13 = findViewById(R.id.PML);
                ti14 = findViewById(R.id.MCL);
                ti15 = findViewById(R.id.BPL);









                e1 = findViewById(R.id.WBC);
                e2 = findViewById(R.id.RBC);
                e3= findViewById(R.id.PLC);
                e4 = findViewById(R.id.HMB);
                e5 = findViewById(R.id.PCV);
                e6 = findViewById(R.id.MCV);
                e7 = findViewById(R.id.MCH);
                e8 = findViewById(R.id.MCHC);
                e9 = findViewById(R.id.RCD);
                e10 = findViewById(R.id.NT);
                e11 = findViewById(R.id.LP);
                e12 = findViewById(R.id.EP);
                e13 = findViewById(R.id.PM);
                e14 = findViewById(R.id.MC);
                e15 = findViewById(R.id.BP);




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





                check = findViewById(R.id.check);



                check.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if(e1.getText().toString().isEmpty()== true || e2.getText().toString().isEmpty() == true || e3.getText().toString().isEmpty()==true
                                && e4.getText().toString().isEmpty()== true || e5.getText().toString().isEmpty()==true || e6.getText().toString().isEmpty()==true
                                && e7.getText().toString().isEmpty()==true || e8.getText().toString().isEmpty()==true || e9.getText().toString().isEmpty()==true
                                && e10.getText().toString().isEmpty()==true || e11.getText().toString().isEmpty()==true || e12.getText().toString().isEmpty()==true
                                && e13.getText().toString().isEmpty()==true || e14.getText().toString().isEmpty()==true || e15.getText().toString().isEmpty()==true)
                        {
                            if(e1.getText().toString().isEmpty()== true)
                            {
                                Toast.makeText(getApplicationContext(), "Enter vlaue for White Blood Cell", Toast.LENGTH_SHORT).show();
                            }

                            if(e2.getText().toString().isEmpty()== true)
                            {
                                Toast.makeText(getApplicationContext(), "Enter vlaue for Red Blood Cell", Toast.LENGTH_SHORT).show();
                            }

                            if(e3.getText().toString().isEmpty()== true)
                            {
                                Toast.makeText(getApplicationContext(), "Enter vlaue for Platelet Count", Toast.LENGTH_SHORT).show();
                            }

                            if(e4.getText().toString().isEmpty()== true)
                            {
                                Toast.makeText(getApplicationContext(), "Enter vlaue for Heamoglobin", Toast.LENGTH_SHORT).show();
                            }

                            if(e5.getText().toString().isEmpty()== true)
                            {
                                Toast.makeText(getApplicationContext(), "Enter vlaue for PCV", Toast.LENGTH_SHORT).show();
                            }

                            if(e6.getText().toString().isEmpty()== true)
                            {
                                Toast.makeText(getApplicationContext(), "Enter vlaue for Mean Cell Volume", Toast.LENGTH_SHORT).show();
                            }

                            if(e7.getText().toString().isEmpty()== true)
                            {
                                Toast.makeText(getApplicationContext(), "Enter vlaue for Mean Cell Haemoglobin", Toast.LENGTH_SHORT).show();
                            }

                            if(e8.getText().toString().isEmpty()== true)
                            {
                                Toast.makeText(getApplicationContext(), "Enter vlaue for Mean Cell HB CONC", Toast.LENGTH_SHORT).show();
                            }

                            if(e9.getText().toString().isEmpty()== true)
                            {
                                Toast.makeText(getApplicationContext(), "Enter vlaue for Red Cell Dist Width", Toast.LENGTH_SHORT).show();
                            }

                            if(e10.getText().toString().isEmpty()== true)
                            {
                                Toast.makeText(getApplicationContext(), "Enter vlaue for Neutrophils", Toast.LENGTH_SHORT).show();
                            }

                            if(e11.getText().toString().isEmpty()== true)
                            {
                                Toast.makeText(getApplicationContext(), "Enter vlaue for Lymphoctye", Toast.LENGTH_SHORT).show();
                            }

                            if(e12.getText().toString().isEmpty()== true)
                            {
                                Toast.makeText(getApplicationContext(), "Enter vlaue for Eosinophil", Toast.LENGTH_SHORT).show();
                            }

                            if(e13.getText().toString().isEmpty()== true)
                            {
                                Toast.makeText(getApplicationContext(), "Enter vlaue for Ploymorphs", Toast.LENGTH_SHORT).show();
                            }

                            if(e14.getText().toString().isEmpty()== true)
                            {
                                Toast.makeText(getApplicationContext(), "Enter vlaue for Monocytes", Toast.LENGTH_SHORT).show();
                            }

                            if(e15.getText().toString().isEmpty()== true)
                            {
                                Toast.makeText(getApplicationContext(), "Enter vlaue for Basophils", Toast.LENGTH_SHORT).show();
                            }


                        }

                        else if(e1.getText().toString().isEmpty()== true && e2.getText().toString().isEmpty() == true && e3.getText().toString().isEmpty()==true
                                && e4.getText().toString().isEmpty()== true && e5.getText().toString().isEmpty()==true && e6.getText().toString().isEmpty()==true
                                && e7.getText().toString().isEmpty()==true && e8.getText().toString().isEmpty()==true && e9.getText().toString().isEmpty()==true
                                && e10.getText().toString().isEmpty()==true && e11.getText().toString().isEmpty()==true && e12.getText().toString().isEmpty()==true
                                && e13.getText().toString().isEmpty()==true && e14.getText().toString().isEmpty()==true && e15.getText().toString().isEmpty()==true)
                        {
                            Toast.makeText(getApplicationContext(), "All boxes are compulsory", Toast.LENGTH_SHORT).show();


                        }

                        if(e1.getText().toString().isEmpty()== false && e2.getText().toString().isEmpty() == false && e3.getText().toString().isEmpty()==false
                                && e4.getText().toString().isEmpty()== false && e5.getText().toString().isEmpty()==false && e6.getText().toString().isEmpty()==false
                                && e7.getText().toString().isEmpty()==false && e8.getText().toString().isEmpty()==false && e9.getText().toString().isEmpty()==false
                                && e10.getText().toString().isEmpty()==false && e11.getText().toString().isEmpty()==false && e12.getText().toString().isEmpty()==false
                                && e13.getText().toString().isEmpty()==false && e14.getText().toString().isEmpty()==false && e15.getText().toString().isEmpty()==false)
                        {
                            if(e1.getText().toString().isEmpty()==false)
                            {
                                double wbc = Double.parseDouble(e1.getText().toString());

                                String wbct;

                                if(wbc == 10)
                                {
                                    wbct="you entered 10";
                                    t1.setText(wbct);
                                }

                                else if (wbc >= 4000 && wbc <= 10000)
                                {
                                    t1.setText("NORMAL");
                                    a = true;
                                }


                                else if (wbc < 4000)
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








                            if(e2.getText().toString().isEmpty()==false)

                            {

                                double rbc = Double.parseDouble(e2.getText().toString());

                                if (rbc >= 4.2 && rbc <= 5.9) {
                                    t2.setText("NORMAL");
                                    b = true;

                                } else if (rbc < 4.2) {
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
//



                            ///////////////////////////////////////////////////////






                            if(e3.getText().toString().isEmpty()==false)

                            {

                                double pc = Double.parseDouble(e3.getText().toString());

                                if (pc >= 150000 && pc <= 450000) {
                                    t3.setText("NORMAL");
                                    c = true;

                                } else if (pc < 150000) {
                                    t3.setText("LESS BY: " + (150000 - pc));
                                    c = false;

                                } else if (pc > 450000) {
                                    t3.setText("MORE BY: " + (pc - 450000));
                                    c = false;
                                } else {
                                    t3.setText("Invalid input");
                                    c = false;
                                }

                            }


                            /////////////////////////////////////////







                            if(e4.getText().toString().isEmpty()==false)

                            {

                                float hm = Float.parseFloat(e4.getText().toString());

                                if (hm >= 13.5 && hm <= 17.5) {
                                    t4.setText("NORMAL");
                                    d = true;
                                } else if (hm < 13.5) {
                                    t4.setText("LESS BY:" + (14.0 - hm));
                                    d = false;

                                } else if (hm > 17.5) {
                                    t4.setText("MORE BY:" + (hm - 15.0));
                                    d = false;
                                } else {
                                    t4.setText("Invalid input");
                                    d = false;
                                }

                            }

                            //////////////////////////////////////







                            if(e5.getText().toString().isEmpty()==false)

                            {
                                float pcv = Float.parseFloat(e5.getText().toString());

                                if (pcv >= 42 && pcv <= 52) {
                                    t5.setText("NORMAL");
                                    e = true;
                                } else if (pcv < 42) {
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







                            if(e6.getText().toString().isEmpty()==false)

                            {
                                float mcv = Float.parseFloat(e6.getText().toString());

                                if (mcv >= 80 && mcv <= 100) {
                                    t6.setText("NORMAL");
                                    f = true;
                                } else if (mcv < 80) {
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






                            if(e7.getText().toString().isEmpty()==false)

                            {
                                float mch = Float.parseFloat(e7.getText().toString());

                                if (mch >= 27.0 && mch <= 32.0) {
                                    t7.setText("NORMAL");
                                    g = true;
                                } else if (mch < 32.0) {
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





                            if(e8.getText().toString().isEmpty()==false)

                            {
                                float mchc = Float.parseFloat(e8.getText().toString());

                                if (mchc >= 32.0 && mchc <= 36.0) {
                                    t8.setText("NORMAL");
                                    h = true;
                                } else if (mchc < 32.0) {
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






                            if(e9.getText().toString().isEmpty()==false)

                            {
                                float rdw = Float.parseFloat(e9.getText().toString());

                                if (rdw >= 11.5 && rdw <= 14.5) {
                                    t9.setText("NORMAL");
                                    i = true;
                                } else if (rdw < 11.5) {
                                    t9.setText("LESS BY:" + (11.5 - rdw));
                                    i = false;

                                } else if (rdw > 14.5) {
                                    t9.setText("MORE BY:" + (rdw - 14.5));
                                    i = false;
                                } else {
                                    t9.setText("Invalid input");
                                    i = false;
                                }

                            }

                            ////////////////////////////////////////







                            if(e10.getText().toString().isEmpty()==false)

                            {
                                float ntpl = Float.parseFloat(e10.getText().toString());

                                if (ntpl >= 33 && ntpl <= 77) {
                                    t10.setText("NORMAL");
                                    j = true;
                                } else if (ntpl < 33) {
                                    t10.setText("LESS BY:" + (33 - ntpl));
                                    j = false;

                                } else if (ntpl > 77) {
                                    t10.setText("MORE BY:" + (ntpl - 77));
                                    j = false;
                                } else {
                                    t10.setText("Invalid input");
                                    j = false;
                                }

                            }


                            ///////////////////////////////////////









                            if(e11.getText().toString().isEmpty()==false)

                            {
                                float lpct = Float.parseFloat(e11.getText().toString());

                                if (lpct >= 13 && lpct <= 52) {
                                    t11.setText("NORMAL");
                                    k = true;
                                } else if (lpct < 13) {
                                    t11.setText("LESS BY:" + (13 - lpct));
                                    k = false;

                                } else if (lpct > 52) {
                                    t11.setText("MORE BY:" + (lpct - 52));
                                    k = false;
                                } else {
                                    t11.setText("Invalid input");
                                    k = false;
                                }
                            }

                            /////////////////////////////////////







                            if(e12.getText().toString().isEmpty()==false)

                            {

                                float espl = Float.parseFloat(e12.getText().toString());

                                if (espl >= 0 && espl <= 5) {
                                    t12.setText("NORMAL");
                                    l = true;
                                } else if (espl < 0) {
                                    t12.setText("LESS BY:" + (0 - espl));
                                    l = false;

                                } else if (espl > 5) {
                                    t12.setText("MORE BY:" + (espl - 5));
                                    l = false;
                                } else {
                                    t12.setText("Invalid input");
                                    l = false;
                                }
                            }
                            ///////////////////////////////////





                            if(e13.getText().toString().isEmpty()==false)

                            {
                                float plmps = Float.parseFloat(e13.getText().toString());

                                if (plmps >= 40 && plmps <= 80) {
                                    t13.setText("NORMAL");
                                    m = true;
                                } else if (plmps < 40) {
                                    t13.setText("LESS BY:" + (40 - plmps));
                                    m = false;

                                } else if (plmps > 80) {
                                    t13.setText("MORE BY:" + (plmps - 80));
                                    m = false;
                                } else {
                                    t13.setText("Invalid input");
                                    m = false;
                                }
                            }
                            ////////////////////////////////////////////////








                            if(e14.getText().toString().isEmpty()==false)
                            {
                                float mnct = Float.parseFloat(e14.getText().toString());

                                if (mnct >= 0 && mnct <= 10) {
                                    t14.setText("NORMAL");
                                    n = true;
                                } else if (mnct < 0) {
                                    t14.setText("LESS BY:" + (0 - mnct));
                                    n = false;

                                } else if (mnct > 10) {
                                    t14.setText("MORE BY:" + (mnct - 10));
                                    n = false;
                                } else {
                                    t14.setText("Invalid input");
                                    n = false;
                                }

                            }
                            ////////////////////////////////////////





                            if(e15.getText().toString().isEmpty()==false)
                            {
                                float bspl = Float.parseFloat(e15.getText().toString());

                                if (bspl >= 0 && bspl <= 2) {
                                    t15.setText("NORMAL");
                                    o = true;
                                } else if (bspl < 0) {
                                    t15.setText("LESS BY:" + (0 - bspl));
                                    o = false;

                                } else if (bspl > 10) {
                                    t15.setText("MORE BY:" + (bspl - 2));
                                    o = false;
                                } else {
                                    t15.setText("Invalid input");
                                    o = false;
                                }

                            }


                        }



//                {
//                    if(e1.getText().toString().isEmpty()==true)
//                    {
//                        Toast.makeText(getApplicationContext(), "enter value", Toast.LENGTH_SHORT).show();
//                    }
//
//                   else if(e2.getText().toString().isEmpty()==true)
//                    {
//                        Toast.makeText(getApplicationContext(), "enter value", Toast.LENGTH_SHORT).show();
//                    }
//
//                   else if(e3.getText().toString().isEmpty()==true)
//                    {
//                        Toast.makeText(getApplicationContext(), "enter value", Toast.LENGTH_SHORT).show();
//                    }
//
//                   else if(e4.getText().toString().isEmpty()==true)
//                    {
//                        Toast.makeText(getApplicationContext(), "enter value", Toast.LENGTH_SHORT).show();
//                    }
//
//                   else if(e5.getText().toString().isEmpty()==true)
//                    {
//                        Toast.makeText(getApplicationContext(), "enter value", Toast.LENGTH_SHORT).show();
//                    }
//
//                   else if(e6.getText().toString().isEmpty()==true)
//                    {
//                        Toast.makeText(getApplicationContext(), "enter value", Toast.LENGTH_SHORT).show();
//                    }
//
//                   else if(e7.getText().toString().isEmpty()==true)
//                    {
//                        Toast.makeText(getApplicationContext(), "enter value", Toast.LENGTH_SHORT).show();
//                    }
//
//                   else if(e8.getText().toString().isEmpty()==true)
//                    {
//                        Toast.makeText(getApplicationContext(), "enter value", Toast.LENGTH_SHORT).show();
//                    }
//
//
//                   else if(e9.getText().toString().isEmpty()==true)
//                    {
//                        Toast.makeText(getApplicationContext(), "enter value", Toast.LENGTH_SHORT).show();
//                    }
//
//                   else if(e10.getText().toString().isEmpty()==true)
//                    {
//                        Toast.makeText(getApplicationContext(), "enter value", Toast.LENGTH_SHORT).show();
//                    }
//
//                   else if(e11.getText().toString().isEmpty()==true)
//                    {
//                        Toast.makeText(getApplicationContext(), "enter value", Toast.LENGTH_SHORT).show();
//                    }
//
//                   else if(e12.getText().toString().isEmpty()==true)
//                    {
//                        Toast.makeText(getApplicationContext(), "enter value", Toast.LENGTH_SHORT).show();
//                    }
//
//
//                   else if(e13.getText().toString().isEmpty()==true)
//                    {
//                        Toast.makeText(getApplicationContext(), "enter value", Toast.LENGTH_SHORT).show();
//                    }
//
//
//                   else if(e14.getText().toString().isEmpty()==true)
//                    {
//                        Toast.makeText(getApplicationContext(), "enter value", Toast.LENGTH_SHORT).show();
//                    }
//
//                  else if(e15.getText().toString().isEmpty()==true)
//                    {
//                        Toast.makeText(getApplicationContext(), "enter value", Toast.LENGTH_SHORT).show();
//                    }

                        // }











                    }


                });







    }
}
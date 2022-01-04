package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class cbc extends AppCompatActivity {

    TextInputLayout ti1, ti2, ti3, ti4, ti5, ti6, ti7, ti8, ti9, ti10, ti11, ti12, ti13, ti14, ti15;
    EditText e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15;
    MaterialButton check;


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
        e3 = findViewById(R.id.PLC);
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



        check = findViewById(R.id.check);


        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (e1.getText().toString().isEmpty() == true || e2.getText().toString().isEmpty() == true || e3.getText().toString().isEmpty() == true
                        && e4.getText().toString().isEmpty() == true || e5.getText().toString().isEmpty() == true || e6.getText().toString().isEmpty() == true
                        && e7.getText().toString().isEmpty() == true || e8.getText().toString().isEmpty() == true || e9.getText().toString().isEmpty() == true
                        && e10.getText().toString().isEmpty() == true || e11.getText().toString().isEmpty() == true || e12.getText().toString().isEmpty() == true
                        && e13.getText().toString().isEmpty() == true || e14.getText().toString().isEmpty() == true || e15.getText().toString().isEmpty() == true) {
                    if (e1.getText().toString().isEmpty() == true) {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for White Blood Cell", Toast.LENGTH_SHORT).show();
                    }

                    if (e2.getText().toString().isEmpty() == true) {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for Red Blood Cell", Toast.LENGTH_SHORT).show();
                    }

                    if (e3.getText().toString().isEmpty() == true) {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for Platelet Count", Toast.LENGTH_SHORT).show();
                    }

                    if (e4.getText().toString().isEmpty() == true) {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for Heamoglobin", Toast.LENGTH_SHORT).show();
                    }

                    if (e5.getText().toString().isEmpty() == true) {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for PCV", Toast.LENGTH_SHORT).show();
                    }

                    if (e6.getText().toString().isEmpty() == true) {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for Mean Cell Volume", Toast.LENGTH_SHORT).show();
                    }

                    if (e7.getText().toString().isEmpty() == true) {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for Mean Cell Haemoglobin", Toast.LENGTH_SHORT).show();
                    }

                    if (e8.getText().toString().isEmpty() == true) {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for Mean Cell HB CONC", Toast.LENGTH_SHORT).show();
                    }

                    if (e9.getText().toString().isEmpty() == true) {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for Red Cell Dist Width", Toast.LENGTH_SHORT).show();
                    }

                    if (e10.getText().toString().isEmpty() == true) {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for Neutrophils", Toast.LENGTH_SHORT).show();
                    }

                    if (e11.getText().toString().isEmpty() == true) {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for Lymphoctye", Toast.LENGTH_SHORT).show();
                    }

                    if (e12.getText().toString().isEmpty() == true) {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for Eosinophil", Toast.LENGTH_SHORT).show();
                    }

                    if (e13.getText().toString().isEmpty() == true) {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for Ploymorphs", Toast.LENGTH_SHORT).show();
                    }

                    if (e14.getText().toString().isEmpty() == true) {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for Monocytes", Toast.LENGTH_SHORT).show();
                    }

                    if (e15.getText().toString().isEmpty() == true) {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for Basophils", Toast.LENGTH_SHORT).show();
                    }


                } else if (e1.getText().toString().isEmpty() == true && e2.getText().toString().isEmpty() == true && e3.getText().toString().isEmpty() == true
                        && e4.getText().toString().isEmpty() == true && e5.getText().toString().isEmpty() == true && e6.getText().toString().isEmpty() == true
                        && e7.getText().toString().isEmpty() == true && e8.getText().toString().isEmpty() == true && e9.getText().toString().isEmpty() == true
                        && e10.getText().toString().isEmpty() == true && e11.getText().toString().isEmpty() == true && e12.getText().toString().isEmpty() == true
                        && e13.getText().toString().isEmpty() == true && e14.getText().toString().isEmpty() == true && e15.getText().toString().isEmpty() == true) {
                    Toast.makeText(getApplicationContext(), "All boxes are compulsory", Toast.LENGTH_SHORT).show();


                }

                if (e1.getText().toString().isEmpty() == false && e2.getText().toString().isEmpty() == false && e3.getText().toString().isEmpty() == false
                        && e4.getText().toString().isEmpty() == false && e5.getText().toString().isEmpty() == false && e6.getText().toString().isEmpty() == false
                        && e7.getText().toString().isEmpty() == false && e8.getText().toString().isEmpty() == false && e9.getText().toString().isEmpty() == false
                        && e10.getText().toString().isEmpty() == false && e11.getText().toString().isEmpty() == false && e12.getText().toString().isEmpty() == false
                        && e13.getText().toString().isEmpty() == false && e14.getText().toString().isEmpty() == false && e15.getText().toString().isEmpty() == false)
                {

                    Double wbc = Double.parseDouble(e1.getText().toString());
                    Double rbc = Double.parseDouble(e2.getText().toString());
                    Double plc = Double.parseDouble(e3.getText().toString());
                    Double hmb = Double.parseDouble(e4.getText().toString());
                    Double pcv = Double.parseDouble(e5.getText().toString());
                    Double mcv = Double.parseDouble(e6.getText().toString());
                    Double mch = Double.parseDouble(e7.getText().toString());
                    Double mchc = Double.parseDouble(e8.getText().toString());
                    Double rcd = Double.parseDouble(e9.getText().toString());
                    Double nt = Double.parseDouble(e10.getText().toString());
                    Double lp = Double.parseDouble(e11.getText().toString());
                    Double ep = Double.parseDouble(e12.getText().toString());
                    Double pm = Double.parseDouble(e13.getText().toString());
                    Double mc = Double.parseDouble(e14.getText().toString());
                    Double bp = Double.parseDouble(e15.getText().toString());


                    Intent cbci = new Intent(cbc.this,CBCTABEL.class);

                    cbci.putExtra("wbc",wbc);
                    cbci.putExtra("rbc",rbc);
                    cbci.putExtra("plc",plc);
                    cbci.putExtra("hmb",hmb);
                    cbci.putExtra("pcv",pcv);
                    cbci.putExtra("mcv",mcv);
                    cbci.putExtra("mch",mch);
                    cbci.putExtra("mchc",mchc);
                    cbci.putExtra("rcd",rcd);
                    cbci.putExtra("nt",nt);
                    cbci.putExtra("lp",lp);
                    cbci.putExtra("ep",ep);
                    cbci.putExtra("pm",pm);
                    cbci.putExtra("mc",mc);
                    cbci.putExtra("bp",bp);

                    startActivity(cbci);
                }


            }


        });
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
package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class sgpt extends AppCompatActivity {

    TextInputLayout ti1,ti2,ti3,ti4,ti5,ti6,ti7,ti8,ti9,ti10;
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
    MaterialButton check;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgpt);



        ti1 = findViewById(R.id.BITL);
        ti2 = findViewById(R.id.BIUL);
        ti3 = findViewById(R.id.BICL);
        ti4 = findViewById(R.id.SGOTL);
        ti5 = findViewById(R.id.SGPTL);
        ti6 = findViewById(R.id.APL);
        ti7 = findViewById(R.id.TPL);
        ti8 = findViewById(R.id.ASL);
        ti9 = findViewById(R.id.GL);
        ti10 = findViewById(R.id.AGL);





        e1 = findViewById(R.id.BIT);
        e2 = findViewById(R.id.BIU);
        e3= findViewById(R.id.BIC);
        e4 = findViewById(R.id.SGOT);
        e5 = findViewById(R.id.SGPT);
        e6 = findViewById(R.id.AP);
        e7 = findViewById(R.id.TP);
        e8 = findViewById(R.id.AS);
        e9 = findViewById(R.id.G);
        e10 = findViewById(R.id.AG);


        check = findViewById(R.id.check);











        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(e1.getText().toString().isEmpty()== true || e2.getText().toString().isEmpty() == true || e3.getText().toString().isEmpty()==true
                        && e4.getText().toString().isEmpty()== true || e5.getText().toString().isEmpty()==true || e6.getText().toString().isEmpty()==true
                        && e7.getText().toString().isEmpty()==true || e8.getText().toString().isEmpty()==true || e9.getText().toString().isEmpty()==true
                        && e10.getText().toString().isEmpty()==true)
                {
                    if(e1.getText().toString().isEmpty()== true)
                    {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for BILIRUBIN (TOTAL)", Toast.LENGTH_SHORT).show();
                    }

                    if(e2.getText().toString().isEmpty()== true)
                    {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for BILIRUBIN (UNCONJUGATED)", Toast.LENGTH_SHORT).show();
                    }

                    if(e3.getText().toString().isEmpty()== true)
                    {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for BILIRUBIN (CONJUGATED)", Toast.LENGTH_SHORT).show();
                    }

                    if(e4.getText().toString().isEmpty()== true)
                    {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for SGOT", Toast.LENGTH_SHORT).show();
                    }

                    if(e5.getText().toString().isEmpty()== true)
                    {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for SGPT", Toast.LENGTH_SHORT).show();
                    }

                    if(e6.getText().toString().isEmpty()== true)
                    {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for ALKALINE PHOSPHATASE", Toast.LENGTH_SHORT).show();
                    }

                    if(e7.getText().toString().isEmpty()== true)
                    {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for TOTAL PROTEIN", Toast.LENGTH_SHORT).show();
                    }

                    if(e8.getText().toString().isEmpty()== true)
                    {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for ALBUMIN,SERUM", Toast.LENGTH_SHORT).show();
                    }

                    if(e9.getText().toString().isEmpty()== true)
                    {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for GLOBULIN", Toast.LENGTH_SHORT).show();
                    }

                    if(e10.getText().toString().isEmpty()== true)
                    {
                        Toast.makeText(getApplicationContext(), "Enter vlaue for A:G", Toast.LENGTH_SHORT).show();
                    }


                }

                else if(e1.getText().toString().isEmpty()== true && e2.getText().toString().isEmpty() == true && e3.getText().toString().isEmpty()==true
                        && e4.getText().toString().isEmpty()== true && e5.getText().toString().isEmpty()==true && e6.getText().toString().isEmpty()==true
                        && e7.getText().toString().isEmpty()==true && e8.getText().toString().isEmpty()==true && e9.getText().toString().isEmpty()==true
                        && e10.getText().toString().isEmpty()==true)
                {
                    Toast.makeText(getApplicationContext(), "All boxes are compulsory", Toast.LENGTH_SHORT).show();


                }






                if(e1.getText().toString().isEmpty()== false && e2.getText().toString().isEmpty() == false && e3.getText().toString().isEmpty()==false
                        && e4.getText().toString().isEmpty()== false && e5.getText().toString().isEmpty()==false && e6.getText().toString().isEmpty()==false
                        && e7.getText().toString().isEmpty()==false && e8.getText().toString().isEmpty()==false && e9.getText().toString().isEmpty()==false
                        && e10.getText().toString().isEmpty()==false)


                {






                    Double bit = Double.parseDouble(e1.getText().toString());
                    Double biu = Double.parseDouble(e2.getText().toString());
                    Double bic = Double.parseDouble(e3.getText().toString());
                    Double sgot = Double.parseDouble(e4.getText().toString());
                    Double sgpt = Double.parseDouble(e5.getText().toString());
                    Double ap = Double.parseDouble(e6.getText().toString());
                    Double tp = Double.parseDouble(e7.getText().toString());
                    Double as = Double.parseDouble(e8.getText().toString());
                    Double g = Double.parseDouble(e9.getText().toString());
                    Double ag = Double.parseDouble(e10.getText().toString());

                    Intent sgpti = new Intent(sgpt.this,SGPTTABLE.class);


                    sgpti.putExtra("bit",bit);
                    sgpti.putExtra("biu",biu);
                    sgpti.putExtra("bic",bic);
                    sgpti.putExtra("sgot",sgot);
                    sgpti.putExtra("sgpt",sgpt);
                    sgpti.putExtra("ap",ap);
                    sgpti.putExtra("tp",tp);
                    sgpti.putExtra("as",as);
                    sgpti.putExtra("g",g);
                    sgpti.putExtra("ag",ag);

                    startActivity(sgpti);





                }


            }


        });















    }
}
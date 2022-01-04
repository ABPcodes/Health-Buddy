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

public class lipid123 extends AppCompatActivity {


    TextInputLayout ti1,ti2,ti3,ti4,ti5,ti6,ti7,ti8;
    EditText e1,e2,e3,e4,e5,e6,e7,e8;
    MaterialButton check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lipid123);


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
                        && e7.getText().toString().isEmpty()==false && e8.getText().toString().isEmpty()==false)
                {
                    Double chl = Double.parseDouble(e1.getText().toString());
                    Double til = Double.parseDouble(e2.getText().toString());
                    Double hdlc = Double.parseDouble(e3.getText().toString());
                    Double ldlc = Double.parseDouble(e4.getText().toString());
                    Double vldlc = Double.parseDouble(e5.getText().toString());
                    Double chohdl = Double.parseDouble(e6.getText().toString());
                    Double ldlhdl = Double.parseDouble(e7.getText().toString());
                    Double non_hdl = Double.parseDouble(e8.getText().toString());




                    Intent lipids = new Intent(lipid123.this,LIPIDTABLE123.class);
                    lipids.putExtra("chl",chl);
                    lipids.putExtra("til",til);
                    lipids.putExtra("hdlc",hdlc);
                    lipids.putExtra("ldlc",ldlc);
                    lipids.putExtra("vldlc",vldlc);
                    lipids.putExtra("chohdl",chohdl);
                    lipids.putExtra("ldlhdl",ldlhdl);
                    lipids.putExtra("non_hdl",non_hdl);

                    startActivity(lipids);

                    ////////////////////////////////////////
                }

            }

        });
    }
}
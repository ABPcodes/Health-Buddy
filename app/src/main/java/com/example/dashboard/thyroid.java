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

public class thyroid extends AppCompatActivity {

    TextInputLayout ti1,ti2,ti3,ti4;
    EditText e1,e2,e3,e4;
    MaterialButton check;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thyroid);

        ti1 = findViewById(R.id.TSHl);
        ti2 = findViewById(R.id.Thyroxin_T4L);
        ti3 = findViewById(R.id.T3_UptakeL);
        ti4 = findViewById(R.id.FTIL);


        e1 = findViewById(R.id.TSH);
        e2 = findViewById(R.id.Thyroxin_T4);
        e3 = findViewById(R.id.T3_Uptake);
        e4 = findViewById(R.id.FTI);



        check = findViewById(R.id.check);

        check.setOnClickListener(new View.OnClickListener()
        {


            @Override
            public void onClick(View v)
            {

                if(e1.getText().toString().isEmpty()== true || e2.getText().toString().isEmpty() == true || e3.getText().toString().isEmpty()==true
                        && e4.getText().toString().isEmpty()== true)
                {
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
                }




                else if(e1.getText().toString().isEmpty()== true && e2.getText().toString().isEmpty() == true && e3.getText().toString().isEmpty()==true
                        && e4.getText().toString().isEmpty()== true)
                {
                    Toast.makeText(getApplicationContext(), "All boxes are compulsory", Toast.LENGTH_SHORT).show();
                }




                if(e1.getText().toString().isEmpty()== false && e2.getText().toString().isEmpty() == false && e3.getText().toString().isEmpty()==false
                        && e4.getText().toString().isEmpty()== false)
                {
                    Double TSH = Double.parseDouble(e1.getText().toString());
                    Double TYI = Double.parseDouble(e2.getText().toString());
                    Double T3U = Double.parseDouble(e3.getText().toString());
                    Double FIT = Double.parseDouble(e4.getText().toString());


                    Intent thyroids = new Intent(thyroid.this,THYROIDTABLE.class);
                    thyroids.putExtra("TSH",TSH);
                    thyroids.putExtra("TYI",TYI);
                    thyroids.putExtra("T3U",T3U);
                    thyroids.putExtra("FIT",FIT);

                    startActivity(thyroids);


                }

            }
        });

    }
}
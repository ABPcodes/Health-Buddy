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

public class crp extends AppCompatActivity {

    TextInputLayout ti1;
    EditText e1;
    MaterialButton check;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crp);


        ti1 = findViewById(R.id.CRPl);

        e1 = findViewById(R.id.CRP);


        check = findViewById(R.id.check);



        check.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                if(e1.getText().toString().isEmpty()== true)
                {

                    Toast.makeText(getApplicationContext(), "Enter vlaue for White Blood Cell", Toast.LENGTH_SHORT).show();

                }
                else if(e1.getText().toString().isEmpty()== false) {
                    Double CRP = Double.parseDouble(e1.getText().toString());


                    Intent CRPi = new Intent(crp.this, CRPTABEL.class);

                    CRPi.putExtra("CRP", CRP);

                    startActivity(CRPi);
                }
            }
        });
    }
}
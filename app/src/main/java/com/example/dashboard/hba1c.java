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

public class hba1c extends AppCompatActivity {


    TextInputLayout ghb;
    EditText ghbn;
    MaterialButton check;
    // TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hba1c);

        ghb = findViewById(R.id.ghb);
        ghbn = findViewById(R.id.ghbn);
        check = findViewById(R.id.check);
        // tv = findViewById(R.id.textView);


        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ghbn.getText().toString().isEmpty() == true) {
                    Toast.makeText(getApplicationContext(), "enter valuev for glycosylated", Toast.LENGTH_SHORT).show();
                } else if (ghbn.getText().toString().isEmpty() == false) {


                    Double gly = Double.parseDouble(ghbn.getText().toString());

                    Intent hba1ci = new Intent(hba1c.this, HBA1CTABLE.class);

                    hba1ci.putExtra("glycosylated", gly);

                    startActivity(hba1ci);




                }
            }


        });
    }
}
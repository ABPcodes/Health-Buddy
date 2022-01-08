package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputLayout;

public class fastingsugar extends AppCompatActivity {


    TextInputLayout fpgl;
    EditText fpg;
    MaterialButton check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fastingsugar);

        fpg = findViewById(R.id.fpg);
        fpgl = findViewById(R.id.fpgl);
        check = findViewById(R.id.check);





        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {



                if(fpg.getText().toString().isEmpty()==true)
                {
                    Toast.makeText(getApplicationContext(), "Enter value for FPG", Toast.LENGTH_SHORT).show();
                }


                else if(fpg.getText().toString().isEmpty()==false)
                {
                   Double FPG = Double.parseDouble(fpg.getText().toString());

                   Intent fsi = new Intent(fastingsugar.this, FASTINGSUGARTABLE.class);


                   fsi.putExtra("FPG", FPG);

                   startActivity(fsi);

                }








            }



        });






    }
}
package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class general_sugar extends AppCompatActivity {


    LinearLayout HBA1C;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_sugar);

        HBA1C = (LinearLayout) findViewById(R.id.hba1c);
        HBA1C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),hba1c.class);
                startActivity(intent2);
            }
        });




    }
}
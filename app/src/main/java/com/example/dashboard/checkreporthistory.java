package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class checkreporthistory extends AppCompatActivity {



    Button crphistory,thyroidhistory,lipidhistory,hba1chistory,fastingsugarhistory,sgpthistory, cbchistory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkreporthistory);




        crphistory = (Button) findViewById(R.id.crphistory);
        thyroidhistory = (Button) findViewById(R.id.thyroidhistory);
        lipidhistory = (Button) findViewById(R.id.lipidhistory);
        hba1chistory = (Button) findViewById(R.id.hba1chistory);
        fastingsugarhistory = (Button) findViewById(R.id.fastingsugarhistory);
        sgpthistory = (Button) findViewById(R.id.sgpthistory);
        cbchistory = (Button) findViewById(R.id.cbchistory);



        crphistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),crprcv.class);
                startActivity(intent);
            }
        });


        thyroidhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),thyroidrcv.class);
                startActivity(intent);
            }
        });

        lipidhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),lipidrcv.class);
                startActivity(intent);
            }
        });

        hba1chistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),hba1crcv.class);
                startActivity(intent);
            }
        });

        fastingsugarhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),fastingsugarrcv.class);
                startActivity(intent);
            }
        });


        sgpthistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),sgptrcv.class);
                startActivity(intent);
            }
        });

        cbchistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),cbcrcv.class);
                startActivity(intent);
            }
        });









    }
}
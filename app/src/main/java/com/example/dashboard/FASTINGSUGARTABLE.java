package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FASTINGSUGARTABLE extends AppCompatActivity {



    TextView t1,t2;
    boolean a =true;
    private FirebaseAuth mAuth;
    FirebaseDatabase rootNode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fastingsugartable);



        t1 = findViewById(R.id.textView1500);
        t2 = findViewById(R.id.dipoutput);

        Double FPG;

        Intent fst = getIntent();

        FPG = fst.getDoubleExtra("FPG", 0);

String fastingsugardb = String.valueOf(FPG);


        if (FPG != null)

        {



        if(FPG<0)
        {
            //Toast.makeText(getApplicationContext(), "Please enter a valid input", Toast.LENGTH_SHORT).show();
            t1.setText(" INVALID INPUT");
            a = false;
        }
        if (FPG>=0 && FPG<=55)
        {
            t1.setText("DANGEROUSLY LOW");
            a = false;
        }
        if (FPG>=56 && FPG<=99)
        {
            t1.setText("NORMAL");
            a = true;
        }
        if (FPG>=100 && FPG<=126)
        {
            t1.setText("INCREASED RISK OF DIABIATES");
            a = false;
        }
        if (FPG>126)
        {
            t1.setText("DIABETIES");
            a = false;
        }


        }

        if(a == true)
        {
            t2.setText("CONGRATES! YOUR REPORT IS NORMAL");
        }

        else
        {
            t2.setText("Your Report Is Not Normal");
        }


        rootNode = FirebaseDatabase.getInstance();
        reference = rootNode.getReference("user");
        UserHelperClassFastingSugar helperClassFastingSugar = new UserHelperClassFastingSugar(fastingsugardb);
        reference.child(mAuth.getInstance().getCurrentUser().getUid()).child("FASTINGSUGAR").push().setValue(helperClassFastingSugar);


    }
}
package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CRPTABEL extends AppCompatActivity {

    FirebaseDatabase rootNode;
    DatabaseReference reference;
    TextView t1;
    boolean a = true;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crptabel);

        t1 = (TextView) findViewById(R.id.textView1500);

        Double CRP;


        Intent crpr = this.getIntent();

        CRP = crpr.getDoubleExtra("CRP", 0);


        String crpdb = String.valueOf(CRP);


        if(CRP != 0)
        {

            if(CRP<=1.0)
            {
                t1.setText("Low risk");
                a=true;
            }
            else if(CRP>=1.1 && CRP<=3.0)
            {
                t1.setText("Moderate risk");
                a=true;
            }
            else if(CRP>=3.1 && CRP<=10.0)
            {
                t1.setText("hige risk");
                a=true;
            }
            else
            {
                t1.setText("Invalid input");
                a=true;

            }

        }





        rootNode = FirebaseDatabase.getInstance();
        reference = rootNode.getReference("user");
        UserHelperClass helperClass = new UserHelperClass(crpdb);
        reference.child(mAuth.getInstance().getCurrentUser().getUid()).child("CRP").push().setValue(helperClass);


    }
}
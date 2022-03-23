package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class HBA1CTABLE extends AppCompatActivity {


    TextView t1,t2;
    boolean a =true;
    FirebaseDatabase rootNode;
    DatabaseReference reference;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hba1_ctable);

        t1 = findViewById(R.id.textView1500);
        t2 = findViewById(R.id.dipoutput);

        Double gly;


        Intent hba1ct  = getIntent();

        gly = hba1ct.getDoubleExtra("glycosylated", 0);

        String glydb = String.valueOf(gly);



        if(gly != null)
        {

            if (gly < 4.0)
            {
                Toast.makeText(getApplicationContext(), "Please enter a valid input", Toast.LENGTH_SHORT).show();
                t1.setText("INVALID INPUT");
            }


            else if (gly >= 4.0 && gly <= 6.0)
            {
                t1.setText("NON-DIABETIC");
                a = true;
            }


            else if (gly >= 6.1 && gly <= 7.0)
            {
                t1.setText("GOOD DIABETIC CONTROL");
                a = true;
            }

            else if (gly >= 7.1 && gly <= 8.0)
            {
                t1.setText("FAIR CONTROL");
                a = true;
            }

            else if (gly >= 8.1)
            {
                t1.setText("POOR CONTROL ");
                a = false;
            }

        }

        if(a==true)
        {
            t2.setText("YOUR REPORT IS NORMAL");
        }
        else
        {
            t2.setText("YOUR REPORT IS NOT NORMAL");
        }




        rootNode = FirebaseDatabase.getInstance();
        reference = rootNode.getReference("user");
        UserHelperClassHba1c userHelperClassHba1c = new UserHelperClassHba1c(glydb);
        reference.child(mAuth.getInstance().getCurrentUser().getUid()).child("HBA1C").push().setValue(userHelperClassHba1c);


    }
}
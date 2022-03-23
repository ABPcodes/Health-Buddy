package com.example.dashboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class thyroidrcv extends AppCompatActivity {


    RecyclerView thyroidrcv;
    mythyroidadapter adapter;
    ArrayList<thyroidu> holder;
    DatabaseReference reference;
    private FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thyroidrcv);



        thyroidrcv = findViewById(R.id.thyroidrcv);
        thyroidrcv.setLayoutManager(new LinearLayoutManager(this));

        reference = FirebaseDatabase.getInstance().getReference("user");

        holder = new ArrayList<>();
        adapter = new mythyroidadapter(holder);
        thyroidrcv.setAdapter(adapter);


        reference.child(mAuth.getInstance().getCurrentUser().getUid()).child("THYROID").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot dataSnapshot: snapshot.getChildren())
                {
                    if(dataSnapshot.exists()){

                        String a = dataSnapshot.child("tshdb").getValue().toString();
                        String b = dataSnapshot.child("tyidb").getValue().toString();
                        String c = dataSnapshot.child("t3udb").getValue().toString();
                        String d = dataSnapshot.child("fitdb").getValue().toString();


                        thyroidu user = new thyroidu(a,b,c,d);
                        //                        User user = dataSnapshot.getValue(User.class);

                        holder.add(user);
                    }


                }

                adapter.notifyDataSetChanged();

            }





            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



    }
}
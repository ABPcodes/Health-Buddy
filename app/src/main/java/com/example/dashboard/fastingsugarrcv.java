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

public class fastingsugarrcv extends AppCompatActivity {


    RecyclerView fastingsugarrcv;
    myfastingsugaradapter adapter;
    ArrayList<fastingsugaru> holder;
    DatabaseReference reference;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fastingsugarrcv);







        fastingsugarrcv = findViewById(R.id.fastingsugarrcv);
        fastingsugarrcv.setLayoutManager(new LinearLayoutManager(this));

        reference = FirebaseDatabase.getInstance().getReference("user");

        holder = new ArrayList<>();
        adapter = new myfastingsugaradapter(holder);
        fastingsugarrcv.setAdapter(adapter);

        reference.child(mAuth.getInstance().getCurrentUser().getUid()).child("FASTINGSUGAR").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot dataSnapshot: snapshot.getChildren())
                {
                    if(dataSnapshot.exists()){

                        String a = dataSnapshot.child("fastingsugardb").getValue().toString();



                        fastingsugaru user = new fastingsugaru(a);
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
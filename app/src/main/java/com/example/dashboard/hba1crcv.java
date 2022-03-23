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

public class hba1crcv extends AppCompatActivity {

    RecyclerView hba1crcv;
    myhba1cadapter adapter;
    ArrayList<hba1cu> holder;
    DatabaseReference reference;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hba1crcv);







        hba1crcv = findViewById(R.id.hba1crcv);
        hba1crcv.setLayoutManager(new LinearLayoutManager(this));

        reference = FirebaseDatabase.getInstance().getReference("user");

        holder = new ArrayList<>();
        adapter = new myhba1cadapter(holder);
        hba1crcv.setAdapter(adapter);


        reference.child(mAuth.getInstance().getCurrentUser().getUid()).child("HBA1C").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot dataSnapshot: snapshot.getChildren())
                {
                    if(dataSnapshot.exists()){

                        String a = dataSnapshot.child("glydb").getValue().toString();


                        hba1cu user = new hba1cu(a);
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
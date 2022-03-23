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

public class lipidrcv extends AppCompatActivity {


    RecyclerView lipidrcv;
    mylipidadapter adapter;
    ArrayList<lipidu> holder;
    DatabaseReference reference;
    private FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lipidrcv);





        lipidrcv = findViewById(R.id.lipidrcv);
        lipidrcv.setLayoutManager(new LinearLayoutManager(this));

        reference = FirebaseDatabase.getInstance().getReference("user");

        holder = new ArrayList<>();
        adapter = new mylipidadapter(holder);
        lipidrcv.setAdapter(adapter);





        reference.child(mAuth.getInstance().getCurrentUser().getUid()).child("LIPID").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot dataSnapshot: snapshot.getChildren())
                {
                    if(dataSnapshot.exists()){

                        String a = dataSnapshot.child("chldb").getValue().toString();
                        String b = dataSnapshot.child("tildb").getValue().toString();
                        String c = dataSnapshot.child("hdlcdb").getValue().toString();
                        String d = dataSnapshot.child("ldlcdb").getValue().toString();
                        String e = dataSnapshot.child("vldlcdb").getValue().toString();
                        String f = dataSnapshot.child("chohdldb").getValue().toString();
                        String g = dataSnapshot.child("ldlhdldb").getValue().toString();
                        String h = dataSnapshot.child("non_hdldb").getValue().toString();


                        lipidu user = new lipidu(a,b,c,d,e,f,g,h);
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
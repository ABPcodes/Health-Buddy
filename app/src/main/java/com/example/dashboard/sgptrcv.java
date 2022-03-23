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

public class sgptrcv extends AppCompatActivity {


    RecyclerView sgptrcv;
    mysgptadapter adapter;
    ArrayList<sgptu> holder;
    DatabaseReference reference;
    private FirebaseAuth mAuth;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgptrcv);






        sgptrcv = findViewById(R.id.sgptrcv);
        sgptrcv.setLayoutManager(new LinearLayoutManager(this));

        reference = FirebaseDatabase.getInstance().getReference("user");

        holder = new ArrayList<>();
        adapter = new mysgptadapter(holder);
        sgptrcv.setAdapter(adapter);


        reference.child(mAuth.getInstance().getCurrentUser().getUid()).child("SGPT").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot dataSnapshot : snapshot.getChildren())
                {
                    if(dataSnapshot.exists()){

                        String a = dataSnapshot.child("agdb").getValue().toString();
                        String b = dataSnapshot.child("apdb").getValue().toString();
                        String c = dataSnapshot.child("asdb").getValue().toString();
                        String d = dataSnapshot.child("bicdb").getValue().toString();
                        String e = dataSnapshot.child("biodb").getValue().toString();
                        String f = dataSnapshot.child("bitdb").getValue().toString();
                        String g = dataSnapshot.child("gdb").getValue().toString();
                        String h = dataSnapshot.child("sgotdb").getValue().toString();
                        String i = dataSnapshot.child("sgptdb").getValue().toString();
                        String j = dataSnapshot.child("tpdb").getValue().toString();



                        sgptu user = new sgptu(a,b,c,d,e,f,g,h,i,j);

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
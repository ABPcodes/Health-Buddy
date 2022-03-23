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

public class cbcrcv extends AppCompatActivity {


    RecyclerView cbcrcv;
    mycbcadapter adapter;
    ArrayList<cbcu> holder;
    DatabaseReference reference;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cbcrcv);



        cbcrcv = findViewById(R.id.cbcrcv);
        cbcrcv.setLayoutManager(new LinearLayoutManager(this));

        reference = FirebaseDatabase.getInstance().getReference("user");

        holder = new ArrayList<>();
        adapter = new mycbcadapter(holder);
        cbcrcv.setAdapter(adapter);

        reference.child(mAuth.getInstance().getCurrentUser().getUid()).child("CBC").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                for(DataSnapshot dataSnapshot: snapshot.getChildren())
                {
                    if(dataSnapshot.exists()){

                        String a = dataSnapshot.child("bpdb").getValue().toString();
                        String b = dataSnapshot.child("epdb").getValue().toString();
                        String c = dataSnapshot.child("hmbdb").getValue().toString();
                        String d = dataSnapshot.child("lpdb").getValue().toString();
                        String e = dataSnapshot.child("mcdb").getValue().toString();
                        String f = dataSnapshot.child("mchcdb").getValue().toString();
                        String  g= dataSnapshot.child("mchdb").getValue().toString();
                        String h = dataSnapshot.child("mcvdb").getValue().toString();
                        String  i= dataSnapshot.child("ntdb").getValue().toString();
                        String  j= dataSnapshot.child("pcvdb").getValue().toString();
                        String  k= dataSnapshot.child("plcdb").getValue().toString();
                        String l = dataSnapshot.child("pmdb").getValue().toString();
                        String m = dataSnapshot.child("rbcdb").getValue().toString();
                        String  n= dataSnapshot.child("rcddb").getValue().toString();
                        String  o= dataSnapshot.child("wbcdb").getValue().toString();


                        cbcu user = new cbcu(a,b,c,d,e,f,g,h,i,j,k,l,m,n,o);
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
package com.example.dashboard;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class profile extends Fragment {


    public profile() {
        // Required empty public constructor
    }







    TextView fullname,fullname2,usermail,logout;
    Button checkhistory;
    FirebaseDatabase rootNode;
    DatabaseReference reference;











    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_profile, container, false);




        fullname = (TextView) view.findViewById(R.id.fullname);
        fullname2 = (TextView) view.findViewById(R.id.fullname2);
        usermail = (TextView) view.findViewById(R.id.usermail);
        logout = (TextView) view.findViewById(R.id.logout);
        checkhistory = (Button) view.findViewById(R.id.checkhistory);




        GoogleSignInAccount signInAccount = GoogleSignIn.getLastSignedInAccount(getContext());
        if(signInAccount!= null)
        {
            fullname.setText(signInAccount.getDisplayName());
            fullname2.setText(signInAccount.getDisplayName());
            usermail.setText(signInAccount.getEmail());
        }




        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();

                Intent intent = new Intent(getActivity(),login.class);
                startActivity(intent);
            }
        });




        checkhistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),checkreporthistory.class);
                startActivity(intent);
            }
        });





































        return view;
    }














}
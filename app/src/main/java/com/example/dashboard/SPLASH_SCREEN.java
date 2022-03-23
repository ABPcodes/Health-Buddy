package com.example.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SPLASH_SCREEN extends AppCompatActivity {


    private static int SPLASH_SCREEN = 3500;
    Animation topanim,bottomanim;
    ImageView image;
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        topanim= AnimationUtils.loadAnimation(this,R.anim.top_anim);
        bottomanim=AnimationUtils.loadAnimation(this,R.anim.bottom_anim);

        image = findViewById(R.id.appicon);
        name = findViewById(R.id.textView3);


        image.setAnimation(topanim);
        name.setAnimation(bottomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SPLASH_SCREEN.this,login.class);
                Pair[] pairs= new Pair[2];
                pairs[0] = new Pair<View,String>(image,"logo_image");
                pairs[1] = new Pair<View,String>(name,"logo_text");

                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SPLASH_SCREEN.this, pairs);
                    startActivity(intent, options.toBundle());
                    finish();
                }
            }
        },SPLASH_SCREEN);
    }
}
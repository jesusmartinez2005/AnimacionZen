package com.example.jesusmartinez.animacionzen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void miclick (View view) {
        Animation animation = new TranslateAnimation(0, 300, 0, 0);
       /* Animation animation = new TranslateAnimation(
        Animation.RELATIVE_TO_SELF,0,
                Animation.RELATIVE_TO_SELF,1,
                Animation.RELATIVE_TO_SELF,0,
                Animation.RELATIVE_TO_SELF,0);*/
        animation.setDuration(1000);
        view.setAnimation(animation);
        view.startAnimation(animation);
    }
}

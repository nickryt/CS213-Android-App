package com.example.pa5;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Start extends AppCompatActivity {

    //Class Variables
    int SPLASH_DELAY = 2;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Set Viewer's XML To 'start.xml'
        setContentView(R.layout.start);

        //Handler created to delay start screen with initial musuem page
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(Start.this, Museums.class));
                finish();
            }
        }, SPLASH_DELAY * 1000);
    }

    //Disable Back Button Functionality
    @Override
    public void onBackPressed(){
    }
}
package com.example.pa5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Museums extends AppCompatActivity {

    private Button museumButtonOne = findViewById(R.id.museumButtonOne);
    public Button museumButtonTwo = findViewById(R.id.museumButtonTwo);
    public Button museumButtonThree = findViewById(R.id.museumButtonThree);
    public Button museumButtonFour = findViewById(R.id.museumButtonFour);

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.museums);

        museumButtonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("HIT THAT BUTTON BITCH");
            }
        });


    }





}

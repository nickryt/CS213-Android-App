package com.example.pa5;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewarkMuseumOfArt extends AppCompatActivity {


    private ImageView MuseumPicture;
    private TextView name;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tickets);

        MuseumPicture = findViewById(R.id.museumImage);
        MuseumPicture.setImageResource((R.drawable.the_newark_museum_of_art));

        name = findViewById(R.id.museumName);
        name.setText(getResources().getText(R.string.museum_two));

    }

}

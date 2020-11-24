package com.example.pa5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class LibertyScienceCenter extends AppCompatActivity {

    private int SENIOR_PRICE = 14;
    private int STUDENT_PRICE = 11;
    private int ADULT_PRICE = 15;
    private double TAX_AMOUNT = 0.06625;

    private Button ticketPrices;
    private TextView ticketCost;
    private TextView taxCost;
    private TextView totalCost;

    private ImageButton MuseumPicture;
    private TextView name;
    private ImageButton backButton;

    private TextView seniorText;
    private TextView studentText;
    private TextView adultText;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tickets);

        Toast.makeText(LibertyScienceCenter.this, "Maximum Of 5 Tickets For Each!", Toast.LENGTH_SHORT).show();

        MuseumPicture = findViewById(R.id.museumImage);
        MuseumPicture.setImageResource((R.drawable.liberty_science_center));

        MuseumPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Website.class);
                intent.putExtra("SELECTED", "LSC");
                startActivity(intent);
            }
        });

        name = findViewById(R.id.museumName);
        name.setText(getResources().getText(R.string.museum_four));

        Spinner spinner = (Spinner) findViewById(R.id.seniorSpinner);
        Spinner spinnerStudent = (Spinner) findViewById(R.id.studentSpinner);
        Spinner spinnerAdult = (Spinner) findViewById(R.id.adultSpinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.tickets_selected, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinnerStudent.setAdapter(adapter);
        spinnerAdult.setAdapter(adapter);

        ticketPrices = findViewById(R.id.calculateButton);

        seniorText = findViewById(R.id.seniorText);
        studentText = findViewById(R.id.studentText);
        adultText = findViewById(R.id.adultText);

        seniorText.setText(getResources().getText(R.string.LSC_senior));
        studentText.setText(getResources().getText(R.string.LSC_student));
        adultText.setText(getResources().getText(R.string.LSC_adult));

        backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ticketPrices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                int price = (SENIOR_PRICE * Integer.parseInt(spinner.getSelectedItem().toString()));
                price += (STUDENT_PRICE * Integer.parseInt(spinnerStudent.getSelectedItem().toString()));
                price += (ADULT_PRICE * Integer.parseInt(spinnerAdult.getSelectedItem().toString()));

                ticketCost = findViewById(R.id.price_amount);
                taxCost = findViewById(R.id.tax_amount);
                totalCost = findViewById(R.id.total_amount);

                ticketCost.setText("$" + price);

                Double tax = price * TAX_AMOUNT;
                //ticketCost.setText("$" + String.format("%.2f", price));
                taxCost.setText("$" + String.format("%.2f", tax));
                totalCost.setText("$" + String.format("%.2f", price + tax));
            }
        });

    }


}

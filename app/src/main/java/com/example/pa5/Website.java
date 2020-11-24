package com.example.pa5;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class Website extends AppCompatActivity {

    private WebView web_viewer;
    public String selection;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.website);
        web_viewer = findViewById(R.id.web_viewer);

        Intent intent = getIntent();
        selection = intent.getStringExtra("SELECTED");

        if (selection.equals("NJSM")){
            web_viewer.loadUrl("https://www.state.nj.us/state/museum/");
        }
        else if (selection.equals("NMOA")){
            web_viewer.loadUrl("https://www.newarkmuseumart.org/");
        }
        else if (selection.equals("MAM")){
            web_viewer.loadUrl("https://www.montclairartmuseum.org/");
        }
        else if (selection.equals("LSC")){
            web_viewer.loadUrl("https://lsc.org/");
        }
        else{
            web_viewer.loadUrl("https://sitechecker.pro/wp-content/uploads/2017/12/404.png");
        }
    }

    @Override
    public void onBackPressed(){
        finish();
    }

}

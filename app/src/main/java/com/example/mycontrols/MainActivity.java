package com.example.mycontrols;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    ImageButton spinnerImageButton;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerImageButton = findViewById(R.id.imageButton);
        spinner = findViewById(R.id.spinner);


        spinnerImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinner.performClick();
            }
        });

    }
}

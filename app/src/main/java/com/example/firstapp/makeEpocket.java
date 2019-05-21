package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class makeEpocket extends AppCompatActivity {
    Spinner gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_epocket);

        gender = (Spinner)findViewById(R.id.s_spinner); // init the spinner from xml
        String[] gender_spinner = {"Male", "Female"}; // value fto be show in spinner
        // array adapter use to bind value in spinner
        ArrayAdapter<String>adapter =  new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, gender_spinner);
        gender.setAdapter(adapter);

    }
}

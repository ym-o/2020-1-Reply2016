package com.example.android.exampleprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SignUpActivity extends AppCompatActivity {

    private Spinner univSpinner;
    private ArrayAdapter arrayAdapter1;
    private Spinner majorSpinner;
    private ArrayAdapter arrayAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        univSpinner = (Spinner) findViewById(R.id.univ_spinner);
        arrayAdapter1 = ArrayAdapter.createFromResource(this, R.array.univ, android.R.layout.simple_spinner_dropdown_item);
        univSpinner.setAdapter(arrayAdapter1);

        majorSpinner = (Spinner) findViewById(R.id.major_spinner);
        arrayAdapter2 = ArrayAdapter.createFromResource(this, R.array.major, android.R.layout.simple_spinner_dropdown_item);
        majorSpinner.setAdapter(arrayAdapter2);
    }
}

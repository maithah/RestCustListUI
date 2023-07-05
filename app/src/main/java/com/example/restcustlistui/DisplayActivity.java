package com.example.restcustlistui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.ArrayList;

public class DisplayActivity extends AppCompatActivity {

    Button btnadd, btnview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        btnadd = (Button)findViewById(R.id.buttonAdd);
        btnview = (Button)findViewById(R.id.buttonView);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(DisplayActivity.this, InformationCustomerActivity.class);
                startActivity(in);
            }
        });
    }
}
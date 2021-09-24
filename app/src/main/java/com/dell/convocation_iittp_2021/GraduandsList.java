package com.dell.convocation_iittp_2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bogdwellers.pinchtozoom.ImageMatrixTouchHandler;

import java.util.Objects;

public class GraduandsList extends AppCompatActivity {
    ImageView im1,im2,im3,im4,im5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_graduands_list);
        Objects.requireNonNull(getSupportActionBar()).hide();

        CardView cardView1 = findViewById(R.id.c1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CivilEngineering.class);
                startActivity(intent);
            }
        });
        CardView cardView11 = findViewById(R.id.b1);
        cardView11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CivilEngineering.class);
                startActivity(intent);
            }
        });


        CardView cardView2 = findViewById(R.id.c2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CSE.class);
                startActivity(intent);
            }
        });
        CardView cardView22 = findViewById(R.id.b2);
        cardView22.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CSE.class);
                startActivity(intent);
            }
        });


        CardView cardView3 = findViewById(R.id.c3);
        cardView3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ElectricalEngineering.class);
                startActivity(intent);
            }
        });
        CardView cardView33 = findViewById(R.id.b3);
        cardView33.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ElectricalEngineering.class);
                startActivity(intent);
            }
        });


        CardView cardView5 = findViewById(R.id.m4);
        cardView5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Mathematics_Statistics.class);
                startActivity(intent);
            }
        });
        CardView cardView55 = findViewById(R.id.m44);
        cardView55.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Mathematics_Statistics.class);
                startActivity(intent);
            }
        });

        CardView cardView4 = findViewById(R.id.c4);
        cardView4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MechanicalEngineering.class);
                startActivity(intent);
            }
        });
        CardView cardView44 = findViewById(R.id.b4);
        cardView44.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MechanicalEngineering.class);
                startActivity(intent);
            }
        });
 }
    public void left(View view) {
        finish();
    }
}
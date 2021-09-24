package com.dell.convocation_iittp_2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bogdwellers.pinchtozoom.ImageMatrixTouchHandler;

import java.util.Objects;

public class InstituteAwards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_institute_awards);
        Objects.requireNonNull(getSupportActionBar()).hide();
        CardView cardView1;
        CardView cardView2;
        LinearLayout layout1,layout2;

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        cardView1 = findViewById(R.id.b2021);
        cardView2 = findViewById(R.id.b2020);
        layout1 = findViewById(R.id.l2021);
        layout2 = findViewById(R.id.l2020);
        TextView textView1;
        TextView textView2;
        textView1 = findViewById(R.id.t2021);
        textView2 = findViewById(R.id.t2020);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView1.getText().toString() == "View"){
                    textView1.setText("Hide");
                    textView2.setText("View");
                    layout1.setVisibility(view.VISIBLE);
                    layout2.setVisibility(view.GONE);
                } else {
                    textView1.setText("View");
                    textView2.setText("View");
                    layout1.setVisibility(view.GONE);
                    layout2.setVisibility(view.GONE);
                }
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(textView2.getText().toString() == "View"){
                    textView2.setText("Hide");
                    textView1.setText("View");
                    layout2.setVisibility(view.VISIBLE);
                    layout1.setVisibility(view.GONE);
                } else {
                    textView1.setText("View");
                    textView2.setText("View");
                    layout1.setVisibility(view.GONE);
                    layout2.setVisibility(view.GONE);
                }
            }
        });
    }
    public void left(View view) {
        finish();
    }
}
package com.dell.convocation_iittp_2021;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bogdwellers.pinchtozoom.ImageMatrixTouchHandler;
import com.sdsmdg.harjot.crollerTest.Croller;

import java.util.Objects;


public class AboutIITTirupati extends AppCompatActivity {
    String s1 = "The establishment of the Indian Institute of Technology Tirupati (IITT) was announced in 2014 by the Government of India along with five other new IITs at Palakkad, Dharwad, Bhilai, Jammu and Goa (which were announced in 2015). IIT Tirupati launched its academic programme with the support of its mentor Institute, IIT Madras, on August 5, 2015, from a temporary campus situated on Tirupati-Renigunta Road, Tirupati. In a short span of six years, IIT Tirupati succeeded in developing the required infrastructure for functioning from its 530 acres Permanent Campus located in Merlapaka Village on Yerpedu-Venkatagiri Highway. The construction of the permanent campus is underway, and the first phase of the construction, that will cater to 1250 students and 120 faculty is expected to be ready by June 2022. The complete campus to cater to 2,500 students, 250 faculty and 275 staff is planned to be built by 2024.\n";
    String s2 = "\"IIT Tirupati has a high potential to be an Academic and Research Institute of great repute.\"";
    TextView textView;
    ImageView imageView;
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        setContentView(R.layout.activity_about_i_i_t_tirupati);
        Objects.requireNonNull(getSupportActionBar()).hide();
        textView = findViewById(R.id.t1);
        textView.setText(s1);
        TextView textView2 = findViewById(R.id.t2);
        textView2.setText(s2);
}

    public void left(View view) {
        finish();
    }
}
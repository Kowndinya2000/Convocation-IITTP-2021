package com.dell.convocation_iittp_2021;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bogdwellers.pinchtozoom.ImageMatrixTouchHandler;

import java.util.Objects;

public class ConvocationAttire extends AppCompatActivity {

    String s1 = "The Convocation Attire of the students and dignitaries have been designed with the support of the National Institute of Fashion Technology (NIFT), Chennai." +
            "\n\nDots and lines are not just the foundational elements of design. There are the signifiers of consciousness and evolution. A moving dot becomes a line signifying emancipation. A line thus created, contains within itself the power to transform into shapes, forms, or patterns. Human beings are no different. A student through guidance develops into a learned individual. Influenced by physical, environmental, sensorial, and emotional stimuli, that individual transforms into a professional serving the needs of a few and many. When the dot as a line becomes a form, the metamorphosis commences." +
            "\n\nThis phenomenon of metamorphosis is the philosophy of commencement. The Convocation Attire used for such an occasion acts as a visual sign of transformation. The cape designed in the colours of red and black is about forging meaningful ties with a social purpose. Printed by the craftspeople of Andhra Pradesh using natural dyes and hand-carved blocks, the lines and dots represent the material and visual culture of the region. The student cape that re-purposes as a stole offers personalisation for large audiences, which will motivate them to keep the object good." +
            "\n\nThe design of the Convocation Attire focuses on the ideology of the people, processes, technology of IIT Tirupati offering a new sense of vitality and cultural appreciation." ;

    TextView textView;
    ImageView imageView;
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_convocation_attire);
        Objects.requireNonNull(getSupportActionBar()).hide();
        textView = findViewById(R.id.t1);
        textView.setText(s1);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    public void left(View view) {
        finish();
    }
}
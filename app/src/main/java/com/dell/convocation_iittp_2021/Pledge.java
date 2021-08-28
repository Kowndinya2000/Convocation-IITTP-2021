package com.dell.convocation_iittp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class Pledge extends AppCompatActivity {
    String s1 = "I, the Graduate of the Indian Institute of Technology Tirupati, pledge today\nto honour this oath;\n\nThat I shall continue to work to acquire, disseminate and generate new\nknowledge;\n\nThat in thought, word, and deed, I shall endeavour to contribute to human\nwelfare by conscientiously adhering to the ethical values of my profession;\n\nThat I shall work for an inclusive society and sustainable development.";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pledge);
        Objects.requireNonNull(getSupportActionBar()).hide();
        textView = findViewById(R.id.t1);
        textView.setText(s1);
    }
    public void left(View view) {
        finish();
    }
}
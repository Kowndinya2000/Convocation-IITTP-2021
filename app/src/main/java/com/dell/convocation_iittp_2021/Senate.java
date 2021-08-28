package com.dell.convocation_iittp_2021;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class Senate extends AppCompatActivity {

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senate);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

    public void left(View view) {
        finish();
    }
}
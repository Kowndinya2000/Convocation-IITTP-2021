package com.dell.convocation_iittp_2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class BoardOfGovernors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board_of_governors);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}
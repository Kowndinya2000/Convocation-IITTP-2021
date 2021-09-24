package com.dell.convocation_iittp_2021;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import java.util.Objects;

public class Splash extends AppCompatActivity {
    private final Runnable waitCallback = new Runnable() {
        public void run() {
            Splash.this.startActivity(new Intent(Splash.this, MainActivity.class));
        }
    };
    private final Handler waitHandler = new Handler();

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Objects.requireNonNull(getSupportActionBar()).hide();

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.waitHandler.postDelayed(this.waitCallback, 2500);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.waitHandler.removeCallbacks(this.waitCallback);
        super.onDestroy();
    }
}

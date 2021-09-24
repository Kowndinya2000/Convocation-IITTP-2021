package com.dell.convocation_iittp_2021;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bogdwellers.pinchtozoom.ImageMatrixTouchHandler;

public class OurLogo extends AppCompatActivity {

    String s1 = "The visual identity of IIT Tirupati is an allegorical image that offers multiple layers of inspiring meanings. It shows the acronym IIT along with a scene of a continuing conversation among the three people. The people appear to be discussing a symbol placed between them that of a ‘tritiya netra’ or the third-eye. The image of the third eye is an inimitable symbol in Indian culture signifying ‘pragya’ or wisdom, a pursuit and purpose of knowledge. The image of people in conversation signifies a ‘Gurukul’, an arrangement where Guru and Shishya live together and continue the discourse. The ‘Gurukul’ is well regarded in Indian tradition as a way of passing on the advance and subtle knowledge from one generation to the next." +
            "\n\nThe logo carries the regional traditional styles of art and crafts hence providing the ‘local identification’ of the IIT Tirupati in the global milieu and conveying the people centric approach in advancing research in the fields of science and technology." +
            "\n\nThe ubiquitous presence of the image would influence as a positive and virtuous stimulus to the entire IIT fraternity, its national and international guests and the local folks living in and around the historical town of Tirupati." ;
    TextView t1;
    ImageView imageView;
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_logo);
        getSupportActionBar().hide();
        t1 = findViewById(R.id.t1);
        t1.setText(s1);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    public void left(View view) {
        finish();
    }
}
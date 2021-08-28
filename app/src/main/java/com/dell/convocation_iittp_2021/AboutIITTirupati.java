package com.dell.convocation_iittp_2021;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bogdwellers.pinchtozoom.ImageMatrixTouchHandler;

import java.util.Objects;

public class AboutIITTirupati extends AppCompatActivity {
    String s1 = "The establishment of Indian Institute of Technology Tirupati (IITT) was announced in 2014 by the Government of India along with five other new IITs at Palakkad, Dharwad, Bhilai,\nJammu and Goa (which were announced in 2015). IIT Tirupati launched its academic programme with the support of its mentor Institute, IIT Madras, on August 5, 2015 from a\ntemporary campus situated on Tirupati-Renigunta Road, Tirupati. In the third year of its operations, IIT Tirupati has started functioning from its 530 acres Permanent Campus located\nin Merlapaka Village on Yerpedu-Venkatagiri Highway. The construction of the permanent campus is underway and the first phase of the construction is expected to be complete by\n2021 that will cater to 1250 students and 120 faculty members. The complete campus to cater to 2,500 students, 250 faculty members and 275 staff members is planned to be built\nby 2024.\n\nCurrently, the Institute offers admissions to B.Tech programme against 180 seats in the branches of Chemical Engineering, Civil Engineering, Computer Science and Engineering,\nElectrical Engineering, and Mechanical Engineering, and M.Tech in Civil Engineering, Computer Science and Engineering, Electrical Engineering, and Mechanical Engineering.\n\nThe Institute offers M.Sc. In Mathematics, MS, and PhD in all the existing branches of Engineering, and a PhD in Mathematics, Sciences, and Humanities and Social Sciences.\nIn four rounds of faculty recruitment, the Institute has added a total of 85 faculty members to its faculty strength. Along with young and dynamic faculty who have joined after\ncompleting their doctoral programmes and postdoctoral training from top Universities.\n\nInstitutes across the world, IIT Tirupati has several senior faculty members retired from other established IITs. The Institute has signed MoUs with various academic laboratories and\ninstitutions of international repute in India and abroad for the collaborative research and exchange of faculty and students. We are striving here to establish one of India’s leading\nenvirons for innovation and entrepreneurship at our Institute to attract top Indian and global companies to recruit our students and conduct collaborative research.\n";
    TextView textView;
    ImageView imageView;
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_i_i_t_tirupati);
        Objects.requireNonNull(getSupportActionBar()).hide();
        textView = findViewById(R.id.t1);
        textView.setText(s1);
        imageView = findViewById(R.id.im1);
        imageView.setOnTouchListener(new ImageMatrixTouchHandler(getApplicationContext()));
    }

    public void left(View view) {
        finish();
    }
}
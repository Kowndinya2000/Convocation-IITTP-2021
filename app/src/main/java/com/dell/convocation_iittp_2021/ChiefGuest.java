package com.dell.convocation_iittp_2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class ChiefGuest extends AppCompatActivity {
    String s1 = "Shri B. Santhanam is the Chief Executive Officer of Saint-Gobain Asia Pacific and India Region, and a member of the Global Executive Committee of Saint-Gobain, France. Having obtained his B. Tech in Civil Engineering from Indian Institute of Technology, Madras in 1978 and Post- Graduation in Management from Indian Institute of Management, Ahmedabad in 1980, Shri Santhanam started his career as a Management Trainee in May 1980 at Grindwell Norton, a Saint-Gobain Group Company and served in various capacities and functions, such as Information Technology, Operations, Product Development, Sales and Marketing, eventually ending up as a member of the Management Board. In 1996, Shri Santhanam worked closely with the Saint-Gobain Group to develop a strategic blueprint for investments in India. He was instrumental in the Group’s investment of over € 750 Million in Flat Glass to create a Pan India manufacturing footprint, for over two decades. Saint-Gobain India has achieved quality, technical and market leadership positions in India and has won numerous Regional and National Awards in the field of Innovation, Brand Building, EHS, Water Management, HR Excellence, Corporate Social Responsibility, etc." +
            "\n \n Shri Santhanam has been an elected member of the National Council of CII (India’s Premier Industry Association with 9,100 Members) during 2006-2019. He was the Chairman of the CII Southern Region from 2013 to 2014 and has helped create and develop the “Indian Women Network” (IWN) under CII. He has been a member of Indian Green Building Council (IGBC) Executive Committee since 2009. One of the highlights of his career has been him being elected as the President of Employers’ Federation of India (EFI) during 2009-10. Since 2013, Shri Santhanam has been a member of the Board of Governors of the Indian Institute of Information Technology, Design and Manufacturing (IIIT, D&M) nominated by the Government of India to represent Industry. He has been a Director at IIT Madras Research Park since December 2009 and has also been a Board Member on the Board of Centre for Urbanization, Buildings and Environment (CUBE), Chennai since 2017." +
            "\n \n Shri Santhanam served as an Independent Director on the Board of Wheels India Limited from September 2014 to August 2019 and has been serving as an Independent Director on the Board of Titan Company Limited since May 2018. Shri Santhanam is playing an active role in shaping India’s policies in Human Resources, Skill Development, Sustainability, Manufacturing and Digitalization." +
            "\n \n Shri Santhanam has many awards and accolades to his credit. He was selected as a “Distinguished Alumnus” of IIT Madras in 2004. He received an award “les Arches de la Croissance” (Arches of Growth) for Innovation and Growth in 2005. In 2008, Shri Santhanam was selected as “CEO of the Year”, a biannual award by the National Human Resource Development Network (NHRDN). In 2013, Hindustan University conferred Doctor of Literature (Honoris Causa) on him. In 2014, he received the “V.C. Padmanaban Memorial Award” in the category of “Business Excellence leading to Development of Society at large” by Manappuram Finance Limited. Shri Santhanam was conferred the “Champion of Humanity Award” by the Hindustan Chamber of Commerce in 2015." +
            "\n \n Shri Santhanam’s hobbies include non-fiction reading, debating and influencing Public Policy. He is completely aligned with Saint-Gobain’s purpose of Making the World a better Home and is focused on leveraging the Group’s human resources in APAC and India Region to make Saint-Gobain competitive, innovative and sustainable." +
            "";
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chief_guest);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        textView = findViewById(R.id.t1);
        textView.setText(s1);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }
    public void left(View view) {
        finish();
    }
}
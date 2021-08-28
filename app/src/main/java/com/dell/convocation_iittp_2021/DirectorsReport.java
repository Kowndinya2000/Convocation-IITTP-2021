package com.dell.convocation_iittp_2021;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;

public class DirectorsReport extends AppCompatActivity {
        String s1 = "Chief Guest, Shri Ramesh Pokhriyal ‘Nishank’ Ji, Hon’ble Minister of Human Resource Development, Guest of Honour, Dr. Audimulapu Suresh, Hon'ble Minister for Education, Government of Andhra Pradesh, Shri R. Subrahmanyam, Chairman, Board of Governors, IIT Tirupati; all the members of the Board of Governors; members of the Senate; graduands and their well-wishers; distinguished invitees; colleagues and students, \n\nIt gives me immense pleasure to welcome you all to the first Convocation of the Indian Institute of Technology Tirupati. It is our privilege to have Shri Ramesh Pokhriyal ‘Nishank’ ji, Hon’ble Minister of Human Resource Development to address our graduating students today and award the medals. The history of IIT Tirupati is in making and in it, the first convocation is an event of paramount significance. On this historical occasion, we are proud to announce that a total of 103 B.Tech and one M.S. degrees will be awarded today.\n\nThe establishment of IIT Tirupati was announced in 2014 by the Government of India along with five other new IITs.  The foundation stone for the Institute was laid on March 28, 2015 by the then Hon’ble Minister for HRD Smt. Smriti Irani in the presence of Hon’ble Union Ministers Shri M. Venkaiah Naidu and Shri Sujana Chowdary,  Hon’ble Chief Minister of AP Shri N. Chandrababu Naidu, Hon’ble HRD Minister of AP Shri Ganta Srinivasa Rao and a galaxy of other dignitaries.  The common foundation stone programme for IIT Tirupati, IISER Tirupati and IIIT Sri City was attended by over 20,000 people.\n\nIIT Tirupati launched its academic programme with the support of its mentor Institute, IIT Madras, on August 5, 2015 from a temporary campus situated on Tirupati-Renigunta Road, Tirupati. In the fourth year of its operations, IIT Tirupati has started partly functioning from its 530 acres Permanent Campus located in Merlapaka Village on Yerpedu-Venkatagiri Highway. The construction of the permanent campus is underway and the first phase of the construction is expected to be complete by 2021 that will cater to 1250 students and 120 faculty members. The complete campus to cater to 2,500 students, 250 faculty members and 275 staff members is planned to be built by 2024.\nSince the inception of the Institute, we are engaged in recruiting world-class facultymembers to teach and carry out cutting-edge research often in collaboration with industry and academic institutions of international repute. In three rounds of regular recruitment, the Institute has appointed 85 faculty members against the sanctioned strength of 93 faculty members. \n\nWe are striving to establish one of India’s leading environs for innovation andentrepreneurship at our Institute to attract top Indian and global companies to recruit ourstudents and conduct collaborative research. IIT Tirupati is growing to be one of the leading Institutions in the country with its ideal of global outlook and local relevance.\n\nI, now, share with you some snapshots of our journey since the inception of the\nInstitute.\n";
        TextView t1,t2;
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_directors_report);
            Objects.requireNonNull(getSupportActionBar()).hide();
            setTitle("Director's Report");
            t1 = findViewById(R.id.t1);
            t2 = findViewById(R.id.t2);
            t1.setText(s1);
            t2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    DirectorsReport.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://drive.google.com/file/d/0BzTmJovVmlIUdk1zbmk5Z3UyWlhkOTRZNlZRYUVMcmg5VnVj/view?usp=sharing")));
                }
            });
        }

        public void left(View view) {
            finish();
        }
    }
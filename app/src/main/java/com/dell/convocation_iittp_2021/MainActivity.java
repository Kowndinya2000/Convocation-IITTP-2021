package com.dell.convocation_iittp_2021;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {

    MeowBottomNavigation bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        bottomNavigation = findViewById(R.id.bottomNavigation);
        bottomNavigation.add(new MeowBottomNavigation.Model(1,R.drawable.ic_info));
        bottomNavigation.add(new MeowBottomNavigation.Model(2,R.drawable.ic_home));
        bottomNavigation.add(new MeowBottomNavigation.Model(3,R.drawable.ic_contacts));
        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragment = null;
                switch (item.getId()){
                    case 1:
                        fragment = new InfoFragment();
                        break;
                    case 2:
                        fragment = new HomeFragment();
                        break;
                    case 3:
                        fragment = new ContactsFragment();
                        break;
                }
                loadFragment(fragment);
            }
        });
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        bottomNavigation.setCount(1,"14");
        bottomNavigation.show(2,true);

        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
//                Toast.makeText(getApplicationContext(),"Home Page"+item.getId(),Toast.LENGTH_SHORT).show();
            }
        });

        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
//                Toast.makeText(getApplicationContext(),"Home Page"+item.getId(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,fragment).commit();

    }
}
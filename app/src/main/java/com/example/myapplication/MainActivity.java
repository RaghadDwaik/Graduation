package com.example.myapplication;


import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottom;
    private ActionBarDrawerToggle toggle;
    private NavigationView navigationView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.place_recycler);
        final DrawerLayout drawerLayout = findViewById(R.id.DrawerLayout);
      //  final BottomNavigationView bottom=findViewById(R.id.bottom_nav);
        navigationView=findViewById(R.id.navigation);
     //  bottom=findViewById(R.id.bottom);

      /*  toggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.start,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();*/




        findViewById(R.id.menu).setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        NavigationView nav =findViewById(R.id.navigation);
        nav.setItemIconTintList(null);

       // BottomNavigationView nav1 =findViewById(R.id.bottom);
        //nav1.setItemIconTintList(null);



        String[] captions = new String[Places.place.length];
        int[] ids = new int[Places.place.length];

        for(int i = 0; i<captions.length;i++){
            captions[i] = Places.place[i].getName();
            ids[i] = Places.place[i].getImageID();
        }


        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        Adapter1 adapter = new Adapter1(captions, ids);
        recyclerView.setAdapter(adapter);
    }

}
package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.finalproject.Adapter.PopularAdapter;
import com.example.finalproject.Domain.HomeDomain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter, adapter2;
    private RecyclerView recyclerViewCategoryList, recyclerViewPopularList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerViewPopular();
        bottomNavigation();
    }

    private void bottomNavigation() {

        LinearLayout homeBtn = findViewById(R.id.homeBtn);


        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity.class));
            }
        });
    }

    private void recyclerViewPopular() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerViewPopularList = findViewById(R.id.recyclerView2);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager);

        ArrayList<HomeDomain> Homelist = new ArrayList<>();
        Homelist.add(new HomeDomain("Apartment", "cat_1", "Buy or rent a  1BHK/2BHK apartment at a affordable price", 1500.0));
        Homelist.add(new HomeDomain("Bungalow", "cat_2", "Buy Bunglow at a affordable price", 180.79));
        Homelist.add(new HomeDomain("Castle", "cat_3", " Buy Castle at a affordable price", 108.5));
        Homelist.add(new HomeDomain("Farm House", "cat_4", " Buy Farm House at a affordable price", 80.5));
        Homelist.add(new HomeDomain("House", "cat_5", " Buy house at a affordable price", 88.5));
        adapter2 = new PopularAdapter(Homelist);
        recyclerViewPopularList.setAdapter(adapter2);

    }


}
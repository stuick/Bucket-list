package com.stuick.mybucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardViewFood = findViewById(R.id.card_view_food);
        CardView cardViewTravel = findViewById(R.id.card_view_travel);
        CardView cardViewLifestyle = findViewById(R.id.card_view_lifestyle);

        cardViewFood.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, FoodToTry.class);
            startActivity(intent);
        });

        cardViewTravel.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, PlacesToVisit.class);
            startActivity(intent);
        });

        cardViewLifestyle.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, LifestyleChanges.class);
            startActivity(intent);
        });
    }
}
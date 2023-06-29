package com.stuick.mybucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.stuick.mybucketlistapp.adapters.ItemAdapter;
import com.stuick.mybucketlistapp.entities.Item;

public class PlacesToVisit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_visit);

        RecyclerView placesList = findViewById(R.id.recycler_view_item_list);
        Item[] Items = new Item[]{
                new Item("Bangalore", R.drawable.bangalore, "India"),
                new Item("Reunion", R.drawable.ile_de_la_reunion, "France"),
                new Item("Abidjan", R.drawable.abidjan, "Cote d'Ivoire")
        };

        ItemAdapter itemAdapter = new ItemAdapter(Items);
        placesList.setAdapter(itemAdapter);
    }
}
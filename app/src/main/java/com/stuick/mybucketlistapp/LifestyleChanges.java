package com.stuick.mybucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.stuick.mybucketlistapp.adapters.ItemAdapter;
import com.stuick.mybucketlistapp.entities.Item;

public class LifestyleChanges extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifestyle_changes);

        RecyclerView lifestyleChanges = findViewById(R.id.recycler_view_item_list);
        Item[] Items = new Item[]{
                new Item("Ferme des Diallo", R.drawable.farm, "United States of America"),
                new Item("Three bedroom apartment", R.drawable.apartment, "United States of America"),
                new Item("Vacation Home", R.drawable.house, "Cote d'Ivoire"),
                new Item("Gaming room", R.drawable.gaming_room, "United States of America")
        };

        ItemAdapter itemAdapter = new ItemAdapter(Items);
        lifestyleChanges.setAdapter(itemAdapter);
    }
}
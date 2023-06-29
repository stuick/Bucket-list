package com.stuick.mybucketlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.stuick.mybucketlistapp.adapters.ItemAdapter;
import com.stuick.mybucketlistapp.entities.Item;

public class FoodToTry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_to_try);

        RecyclerView foodList = findViewById(R.id.recycler_view_item_list);

        Item[] Items = new Item[]{
                new Item("Poulet braise", R.drawable.poulet_braise, "Abidjan"),
                new Item("Poisson braise", R.drawable.poisson_braise, "Abidjan"),
                new Item("Chicken biryani", R.drawable.chicken_biryani, "Bangalore")
        };

        ItemAdapter itemAdapter = new ItemAdapter(Items);
        foodList.setAdapter(itemAdapter);
    }
}
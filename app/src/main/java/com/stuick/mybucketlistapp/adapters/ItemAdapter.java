package com.stuick.mybucketlistapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.stuick.mybucketlistapp.R;
import com.stuick.mybucketlistapp.entities.Item;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.FoodViewHolder> {

    Item[] Items;

    public ItemAdapter(Item[] Items) {
        this.Items = Items;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.items_details, parent, false);

        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        holder.bind(Items[position]);
    }

    @Override
    public int getItemCount() {
        return Items.length;
    }


    static class FoodViewHolder extends RecyclerView.ViewHolder {

        private ImageView foodImage;
        private TextView foodName;
        private TextView foodCity;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.image_view_item_icon);
            foodName = itemView.findViewById(R.id.text_view_item_title);
            foodCity = itemView.findViewById(R.id.text_view_item_details);
        }

        public void bind(Item item) {
            foodImage.setImageResource(item.image);
            foodName.setText(item.name);
            foodCity.setText(item.location);
        }
    }
}

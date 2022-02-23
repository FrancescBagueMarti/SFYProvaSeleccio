package com.example.sfy_provaseleccio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sfy_provaseleccio.models.Flower;
import com.squareup.picasso.Picasso;


import java.util.ArrayList;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.ViewHolder> implements View.OnClickListener {

    private ArrayList<Flower> flowers;
    private View.OnClickListener listener;

    public FlowerAdapter(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView flowerImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.flowerImage = itemView.findViewById(R.id.flowerImage);
        }

        void bindFlower(Flower flower){
            Picasso.get()
                    .load(flower.getUrls().getRegular())
                    .fit()
                    .centerCrop()
                    .into(flowerImage);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.image_item, parent, false);

        item.setOnClickListener(this);

        return new ViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull FlowerAdapter.ViewHolder holder, int position) {
        holder.bindFlower(flowers.get((position)));
    }

    @Override
    public int getItemCount() {
        return this.flowers.size();
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        if (listener != null) {
            listener.onClick(view);
        }
    }

}
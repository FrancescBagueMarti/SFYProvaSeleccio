package com.example.sfy_provaseleccio;

import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sfy_provaseleccio.model.Flower;

import java.util.ArrayList;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerAdapter.ViewHolder> implements RecyclerView.ViewHolder {
    private ArrayList<Flower> flowers;
    private View.OnClickListener listener;

    public FlowerAdapter(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView flowerImage;

        public ViewHolder(@NonNull View item) {
            super(item);
            flowerImage = item.findViewById(R.id.flowerImage);

        }
    }
}

package com.example.sfy_provaseleccio;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public ImageAdapter.ImageViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull ImageAdapter.ImageViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder {
        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}

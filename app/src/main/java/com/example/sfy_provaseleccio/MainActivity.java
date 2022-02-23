package com.example.sfy_provaseleccio;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.sfy_provaseleccio.api.ApiInterface;
import com.example.sfy_provaseleccio.api.ApiUtilities;
import com.example.sfy_provaseleccio.api.MyApi;
import com.example.sfy_provaseleccio.model.Flower;
import com.example.sfy_provaseleccio.model.FlowerList;
import com.example.sfy_provaseleccio.model.ImageModel;
import com.example.sfy_provaseleccio.model.SearchModel;
import com.unsplash.pickerandroid.photopicker.UnsplashPhotoPicker;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String API_URL = "https://api.unsplash.com/";
    public static final String ACCESS_KEY = "1kLtQJF4l-FvQ0JxZbcmicmn6qPRRsqeL9IFz_Mj6r4";

    RecyclerView recycler;
    ArrayList<Flower> searchedFlowersList;
    FlowerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.flowerList);
        if (searchedFlowersList == null) {
            searchedFlowersList = new ArrayList<>();
            searchFlowers("flowers");
        }

        adapter = new FlowerAdapter(searchedFlowersList);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recycler.setAdapter(adapter);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Flower flower = searchedFlowersList
                        .get(recycler.getChildAdapterPosition(view));

                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(DetailActivity.FLOWER, flower);
                startActivity(intent);
            }
        });
    }
    public void searchFlowers(String query) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        MyApi flowerApi  = retrofit.create(MyApi.class);

        Call<FlowerList> flowersCall = flowerApi.searchImages(query, MainActivity.ACCESS_KEY);
        flowersCall.enqueue(new Callback<FlowerList>() {
            @Override
            public void onResponse(Call<FlowerList> call, Response<FlowerList> response) {
                if (response.isSuccessful()) {
                    updateFlowersData(response.body().getSearchResults());
                }
            }

            @Override
            public void onFailure(Call<FlowerList> call, Throwable t) {

            }
        });
    }
    public void updateFlowersData(ArrayList<Flower> images) {
        this.searchedFlowersList.clear();
        this.searchedFlowersList.addAll(images);
        adapter.notifyDataSetChanged();
    }
}
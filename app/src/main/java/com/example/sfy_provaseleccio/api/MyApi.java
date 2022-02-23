package com.example.sfy_provaseleccio.api;

import com.example.sfy_provaseleccio.models.FlowerList;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MyApi {

/*
    @Headers("Authorization: Client-ID "+ACCESS_KEY)
    @GET("photos/")
    Call<List<Flower>> getImages(
            @Query("page/") int page,
            @Query("per_page/") int perPage
    );
*/
    @GET("/search/photos")
    Call<FlowerList> searchImages(@Query("query") String query, @Query("client_id") String client_id);
}

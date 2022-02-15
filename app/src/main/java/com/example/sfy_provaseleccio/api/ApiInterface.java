package com.example.sfy_provaseleccio.api;

import static com.example.sfy_provaseleccio.api.ApiUtilities.API_KEY;

import com.example.sfy_provaseleccio.model.ImageModel;
import com.example.sfy_provaseleccio.model.SearchModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiInterface {

    @Headers("Authorization: Client_ID "+API_KEY)
    @GET("/photos")
    Call<List<ImageModel>> getImages(
            @Query("page") int page,
            @Query("per_page") int perPage
    );

    @Headers("Authorization: Client_ID "+API_KEY)
    @GET("/search/photos")
    Call<SearchModel> searchImage(
            @Query("query") String query
    );
}

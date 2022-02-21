package com.example.sfy_provaseleccio.api;

import com.example.sfy_provaseleccio.model.Flower;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public class MyApi {
    public static final String API_URL = "https://api.unsplash.com/";
    public static final String ACCESS_KEY = "1kLtQJF4l-FvQ0JxZbcmicmn6qPRRsqeL9IFz_Mj6r4";
    public static Retrofit retrofit = null;

    public interface ApiRequest {
        @Headers("Authorization: Client-ID "+ACCESS_KEY)
        @GET("photos")
        Call<List<Flower>> getImages(
                @Query("page") int page,
                @Query("per_page") int perPage
        );
    }

    public static ApiRequest getApiInterface(){
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(API_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ApiRequest.class);
    }
}

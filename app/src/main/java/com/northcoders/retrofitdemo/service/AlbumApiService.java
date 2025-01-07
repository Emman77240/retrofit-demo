package com.northcoders.retrofitdemo.service;

import com.northcoders.retrofitdemo.model.Album;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;


public interface AlbumApiService {
    @GET("records")
    Call<List<Album>> getAllAlbums();

    @POST("recordshop")
    Call<Album> addAlbum(@Body Album album);
}

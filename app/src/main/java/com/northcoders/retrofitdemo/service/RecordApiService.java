package com.northcoders.retrofitdemo.service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RecordApiService {
    @GET("records")
    Call<List<Record>> getRecordsList();
}

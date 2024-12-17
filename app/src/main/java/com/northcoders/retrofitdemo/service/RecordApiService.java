package com.northcoders.retrofitdemo.service;

import com.northcoders.retrofitdemo.model.Record;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


public interface RecordApiService {
    @GET("records")
    Call<List<Record>> getRecordsList();
}

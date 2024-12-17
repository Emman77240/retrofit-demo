package com.northcoders.retrofitdemo.model;

import static com.northcoders.retrofitdemo.service.RetrofitInstance.getService;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.northcoders.retrofitdemo.service.RecordApiService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RecordRepository extends LiveData<List<Record>> {
    private MutableLiveData<List<Record>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public RecordRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<List<Record>> getMutableLiveData() {
        RecordApiService recordApiService = getService();
        Call<List<Record>> call = recordApiService.getRecordsList();
        call.enqueue(new Callback<List<Record>>() {
            @Override
            public void onResponse(Call<List<Record>> call, Response<List<Record>> response) {
                List<Record> responseList = response.body();
                mutableLiveData.setValue(responseList);
            }

            @Override
            public void onFailure(Call<List<Record>> call, Throwable t) {
                System.out.println(t);
            }
        });

        return mutableLiveData;

    }
}



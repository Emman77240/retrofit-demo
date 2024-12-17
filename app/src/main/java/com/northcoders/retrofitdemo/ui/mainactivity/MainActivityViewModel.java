package com.northcoders.retrofitdemo.ui.mainactivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.northcoders.retrofitdemo.model.Record;
import com.northcoders.retrofitdemo.model.RecordRepository;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private RecordRepository recordRepository;
    public MainActivityViewModel(@NonNull Application application, RecordRepository recordRepository) {
        super(application);
        this.recordRepository = new RecordRepository(application);
    }

    public LiveData<List<Record>> getAllRecords() {
        return recordRepository.getMutableLiveData();
    }
}

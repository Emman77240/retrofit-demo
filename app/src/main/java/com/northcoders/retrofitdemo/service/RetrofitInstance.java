package com.northcoders.retrofitdemo.service;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

public class RetrofitInstance {
    private static Retrofit retrofit = null;
    private static final String baseURL = "http://10.0.2.2/api/v1/recordshop/";

    public static RecordApiService getService() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(logging).build();

        if(retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .client(client)
                    .build();
        }
        return null;
    }
}
package com.northcoders.retrofitdemo.model;


import com.google.gson.annotations.SerializedName;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Record {
    @SerializedName("id")
    private Long id;

    @SerializedName("name")
    private String name;

    @SerializedName("artist")
    private String artist;

    @SerializedName("songs")
    private List<String> songs;

    @SerializedName("releaseYear")
    private int releaseYear;

    @SerializedName("inStock")
    private boolean inStock;

}

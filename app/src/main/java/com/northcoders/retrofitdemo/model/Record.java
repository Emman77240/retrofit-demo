package com.northcoders.retrofitdemo.model;


import com.google.gson.annotations.SerializedName;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Record {

    private Long id;
    private String name;
    private String artist;
    private List<String> songs;
    private int releaseYear;
    private boolean inStock;

}

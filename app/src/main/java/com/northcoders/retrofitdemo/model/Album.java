package com.northcoders.retrofitdemo.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.northcoders.retrofitdemo.BR;

import java.util.List;

public class Album extends BaseObservable {
    private Long id;
    private String name;
    private String artist;
    private List<String> songs;
    private int releaseYear;
    private boolean inStock;

    public Album(Long id, String name, String artist, List<String> songs, int releaseYear, boolean inStock) {
        this.id = id;
        this.name = name;
        this.artist = artist;
        this.songs = songs;
        this.releaseYear = releaseYear;
        this.inStock = inStock;
    }

    public Album() {

    }
    @Bindable
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
        notifyPropertyChanged(BR.artist);
    }

    @Bindable
    public List<String> getSongs() {
        return songs;
    }

    public void setSongs(List<String> songs) {
        this.songs = songs;
        notifyPropertyChanged(BR.songs);
    }

    @Bindable
    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
        notifyPropertyChanged(BR.releaseYear);
    }

    @Bindable
    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        notifyPropertyChanged(BR.inStock);
    }
}

package com.northcoders.retrofitdemo.ui.mainactivity;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.northcoders.retrofitdemo.databinding.AlbumItemBinding;
import com.northcoders.retrofitdemo.model.Album;
import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.northcoders.retrofitdemo.R;
import java.util.ArrayList;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {
    private ArrayList<Album> albumList;
    public AlbumAdapter(ArrayList<Album> albumList) {
        this.albumList = albumList;
    }

    public static class AlbumViewHolder extends RecyclerView.ViewHolder {
        private AlbumItemBinding albumItemBinding;

        public AlbumViewHolder(AlbumItemBinding albumItemBinding) {
            super(albumItemBinding.getRoot());
            this.albumItemBinding = albumItemBinding;
        }
    }


    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        AlbumItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.album_item, parent, false);


        return new AlbumViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder holder, int position) {
        Album album = albumList.get(position);
        holder.albumItemBinding.setAlbum(album);

    }

    @Override
    public int getItemCount() {
        if (albumList == null || albumList.isEmpty()) {
            Log.d("LIST_CHECK", "The album list is empty.");
        } else {
            Log.d("LIST_CHECK", "The album list has data. Size: " + albumList.size());
        }

        return albumList.size();
    }




}



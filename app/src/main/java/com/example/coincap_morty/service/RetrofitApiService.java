package com.example.coincap_morty.service;

import android.hardware.lights.LightState;

import com.example.coincap_morty.entity.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitApiService {
    @GET("posts/{id}")
    Call<Message> getMessageId(@Path("id")int id);

    @GET("posts")
    Call<List<Message>> getMessagesUserId(@Query("userId") int userId);
}

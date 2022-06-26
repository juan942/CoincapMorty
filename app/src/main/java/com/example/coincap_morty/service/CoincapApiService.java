package com.example.coincap_morty.service;

import com.example.coincap_morty.entity.Message;
import com.example.coincap_morty.entity.coin_cap.CoinCap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CoincapApiService {
    @GET("assets/{id}")
    Call<CoinCap> getAssetById(@Path("id")String id);
}

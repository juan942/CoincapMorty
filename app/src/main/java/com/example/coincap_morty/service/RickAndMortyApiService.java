package com.example.coincap_morty.service;

import com.example.coincap_morty.entity.coin_cap.CoinCap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RickAndMortyApiService {
    @GET("character/{id}")
    Call<Character> getCharacterById(@Path("id")int id);
}

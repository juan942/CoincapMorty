package com.example.coincap_morty.service;

import com.example.coincap_morty.entity.coin_cap.CoinCap;
import com.example.coincap_morty.entity.rick_and_morty.Character;
import com.example.coincap_morty.entity.rick_and_morty.Episode;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RickAndMortyApiService {
    @GET("character/{id}")
    Call<Character> getCharacterById(@Path("id")int id);

    @GET("episode/{id}")
    Call<Episode> getEpisodeById(@Path("id")int id);
}

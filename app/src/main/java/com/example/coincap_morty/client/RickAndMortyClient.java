package com.example.coincap_morty.client;

import com.example.coincap_morty.service.RetrofitApiService;
import com.example.coincap_morty.service.RickAndMortyApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RickAndMortyClient {
    public static final String BASE_URL = "https://rickandmortyapi.com/api/";
    // Creamos una instancia de la libreria Retrofit
    private static Retrofit retrofit;

    public static RickAndMortyApiService getApiService() {
        // Si el objeto de retrofit no existe, lo creamos
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL) // URL base
                    .addConverterFactory(GsonConverterFactory.create()) // Convertir el tipo a un objto que Java reconoce
                    .build(); // Construimos
        }
        return retrofit.create(RickAndMortyApiService.class);
    }
}

package com.example.coincap_morty.client;

import com.example.coincap_morty.service.RetrofitApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static final String URL_BASE = "https://jsonplaceholder.typicode.com/";
    // Creamos una instancia de la libreria Retrofit
    private static Retrofit retrofit;

    public static RetrofitApiService getApiService() {
        // Si el objeto de retrofit no existe, lo creamos
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(URL_BASE) // URL base
                    .addConverterFactory(GsonConverterFactory.create()) // Convertir el tipo a un objto que Java reconoce
                    .build(); // Construimos
        }
        return retrofit.create(RetrofitApiService.class);
    }
}

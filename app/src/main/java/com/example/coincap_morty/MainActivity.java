package com.example.coincap_morty;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.coincap_morty.client.CoinCapClient;
import com.example.coincap_morty.client.RetrofitClient;
import com.example.coincap_morty.client.RickAndMortyClient;
import com.example.coincap_morty.databinding.ActivityMainBinding;
import com.example.coincap_morty.entity.Message;
import com.example.coincap_morty.entity.coin_cap.CoinCap;
import com.example.coincap_morty.entity.rick_and_morty.Character;
import com.example.coincap_morty.entity.rick_and_morty.Episode;
import com.example.coincap_morty.service.CoincapApiService;
import com.example.coincap_morty.service.RetrofitApiService;
import com.example.coincap_morty.service.RickAndMortyApiService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends Activity {

    private TextView mTextView;
    private ActivityMainBinding binding;
    // Interfaces de los servicios
    // ---- interface de Ejemplo
    private RetrofitApiService apiService;
    // ---- interface de Coincap
    private CoincapApiService coincapService;
    // ---- interface de RickAndMorty
    private RickAndMortyApiService rickAndMortyService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initView();
        initValues();
        // ---- Metodo de CoinCap
        // getRandomCoin();
        // ---- Metodo de RickAndMorty
        getRandomCharacter();
        //getRandomEpisode();
        // ---- Metodos de ejemplo
        //getMessage(50);
        // getMessages(2);

    }

    // (1) Declaramos los componentes de la vista
    private void initView() {
        mTextView = binding.noteTextView;
    }

    // (2) Iniciamos las variables que utilizaremos
    private void initValues() {
        // Iniciamos las instancias de nuestros clientes
        // ---- Cliente de ejemplo
        apiService = RetrofitClient.getApiService();
        // ---- Cliente de CoinCap
        coincapService = CoinCapClient.getApiService();
        // ---- Cliente de Rick and Morty
        rickAndMortyService = RickAndMortyClient.getApiService();
    }

    // (3) Metodos del sistema
    // ---- Metodo para consumir Api de CoinCap
    private void getRandomCoin() {
        // Lista de ids de las criptomonedas
        List<String> coins = Arrays.asList(
                "bitcoin", "ethereum", "ripple", "bitcoin-cash", "eos", "stellar",
                "litecoin", "cardano", "tether", "iota", "tron", "ethereum-classic",
                "monero", "neo"
        );
        // Obtenemos un Id aleatorio de la lista con la libreria de Random
        Random rand = new Random();
        String id = coins.get(rand.nextInt(coins.size()));
        // Lanzamos nuestra peticion de la cripto
        coincapService.getAssetById(id).enqueue(new Callback<CoinCap>() {
            @Override
            public void onResponse(Call<CoinCap> call, Response<CoinCap> response) {
                CoinCap coincap = response.body();
                mTextView.setText(coincap.toString());
            }

            @Override
            public void onFailure(Call<CoinCap> call, Throwable t) {
                mTextView.setText(t.getMessage());
            }
        });
    }

    // ---- Metodo para consumir Api de RickAndMorty
    private void getRandomCharacter() {
        Random rand = new Random();
        int id = rand.nextInt(826);
        rickAndMortyService.getCharacterById(id).enqueue(new Callback<Character>() {
            @Override
            public void onResponse(Call<Character> call, Response<Character> response) {
                Character chart = response.body();
                mTextView.setText(chart.toString());
            }

            @Override
            public void onFailure(Call<Character> call, Throwable t) {
                mTextView.setText(t.getMessage());
            }
        });
    }

    private void getRandomEpisode() {
        Random rand = new Random();
        int id = rand.nextInt(51);
        rickAndMortyService.getEpisodeById(id).enqueue(new Callback<Episode>() {
            @Override
            public void onResponse(Call<Episode> call, Response<Episode> response) {
                Episode episode = response.body();
                mTextView.setText(episode.toString());
            }

            @Override
            public void onFailure(Call<Episode> call, Throwable t) {
                mTextView.setText(t.getMessage());
            }
        });
    }

    // ---- Metodos de ejemplo
    private void getMessage(int id) {
        apiService.getMessageId(id).enqueue(new Callback<Message>() {
            @Override
            public void onResponse(Call<Message> call, Response<Message> response) {
                Message msg = response.body();
                mTextView.setText(msg.toString());
            }

            @Override
            public void onFailure(Call<Message> call, Throwable t) {
                mTextView.setText(t.getMessage());
            }
        });
    }

    private void getMessages(int id) {
        apiService.getMessagesUserId(id).enqueue(new Callback<List<Message>>() {
            @Override
            public void onResponse(Call<List<Message>> call, Response<List<Message>> response) {
                List<Message> list = response.body();
                mTextView.setText("El numero de mensajes recuperados es: " + list.size() + "\n\n" + list.get(list.size()-1).toString());
            }

            @Override
            public void onFailure(Call<List<Message>> call, Throwable t) {
                mTextView.setText(t.getMessage());
            }
        });
    }
}
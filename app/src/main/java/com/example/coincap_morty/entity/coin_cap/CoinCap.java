package com.example.coincap_morty.entity.coin_cap;

public class CoinCap {
    private Coin data;
    private long timestamp;

    @Override
    public String toString() {
        return "CoinCap{" +
                "data=" + data.toString() +
                ", timestamp=" + timestamp +
                '}';
    }
}

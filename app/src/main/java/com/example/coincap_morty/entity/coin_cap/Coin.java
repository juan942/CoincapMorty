package com.example.coincap_morty.entity.coin_cap;

public class Coin {
    private String id; 	// identificador único para el activo
    private String rank; 	// el rango está en orden ascendente - este número está directamente asociado con el marketcap mientras que el marketcap más alto recibe el rango 1
    private String symbol; 	// símbolo más común utilizado para identificar este activo en una bolsa
    private String name; 	// nombre propio del activo
    private String supply; 	// oferta disponible para el comercio
    private String maxSupply; 	// cantidad total de activos emitidos
    private String marketCapUsd; 	// oferta x precio
    private String volumeUsd24Hr; 	// cantidad de volumen de negociación representado en USD en las últimas 24 horas
    private String priceUsd; 	// precio ponderado por volumen basado en datos de mercado en tiempo real, traducido a USD
    private String changePercent24Hr; 	// la dirección y el cambio de valor en las últimas 24 horas
    private String vwap24Hr; 	// Precio medio ponderado por volumen en las últimas 24 horas

    @Override
    public String toString() {
        return "CoinCap{" +
                "id='" + id + '\'' +
                ", rank='" + rank + '\'' +
                ", symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", supply='" + supply + '\'' +
                ", maxSupply='" + maxSupply + '\'' +
                ", marketCapUsd='" + marketCapUsd + '\'' +
                ", volumeUsd24Hr='" + volumeUsd24Hr + '\'' +
                ", priceUsd='" + priceUsd + '\'' +
                ", changePercent24Hr='" + changePercent24Hr + '\'' +
                ", vwap24Hr='" + vwap24Hr + '\'' +
                '}';
    }
}

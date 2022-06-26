package com.example.coincap_morty.entity.rick_and_morty;

import java.util.Arrays;

public class Episode {
    private int id;
    private String name;
    private String air_date;
    private String episode;
    private String[] characters;
    private String url;
    private String created;

      @Override
      public String toString() {
            return "Episode{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", air_date='" + air_date + '\'' +
                    ", episode='" + episode + '\'' +
                    ", characters=" + Arrays.toString(characters) +
                    ", url='" + url + '\'' +
                    ", created='" + created + '\'' +
                    '}';
      }
}

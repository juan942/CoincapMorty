package com.example.coincap_morty.entity.rick_and_morty;

import java.util.Arrays;

public class Character {
    private int id;	                // El id del personaje.
    private String name;	        // El nombre del personaje.
    private String status;	        // El estado del personaje ("Vivo", "Muerto" o "desconocido").
    private String species;	        // La especie del personaje.
    private String type;	        // El tipo o subespecie del carácter.
    private String gender;	        // El género del personaje ("Femenino", "Masculino", "Sin género" o "desconocido").
    private Origin origin;          // Nombre y enlace al lugar de origen del personaje.
    private Location location;      // Nombre y enlace al último punto de localización conocido del personaje.
    private String image;	        // Enlace a la imagen del personaje. Todas las imágenes son de 300x300px y la mayoría son planos medios o retratos ya que están pensados para ser utilizados como avatares.
    private String[] episode;   // Lista de episodios en los que apareció este personaje.
    private String url;	 	        // Enlace al punto final de la URL del personaje.
    private String created;         // Hora de creación del personaje en la base de datos.

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", species='" + species + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", origin=" + origin.toString() +
                ", location=" + location.toString() +
                ", image='" + image + '\'' +
                ", episode=" + Arrays.toString(episode) +
                ", url='" + url + '\'' +
                ", created='" + created + '\'' +
                '}';
    }
}

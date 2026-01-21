package com.example._4prototype_reactivo;

import java.util.ArrayList;
import java.util.List;

public class Pokemon implements Prototype<Pokemon> {

    private String nombre;
    private String tipo;
    private Integer number;
    private List<String> ataques = new ArrayList<>();

    public Pokemon(String nombre, String tipo, Integer number, List<String> ataques) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.number = number;
        this.ataques = new ArrayList<>(ataques);
    }

    public Pokemon(Pokemon pokemon) {
        this.nombre = pokemon.nombre;
        this.tipo = pokemon.tipo;
        this.number = pokemon.number;
        this.ataques = new ArrayList<>(pokemon.ataques);
    }

    @Override
    public Pokemon clonar() {
        return new Pokemon(this);
    }

    public void setAtaques(String ataque) {
        ataques.add(ataque);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", number=" + number +
                ", ataques=" + ataques +
                '}';
    }


}

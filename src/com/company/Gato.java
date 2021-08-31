package com.company;

public class Gato extends Animal {
    private String razaDeGato="";
    private String duenio="";
    private String color = "";

    public Gato() {
        super();
    }

    public Gato(int edad, String nombre, double peso, boolean esMacho, char letra, String razaDeGato, String duenio, String color) {
        super(edad, nombre, peso, esMacho, letra);
        this.razaDeGato = razaDeGato;
        this.duenio = duenio;
        this.color = color;
    }



    public String getRazaDeGato() {
        return razaDeGato;
    }

    public void setRazaDeGato(String razaDeGato) {
        this.razaDeGato = razaDeGato;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

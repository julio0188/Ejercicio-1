package com.company;

public class Animal {
    //Atributos
    private int edad=0;
    private String nombre="";
    private double peso =0;
    private boolean esMacho;
    private char letra;

    public Animal() {
    }

    public Animal(int edad, String nombre, double peso, boolean esMacho, char letra) {
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
        this.esMacho = esMacho;
        this.letra = letra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean getEsMacho() {
        return esMacho;
    }

    public void setEsMacho(boolean esMacho) {
        this.esMacho = esMacho;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
}

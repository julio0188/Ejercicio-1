package com.company;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //ejercicio1();
        //ejercicio2();
        ejercicio3();
    }

    private static void ejercicio1() {
        System.out.println("Inicia Ejercicio 1:");
        Gato gato1 = new Gato(2,"Lorenz",
                3.3, true,'L',"Persa","Linda","Blanco");
        Gato gato2 = new Gato(7,"Tom",
                2.9, true,'T',"Criollo","Julio","Atigrado");

        //Se imprimen los datos de Gato1
        System.out.println("Informacion de gato 1");
        System.out.println("El gato pesa: " + gato1.getPeso() + " libras");
        System.out.println("El gato se llama: " + gato1.getNombre());
        System.out.println("El gato tiene: " + gato1.getEdad() + " anios");
        System.out.println("La primera letra del nombre del gato es:" + gato1.getLetra());
        if(gato1.getEsMacho()== true){
            System.out.println("El animal es: macho");
        }else
            System.out.println("El animal es: hembra");
        System.out.println("El gato es de raza: " + gato1.getRazaDeGato());
        System.out.println("El duenio del gato es: " + gato1.getDuenio());
        System.out.println("El gato es de color: " + gato1.getColor());

        //Se imprimen los datos de Gato2
        System.out.println("Informacion de gato 2");
        System.out.println("El gato pesa: " + gato2.getPeso() + " libras");
        System.out.println("El gato se llama: " + gato2.getNombre());
        System.out.println("El gato tiene: " + gato2.getEdad() + " anios");
        System.out.println("La primera letra del nombre del gato es:" + gato2.getLetra());
        if(gato2.getEsMacho()== true){
            System.out.println("El animal es: macho");
        }else
            System.out.println("El animal es: hembra");
        System.out.println("El gato es de raza: " + gato2.getRazaDeGato());
        System.out.println("El duenio del gato es: " + gato2.getDuenio());
        System.out.println("El gato es de color: " + gato2.getColor());

    }
    private static void ejercicio2() {
        List<String> listanombre = new ArrayList<>();
        listanombre.add("Hola");
        listanombre.add("soy");
        listanombre.add("Juan");
        listanombre.add("Perez");

        String nombre="";
        //recorremos la lista para alimentar la variable String
        for (String elementoListaString: listanombre) {
            nombre += elementoListaString.toString();
        }

        System.out.println("Ejercicio 2");
        System.out.println(nombre);

    }

    public static void ejercicio3(){
        double numero1=4;
        double numero2=2;
        //imprimimos el resultado de la suma
        System.out.println("La suma es: " + Calculadora.sumar2Numeros(numero1,numero2));
        //imprimimos el resultado de la resta
        System.out.println("La resta es: " + Calculadora.resta2Numeros(numero1,numero2));
        //imprimimos el resultado de la multiplicacion
        System.out.println("La multiplicacion es: " + Calculadora.multiplica2Numeros(numero1,numero2));
        //imprimimos el resultado de la division
        System.out.println("La division es: " + Calculadora.divide2Numeros(numero1,numero2));
        //imprimimos el resultado de la igualdad
        if (Calculadora.soniguales(numero1,numero2))
            System.out.println("Los numeros son iguales");
        else
            System.out.println("Los numeros son distintos");

    }
}

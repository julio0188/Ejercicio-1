package com.company;

public class Calculadora {

    static double sumar2Numeros(double num1, double num2){
        double resultado= num1 + num2;
        return resultado;
    }

    static double resta2Numeros(double num1, double num2){
        double resultado= num1 - num2;
        return resultado;
    }

    static double multiplica2Numeros(double num1, double num2){
        double resultado= num1 * num2;
        return resultado;
    }
    static double divide2Numeros(double num1, double num2){
        double resultado= num1 / num2;
        return resultado;
    }

    static boolean soniguales(double num1, double num2){
        boolean resultado;

        if(num1==num2)
            resultado=true;
        else
            resultado=false;

        return resultado;
    }

}

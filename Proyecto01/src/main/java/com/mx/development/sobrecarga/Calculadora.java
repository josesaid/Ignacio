package com.mx.development.sobrecarga;

//Sobrecarga
public class Calculadora {
    public int sumar(int x, int y){
        return x+y;
    }
    public int sumar(int x, int y, int z){
        return x+y+z;
    }
    public int sumar(int x, int y, int z, int a){
        return x+y+z+a;
    }
    public int sumar(int[]numeros){
        System.out.println("...int");
        int suma = 0;
        for(int i = 0; i<numeros.length; i++){
            suma = suma + numeros[i];
        }
        return suma;
    }
    public float sumar(float...numeros){
        System.out.println("float...");
        float suma = 0;
        for(int i = 0; i<numeros.length; i++){
            suma = suma + numeros[i];
        }
        return suma;
    }

}

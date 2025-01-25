package com.mx.development.sobrecarga;

public class CalculadoraQueSobrecargas {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(2,3);
        System.out.println("resultado: " + resultado);

        int resultado2 = calculadora.sumar(2,3, 4);
        System.out.println("resultado: " + resultado2);

        int resultado3 = calculadora.sumar(2,3, 4, 5);
        System.out.println("resultado: " + resultado3);

        //int[]numeros = new int[]{1,2,3,4,5,6,7,8,9,10,11,12, 13, 14, 15};
        float []numeros = {3.141529f, 5.68f };
        float resultado4 = calculadora.sumar(numeros);
        System.out.println("resultado4: " +resultado4);
    }

}

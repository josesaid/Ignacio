package com.mx.development.otros.string;

import java.util.Locale;

public class StringExampel {
    public static void main(String[] args) {
        String palabra = "Ignacio Calva";
        //palabra = palabra.toUpperCase();
        //System.out.println(palabra.toUpperCase());

        //thread-safe:
        //Permite manipular hilos (multiprocesamiento)
        StringBuffer sb = new StringBuffer();
        sb.append("Ignacio Calva".toUpperCase()).reverse().reverse();
        System.out.println(sb);

        StringBuilder sbuilder = new StringBuilder();
    }
}

package com.mx.development.otros.string;

public class StringReplace {
    public static void main(String[] args) {
        String texto  = "hoy es sábado 25 de enero en el planeta tierra....";
        texto = texto.replace('a', 'x');
        //System.out.println(texto);
        //System.out.println(texto.length());
        //System.out.println(texto.indexOf("sábxdo"));

        //buscamos la palabra "sábxdo"
        Object palabraBuscada = buscarPalabra (texto, "sábxdo");
        if(palabraBuscada instanceof String){
            System.out.println("palabra hallada: " + palabraBuscada);
        }else {
            System.out.println("Palabra no encontrada...");
        }

    }

    private static Object buscarPalabra(String oracion, String palabra){
        int initialIndex = oracion.indexOf(palabra);
        if(initialIndex == -1)
            return initialIndex;
        int endIndex = palabra.length();
        return oracion.substring(initialIndex, initialIndex + endIndex);
    }

}

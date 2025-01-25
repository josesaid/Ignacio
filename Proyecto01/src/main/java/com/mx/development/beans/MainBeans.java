package com.mx.development.beans;

public class MainBeans {
    public static void main(String[] args) {
        //Persona.direccion = "Calle naranja";
        Persona ignacio = new Persona();
        ignacio.setNombre("Ignacio");
        ignacio.setApellidoPaterno("Calva");
        ignacio.setApellidoMaterno("Obregon");
        System.out.println(ignacio);
        //------------

        //Persona.direccion = "Calle roja";
        Persona gabriel = new Persona();
        gabriel.setNombre("Gabriel");
        gabriel.setApellidoPaterno("Calva");
        gabriel.setApellidoMaterno("Coria");
        System.out.println(gabriel);

        //---------
        //Persona.direccion = "Calle de las flores 123...";
        System.out.println(ignacio);
        System.out.println(gabriel);
    }
}

package com.mx.development.otros;

import com.mx.development.encapsulamiento.EncapsulamientoEjemplo;

public class Main {

    public static void main(String[] args) /*throws Exception*/ {
        System.out.println("Hello, World!");
        /* for(int i=0; i<args.length; i++){
            System.out.println(args[i]);
        }*/

        EncapsulamientoEjemplo instancia = new EncapsulamientoEjemplo();
        try {
            instancia.setEdad(-19);
        } catch (Exception e) {
            System.err.println("1.- Número negativo no válidado ->" + e.getMessage());
        }
        instancia.setEmail("alguien@algunemail.com");
        instancia.setNumero(20);
        try{
            //instancia.edad = -10;
            instancia.setEdad(-10);
        }catch (Exception e){
            System.err.println("2.- Número negativo no válidado ->" + e.getMessage());
        }


        EncapsulamientoEjemplo instancia2 = new EncapsulamientoEjemplo();
        instancia2.setEmail("persona@algo.com");
        try {
            instancia2.setEdad(30);
        } catch (Exception e) {
            System.out.println("Número negativo no válidado");
        }        instancia2.setNumero(10);


    }

}

class A0{}
class A1{}
class A2{}
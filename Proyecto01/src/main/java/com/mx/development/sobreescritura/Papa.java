package com.mx.development.sobreescritura;

public class Papa extends Abuelo{
    /*private String direccionRancho;

    public String getDireccionRancho() {
        return direccionRancho;
    }

    public void setDireccionRancho(String direccionRancho) {
        this.direccionRancho = direccionRancho;
    }*/

    public int gastarMonedas(int monedas){
        if(monedas % 2 ==0) { //es un numero par?
            System.out.println("el papa: " + getNombre()+" está gastando multiplos de 2 en sus monedas: ("+monedas+")" );
        }
        int moneditas = getMonedasDeOro() - monedas; //reuso este método de la clase Abuelo.
        setMonedasDeOro(moneditas);
        return moneditas;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

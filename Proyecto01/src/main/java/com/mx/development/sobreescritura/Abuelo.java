package com.mx.development.sobreescritura;

import com.mx.development.beans.Persona;

public class Abuelo extends Persona {
    private int monedasDeOro = 100_000;


    public int getMonedasDeOro() {
        return monedasDeOro;
    }

    public void setMonedasDeOro(int monedasDeOro) {
        this.monedasDeOro = monedasDeOro;
    }

    public int gastarMonedas(int monedas){
        monedasDeOro = monedasDeOro - monedas;
        return monedasDeOro;
    }

    @Override
    public String toString() {
        return super.toString() +", monedasDeOro: " + monedasDeOro +"\n";
    }

}

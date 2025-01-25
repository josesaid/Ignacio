package com.mx.development.sobreescritura;

public class Nieto extends Papa{
    private Fabrica[] fabricas;

    public Fabrica[] getFabricas() {
        return fabricas;
    }

    public void setFabricas(Fabrica[] fabricas) {
        this.fabricas = fabricas;
    }

    public int gastarMonedas(int monedas){
        if(monedas % 2 ==1) { //es un numero impar?
            System.out.println("el nieto: " + getNombre()+" está gastando monedas: ("+monedas+", de manera 'IMPAR' " );
        }
        int moneditas = getMonedasDeOro() - monedas; //reuso este método de la clase Abuelo.
        setMonedasDeOro(moneditas);
        return moneditas;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<fabricas.length; i++){
            //String direccionFabrica = this.fabricas[i].getDireccion();
            String representanteLegal = this.fabricas[i].getRepresentanteLegal();
            String rfc = this.fabricas[i].getRfc().toUpperCase();
            sb.append("DireccionFabrica["+i).append("]: ").append(fabricas[i].getDireccion())
                    .append(", ")
            .append("representanteLegal: ").append(representanteLegal)
            .append(", rfc: ").append(rfc).append("\n");
        }
        return super.toString() + sb.toString();
    }
}

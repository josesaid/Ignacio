package com.mx.development.sobreescritura;

public class Familia {
    public static void main(String[] args) {
        Abuelo abuelo = new Abuelo();
        abuelo.setNombre("Fernando");
        abuelo.setApellidoPaterno("Fernandez");
        abuelo.setApellidoMaterno("Mendez");
        abuelo.setDireccion("Calle del abuelo 01");
        //Abuelo.direccion = "" //Está comentado para no compartir la misma direccion
        // por todos los posibles abuelos en este sistema.
        System.out.println(abuelo.toString());
        //Por defecto, el metodo to String es llamado aquí:
        //System.out.println(abuelo);

        Papa papa = new Papa();
        papa.setNombre("Felipe");
        papa.setApellidoPaterno("Carmona");
        papa.setApellidoMaterno("Mendez");
        papa.setMonedasDeOro(50_000);
        //papa.setDireccionRancho("Cerro de la estrella");
        papa.setDireccion("Que siempre no vive en el rancho, vive con la señora");
        System.out.println(papa);
        int saldoMonedas = papa.gastarMonedas(4);
        System.out.println("saldoMonedas: " + saldoMonedas);

        System.out.println("------------------------------------------");

        Nieto nieto = new Nieto();
        nieto.setNombre("Pancho");
        nieto.setApellidoPaterno("Carmona");
        nieto.setApellidoMaterno("Lopez");
        nieto.setMonedasDeOro(1_000_000);
        //nieto.setDireccionRancho("Cerro de la silla");
        Fabrica fabrica1 = new Fabrica();
        fabrica1.setDireccion("Calle morada 123");
        fabrica1.setRepresentanteLegal("Juan Perez");
        fabrica1.setRfc("JP123GHLK89");

        Fabrica fabrica2 = new Fabrica();
        fabrica2.setDireccion("Calle de la fabrica 2");
        fabrica2.setRepresentanteLegal("Pedro Perez");
        fabrica2.setRfc("PP123GHLK84");

        Fabrica[]fabricas = new Fabrica[]{ fabrica1, fabrica2};
        nieto.setFabricas(fabricas);
        //nieto.setFabricas(new Fabrica[]{ fabrica1});

        System.out.println(nieto);
    }
}

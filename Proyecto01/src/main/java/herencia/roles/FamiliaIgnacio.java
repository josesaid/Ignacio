package herencia.roles;

public class FamiliaIgnacio {
    public static void main(String[] args) {
        Familia familiaIgnacio = new Familia();

        Papa ignacio = new Papa("Nacho", true);
        Mama aurora = new Mama("Aurora", true);

        familiaIgnacio.agregarIntegrante(ignacio);
        familiaIgnacio.agregarIntegrante(aurora);
        familiaIgnacio.agregarIntegrante(new Hijo("Gabriel"));
        familiaIgnacio.agregarIntegrante(new Hijo("Derek"));

        int x = familiaIgnacio.getElementosEnLaFamilia();
        System.out.println("La familia de Ignacio tiene: " + x + " integrantes");

        //------------------------------------------------------------
        String[]esposos = familiaIgnacio.getNombresDeEsposos();
        System.out.println("Los nombres de las esposos son: ");
        for(String nombre : esposos){
            System.out.print(nombre+", ");
        }
        //------------------------------------------------------------
    }
}

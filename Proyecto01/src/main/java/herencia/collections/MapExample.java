package herencia.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Carro> autos = new HashMap<>();
        Carro fusion = new Carro();
        fusion.setNombre("Fusion Blanco bonito");
        fusion.setColor("Blanco");
        autos.put("ignacio", fusion);

        Carro suv = new Carro();
        suv.setNombre("SUV Honda Azul precioso");
        suv.setColor("Azul");
        autos.put("aurora", suv);

        Carro ibiza = new Carro();
        ibiza.setNombre("Ibiza rojo con un llegue en el frente, pero corre bonito");
        ibiza.setColor("rojo");
        autos.put("armando", ibiza);

        Carro grandCherokee = new Carro();
        grandCherokee.setNombre("GM Grand cherokee color plata, amplia para nuestro cuate");
        grandCherokee.setColor("plata");
        autos.put("Guty", grandCherokee);

        Carro posibleFusion = autos.get("armando");
        if(posibleFusion != null) {
            String descripcionAuto = posibleFusion.getNombre();
            String color = posibleFusion.getColor();
            System.out.println("descripcionAuto: " + descripcionAuto+" y el color es: " + color);
        }else{
            System.out.println("El auto no fue encontrado con la llave proporcionada");
        }

    }
}

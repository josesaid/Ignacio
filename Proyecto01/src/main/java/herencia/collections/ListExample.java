package herencia.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListExample {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        Random r = new Random();
        for(int i=0; i<500; i++){
            //int numeroAleatorio = r.nextInt(1, 100);
            //nombres.add(""+i+"_"+numeroAleatorio);
            nombres.add("ignacio");
        }
        for(String nombre: nombres){
            System.out.println("Item: " + nombre);
        }
        System.out.println("Creados: " + nombres.size()+" elementos...");
    }
}

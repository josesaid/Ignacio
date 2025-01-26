package herencia.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> nombres = new HashSet<>();
        System.out.println(nombres.add("ignacio"));
        System.out.println(nombres.add("aurora"));
        System.out.println(nombres.add("aurora")); //x
        System.out.println(nombres.add("derek"));
        System.out.println(nombres.add("gabriel"));
        System.out.println(nombres.add("aurora")); //x
        System.out.println("Elementos: " + nombres.size());
    }
}

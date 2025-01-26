package herencia.roles;

import java.util.ArrayList;
import java.util.List;

public class Familia {
    List<Integrante> integrantes = new ArrayList<>();

    public void agregarIntegrante(Integrante integrante) {
        integrantes.add(integrante);
    }

    public int getElementosEnLaFamilia(){
        return integrantes.size();
    }

    public String[] getNombresDeEsposos() {
        List<String> nombres = new ArrayList<>();
        for(int i=0; i<integrantes.size(); i++){
            Integrante persona = integrantes.get(i);
            if(persona instanceof Papa){
                Papa varon = (Papa)persona;
                nombres.add(varon.getNombre());
            }else
            if(persona instanceof Mama){
                Mama mujer = (Mama)persona;
                nombres.add(mujer.getNombre());
            }
        }
        return nombres.toArray(String[]::new);
    }
}

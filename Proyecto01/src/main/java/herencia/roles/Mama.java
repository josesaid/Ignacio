package herencia.roles;

public class Mama implements Integrante{
    private String nombre;
    private boolean esTutor;

    public Mama(String nombre, boolean esTutor){
        this.nombre = nombre;
        this.esTutor = esTutor;
    }

    public String getNombre() {
        return nombre;
    }
    public boolean isEsTutor(){
        return esTutor;
    }
}

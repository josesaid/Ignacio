package herencia.roles;

public class Papa implements Integrante,  Orientador, Proveedor {

    private boolean esTutor;
    private String nombre;
    public Papa(String nombre, boolean esTutor){
        this.nombre = nombre;
        this.esTutor = esTutor;
    }

    public void orientar(){
        System.out.println("Orientando a mi hijo");
    }
    public void proveerEconomicamente(){
        System.out.println("Manteniendo enonomicamente al joven");
    }

    public String getNombre() {
        return nombre;
    }
    public boolean isEsTutor(){
        return esTutor;
    }
}

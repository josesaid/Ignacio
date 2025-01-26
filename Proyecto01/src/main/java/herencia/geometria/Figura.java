package herencia.geometria;

public class Figura implements Dibujable{
    private String nombre;
    private int lados;

    public Figura(){
        nombre = "sin nombre";
        lados = 0;
    }
    public Figura(String nombre, int lados){
        this.nombre = nombre;
        this.lados = lados;
        //setNombre(nombre);
        //setLados(lados);
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    @Override
    public void dibujar() {
        System.out.println("Figura... dibujar");
    }
}

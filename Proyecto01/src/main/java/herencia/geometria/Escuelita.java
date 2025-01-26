package herencia.geometria;

public class Escuelita {
    public static void main(String[] args) {
        //Figura f = new Figura();
        Dibujable f = new Figura();
        Figura f2 = (Figura)f;
        f2.setLados(3);
        f2.setNombre("triangulo");
        f.dibujar();

        Figura c = new Cuadrado();
        //Dibujable c = new Cuadrado();
        //c.setLados(4);
        //c.setNombre("cuadrado");
        c.dibujar();

    }
}

import abstractas.Cuadrado;
import abstractas.FigurasGeometricas;
import abstractas.Rectangulo;

public class Main {
    public static void main(String[] args) {
        FigurasGeometricas figura = new Rectangulo("Rectangulo1");
        figura.dibujar();

        figura=new Cuadrado("Cuadrado");
        figura.dibujar();
    }
}
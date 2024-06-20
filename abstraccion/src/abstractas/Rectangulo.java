package abstractas;

public class Rectangulo extends FigurasGeometricas {
    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    public void dibujar() {
        System.out.println("Se dibuja un: " + getClass().getSimpleName());
    }
}

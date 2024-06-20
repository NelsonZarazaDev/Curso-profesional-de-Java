package abstractas;

public abstract class FigurasGeometricas {
    protected String tipoFigura;

    protected FigurasGeometricas(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FigurasGeometricas{" +
                "tipoFigura='" + tipoFigura + '\'' +
                '}';
    }
}

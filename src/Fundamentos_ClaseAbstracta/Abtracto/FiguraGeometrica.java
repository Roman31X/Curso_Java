package Fundamentos_ClaseAbstracta.Abtracto;

public abstract class FiguraGeometrica {
    protected String figura;

    protected FiguraGeometrica(String figura) {
        this.figura = figura;
    }
    public abstract void dibujar();

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }
}

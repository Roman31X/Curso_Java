package Fundamentos_ClaseAbstracta.Abtracto;

public class Triangulo extends FiguraGeometrica {

    public Triangulo(String figura) {
        super(figura);
    }

    @Override
    public void dibujar() {
        System.out.println("Se imprime un : "+this.getClass().getSimpleName());
    }
}

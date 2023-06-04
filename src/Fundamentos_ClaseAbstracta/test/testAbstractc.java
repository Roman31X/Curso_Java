package Fundamentos_ClaseAbstracta.test;

import Fundamentos_ClaseAbstracta.Abtracto.FiguraGeometrica;
import Fundamentos_ClaseAbstracta.Abtracto.Triangulo;

public class testAbstractc {
    public static void main(String[] args) {
        //cuando el padre o la clase es abrstracta no se puede instanciar
        //objetos de la clase abstracta
        FiguraGeometrica figura = new Triangulo("Triangulo");
        figura.dibujar();

    }
}

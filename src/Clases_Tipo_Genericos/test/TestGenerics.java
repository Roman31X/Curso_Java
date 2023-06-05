package Clases_Tipo_Genericos.test;

import Clases_Tipo_Genericos.genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(16);
        objetoInt.obtenerTipo();

        ClaseGenerica<String> objetoString = new ClaseGenerica("Diego");
        objetoString.obtenerTipo();
    }

}

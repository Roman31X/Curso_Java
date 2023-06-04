package Fundamentos_Execpciones.Aritmetica;

import Fundamentos_Execpciones.OperacionExcepcion.ClasExcepcion;

public class AritmeticA {

    public static int division(int numerador, int denominador) throws ClasExcepcion{

        if(denominador == 0){
            throw new ClasExcepcion("No se puede divir entre 0");
        }

        return (numerador/denominador);

    }
}

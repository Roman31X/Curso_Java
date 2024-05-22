package Fundamentos_Excepciones.Aritmetica;

import Fundamentos_Excepciones.OperacionExcepcion.ClasExcepcion;

public class AritmeticA {

    public static int division(int numerador, int denominador) throws ClasExcepcion{

        if(denominador == 0){
            throw new ClasExcepcion("No se puede dividir entre 0");
        }

        return (numerador/denominador);

    }
}

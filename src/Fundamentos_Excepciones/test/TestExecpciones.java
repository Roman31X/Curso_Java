package Fundamentos_Excepciones.test;


import Fundamentos_Excepciones.OperacionExcepcion.ClasExcepcion;

import static Fundamentos_Excepciones.Aritmetica.AritmeticA.division;

public class TestExecpciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10, 0);

        }catch(ClasExcepcion e){//excepción creada simple
            System.out.println("Ocurrió un error de tipo : "+e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }catch (Exception e){//excepción general y mayor rango
            //e.printStackTrace(System.out); //toda la pila de excepción
            System.out.println("Ocurrió un error");
            System.out.println(e.getMessage());
        }

        //con esta instrucción se realiza el digo n su interior
        //También sirve para cerra recurso como conexiones
        //a base de datos
        finally{
            System.out.println("Se realizo recurso en finally");
        }
        System.out.println("resultado = " + resultado);

    }
}

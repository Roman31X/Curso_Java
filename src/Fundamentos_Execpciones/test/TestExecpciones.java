package Fundamentos_Execpciones.test;


import Fundamentos_Execpciones.OperacionExcepcion.ClasExcepcion;

import static Fundamentos_Execpciones.Aritmetica.AritmeticA.division;

public class TestExecpciones {
    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(10, 0);

        }catch(ClasExcepcion e){//execcion creada simple
            System.out.println("Ocurrio un error de tipo : "+e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }catch (Exception e){//execion general y mayor rango
            //e.printStackTrace(System.out); //toda la pila de execpcion
            System.out.println("Ocurrio un error");
            System.out.println(e.getMessage());
        }
        //con esta instrucción se realizara el digo n su interior
        //Tambien sirve para cerra recorso como conexiones
        //a base de datos
        finally{
            System.out.println("Se realizo recurso en finally");
        }
        System.out.println("resultado = " + resultado);

    }
}

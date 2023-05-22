package Operadores;

public class Operadores_Unarios {
    public static void main(String[] args) {
        //CREAMOS VARIBALES DONDE SE INVERTIRA DE POSITIVO A
        //NEGATIVO
        int a = 10;
        int b = -a;
        //mostrarlos valores de la variables
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        //CREAMOS VARIBALES DE TIPO BOOLEAN PARA INVERTIR DE VERDAD
        // A FALSO
        boolean respuesta = true;
        boolean respuesta2 = !respuesta;
        //mostramos el valor de las varibales
        System.out.println("respuesta = " + respuesta);
        System.out.println("respuesta2 = " + respuesta2);
        System.out.println();

        //OPERADORES UNARIOS DE INCREMENTO
        //1.- PREINCREMENTO [simbolo antes de la variable]
        ++a;
        System.out.println("a = " + a);
        //1.1- PREDECREMENTO [simbolo antes de la variable]
        --a;
        System.out.println("a = " + a);
        System.out.println();
        a=20;
        //2.- POSTINCREMENTO (simbolo despues de la variable)
        a++;
        System.out.println("a = " + a);
        //2.1- POSTIDECREMENTO (simbolo despues de la variable)
        a--;
        System.out.println("a = " + a);
    }
}

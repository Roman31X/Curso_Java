package Fundamentos_Operadores;

public class Operadores_Unarios {
    public static void main(String[] args) {
        //CREAMOS VARIABLES DONDE SE VA INVERTIR DE POSITIVO A
        //NEGATIVO
        int a = 10;
        int b = -a;

        //mostrarlos valores de las variables
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        //CREAMOS VARIABLES DE TIPO BOOLEAN PARA INVERTIR DE VERDAD
        // A FALSO
        boolean respuesta = true;
        boolean respuesta2 = !respuesta;
        //mostramos el valor de las variables
        System.out.println("respuesta = " + respuesta);
        System.out.println("respuesta2 = " + respuesta2);
        System.out.println();

        //OPERADORES UNARIOS DE INCREMENTO
        //1.- PRE-INCREMENTO [símbolo antes de la variable]
        ++a;
        System.out.println("a = " + a);

        //1.1- PRE-DECREMENTO [símbolo antes de la variable]
        --a;
        System.out.println("a = " + a);
        System.out.println();

        a=20;
        //2.- POST-INCREMENTO (símbolos después de la variable)
        a++;
        System.out.println("a = " + a);

        //2.1- POST-DECREMENTO (símbolos después de la variable)
        a--;
        System.out.println("a = " + a);
    }
}

package Fundamentos_Clases_Metodos_Objetos;

public class Clase_Calculo {
    /*
    public static void main(String[] args) {
        int a=20;
        int b=10;
        System.out.println(Valor(a,b));
        System.out.println("La suma de a + b es: "+Suma(a,b));
        System.out.println("La resta de a - b es: "+Resta(a,b));
        System.out.println("La multiplicación de a * b es: "+Multiplicacion(a,b));
        System.out.println("La division de a '/' b es: "+Division(a,b));

    }*/
    //crear clases son buenas prácticas
    //creamos las clases fuera del main
    //método para mostrar datos de la variable
    //JAVADOC [describir la función de la clase]
    //usa /**Descripción*/
    /**DESCRIPCIÓN
    * La clase Valor nos retornara una cadena de caracteres
    * la cual está siendo manipulada por la clase de tipo
    * @param a: Es el valor de la variable
    * @param b: Es el valor de la variable
    * String el cual soporta valores o suma de valor de
    * carácter*/
    public String Valor(int a, int b){
        return "La variables son: ["+a+" y "+b+"]";
    }

    /**
     * Descripcion: esta función realiza la suma de los valores
     * asignados
     * @param a  Valor asignado a
     * @param b  Valor asignado b
     * Finalmmente reguresa el valor de la suma
     * */
    public int Suma(int a, int b){
        return a + b;
    }

    public int Resta(int a, int b){
        return a - b;
    }

    public int Multiplicacion(int a, int b){
        return a * b;
    }

    public int Division(int a, int b){
        return a / b;
    }
}

package Introduccion;

import java.util.Scanner;

public class Conversion_PrimitivosJava {
    public static void main(String[] args) {
        //CONVERTIR UN [String a int]
        String edadCaracter = "20";
        System.out.println("edadCaracter = " + edadCaracter);
        System.out.println();
        //CONVERTIR UN [String a int]
        int edadEntero = Integer.parseInt(edadCaracter);
        System.out.println("edadEntero = " + edadEntero);
        System.out.println();

        //CONVERTIR UN [String a double]
        double pesoDecimal = Double.parseDouble(edadCaracter);
        System.out.println("pesoDecimal = " + pesoDecimal);

        //SOLICITAR POR CONSOLA UN DATO DE EDAD ENTERO
        Scanner sc = new Scanner(System.in);
        //solicitamos edad
        System.out.print("Usuario ingrese su edad => ");
        //variable encargada de recepción de dato
        String edadString = sc.nextLine();
        int edad = Integer.parseInt(edadString);
        System.out.println("La edad del usuario es : " + edad);
        System.out.println();

        //CONVERTIR UN [int a String]
        String edadString2 = String.valueOf(edad);
        System.out.println("edadString2 = " + edadString2);
        System.out.println();

        //COMO RECUPERAR UN CARACTER DE UNA CADENA
        String nombre = "Diego";
        System.out.println("nombre = " + nombre);
        /*Designamos una varible que almacenara un solo carácter
        * Mediante ".charAt()" podemos obtener un carácter de la cadena
        * de tipo String pero este necesita la posición del carácter a
        * recuperar de la cadena [D - 0] - [i - 1] - [e - 2] - [g - 3] - [o - 4]
        * */
        //POSICION [0]
        char caracter1 = nombre.charAt(0);
        System.out.println("caracter1 = " + caracter1);
        //POSICION [1]
        char carcater2 = nombre.charAt(1);
        System.out.println("carcater2 = " + carcater2);
        //POSICION [2]
        char carcater3 = nombre.charAt(2);
        System.out.println("carcater3 = " + carcater3);
        
    }
}

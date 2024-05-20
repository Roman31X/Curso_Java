package Fundamentos_Introduccion;

import java.util.Scanner;

public class Clase_Scanner {
    public static void main(String[] args) {
        //El método Scanner nos dara acceso al introducir mediante
        //teclado o consola

        /**PARA IMPLEMENTAR EL MÉTODO SCANNER
         * Para ello Java nos pide importar java como se observa en la
         * parte superior [import java.util.Scanner;]
         * mediante la instancia del sc poder usar sus métodos
         * mediante el "(System.in)" nos indica que captura
         * los datos ingresados mediante teclado o consola*/

        Scanner sc = new Scanner(System.in);

        //Solicitamos que digiten un dato para la variable nombre
        System.out.println("Ingrese su nombre USUARIO");

        //mediante el objeto "sc" crea una instancia del método "nextLine()"
        //que nos permite leer los datos en la línea de ejecución

        var nombre = sc.nextLine();
        System.out.println("El nombre del usuario es : [" + nombre + "]");
    }
}

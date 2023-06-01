package Ejercicio_Part_1;

import java.util.Scanner;

public class Prueba_Caja {
    //MÉTODO PRINCIPAL DE EJECUCIÓN MAIN
    public static void main(String[] args) {
        /**
         * ALMACENAMIENTO DE VARIABLE
         * Variables creadas en la clase se almacena en la memoria [MEMORIA STACK]
         * Las variables creadas de tipo OBJETO se almacenan en la memoria [MEMORIA HEAP]*/
        //IMPORTAMOS CLASE SCANNER PARA PODER RECIVIR
        //DATOS POR CONSOLA
        Scanner sc = new Scanner(System.in);
        //Creamos varibles para recepción de datos
        int ancho;
        int alto;
        int profundo;
        //Solicitamos por consola los datos para
        //[ancho - alto - profundo]
        System.out.print("Ingrese Ancho de la caja => ");
        ancho = sc.nextInt();
        System.out.print("Ingrese Alto de la caja => ");
        alto = sc.nextInt();
        System.out.print("Ingrese Profundidad de la caja => ");
        profundo = sc.nextInt();
        //Creamos Objetos de las clases para su ejecución
        Caja caja1 = new Caja();
        Caja caja2 = new Caja(ancho,alto,profundo);
        System.out.println("El volumen de la caja es : ["+caja2.CalculoVolumen(ancho,alto,profundo)+"]");
        System.out.println();
    }
}

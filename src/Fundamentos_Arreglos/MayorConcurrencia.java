package Fundamentos_Arreglos;

import java.util.Scanner;

public class MayorConcurrencia {
    /*
    * Para la tarea se debe crear un arreglo con 10 elementos
    * (enteros en el rango de 1 a 9). Escriba un programa que
    * imprima el número que tiene más ocurrencias en el arreglo
    * y también imprimir la cantidad de veces que aparece en
    * el arreglo.
    * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int dato = 0;
        int contador = 0;

        //LLENAMOS EL ARREGLO
        System.out.println("INGRESE NÚMEROS EN EL RANGO DE [1 - 10] ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero : ");
            dato = sc.nextInt();
            numeros[i] = dato;
        }
        int contadorDos = 0;
        int contadorMaximo = 0;
        int maximoRepetido = 0;
        int esidencia = 0;

        //Contar valor REPETIDOS
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                if(numeros[i] == numeros[j]){
                    contadorDos++;
                    maximoRepetido = numeros[i];
                }
            }
            if(contadorMaximo < contadorDos){
                contadorMaximo  = contadorDos;
                esidencia = maximoRepetido;
            }
            contadorDos = 0;
            maximoRepetido = 0;
        }

        System.out.println("El mayor ocurrencia es de : "+contadorMaximo);
        System.out.println("El numero que se repite : "+contadorMaximo+" es : "+esidencia);
    }
}

package Fundamentos_Arreglos;

import java.util.Scanner;

public class HistogramaRepeticiones {
    public static void main(String[] args) {
        /*
        * Escribir un programa que recorra un arreglo y genere un histograma en base a los valores de este.
        * El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.
        * Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece
        * en un conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6,
        * incluso si no están presente en el arreglo.
        * Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:
        * 1: ***
        * 2:
        * 3: *
        * 4: *****
        * 5: *
        * 6: **
        * */

        Scanner sc = new Scanner(System.in);
        int[] datos = new int[12];
        int numero = 0;
        System.out.println("INGRESE NÚMEROS DEL RANGO DE [1 - 6]");
        for (int i = 0; i < datos.length; i++) {
            System.out.print("Ingrese numero : ");
            numero = sc.nextInt();
            datos[i] = numero;
        }

        int aterisco = 0;
        for (int i = 1; i < 7; i++) {
            for (int j = 0; j < datos.length; j++) {
                if(i == datos[j]){
                    aterisco++;
                }
            }

            System.out.print(i + " : ");
            for (int j = 0; j < aterisco; j++) {
                System.out.print("*");
            }
            System.out.println();
            aterisco = 0;
        }
    }
}

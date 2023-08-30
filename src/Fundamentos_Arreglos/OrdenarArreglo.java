package Fundamentos_Arreglos;

import java.util.Scanner;

public class OrdenarArreglo {
    public static void main(String[] args) {
        //Ordenar los elementos del arreglo de 10 numeros
        //segun requierimientos

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int dato = 0;

        System.out.println("Ingrese 10 números");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingres numero : ");
            dato = sc.nextInt();
            numeros[i] = dato;
        }
        System.out.println("ARREGLO ORDENADO ULTIMO - PRIMERO, PENULTIMO - SEGUNDO SUCECIVAMENTE");

        int cantidad = numeros.length;

        System.out.println("cantidad = " + cantidad);

        for (int i = 0; i < numeros.length && i < cantidad; i++) {
            --cantidad;
            System.out.println(numeros[i]+" - "+numeros[cantidad]);
        }
    }
}

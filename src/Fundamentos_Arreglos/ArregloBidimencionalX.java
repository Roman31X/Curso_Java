package Fundamentos_Arreglos;

import java.util.Scanner;

public class ArregloBidimencionalX {
    public static void main(String[] args) {
        /*
        *Escribir un programa que imprima una X construida a base de la
        * letra X en las diagonales de la matriz y utilizar el carácter
        * guion bajo como relleno. El tamaño de la x se basa en una variable
        * n que indicará el tamaño de la letra para imprimir en una matriz
        * de n x n.
        * El carácter "X" en mayúscula y el guion bajo "_" para los espacios.
        * */

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.println("Ingrese un numero para la matriz cuadrada");
        System.out.print("Numero : ");
        numero = sc.nextInt();

        if(numero != 0){
            String[][] matriz = new String[numero][numero];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if(i == j || i+j == matriz[i].length -1){
                        matriz[i][j] = "x";
                    }else{
                        matriz[i][j]= "_";
                    }
                }
            }
            System.out.println("Matrix de ["+numero+" x "+numero+"]");
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j]+"\t");
                }
                System.out.println();
            }
        }else{
            System.out.println("ERROR el numero debe de ser diferente a 0");
        }

    }
}

package Fundamentos_Arreglos;

import java.util.Scanner;

public class Arreglohcomocerosyuno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = 0;
        System.out.println("Ingrese un numero para la matriz cuadrada");
        System.out.print("Numero : ");
        numero = sc.nextInt();
        int mitad = numero/2;

        if(numero != 0){
            int[][] matriz = new int[numero][numero];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if(i == mitad || j == 0 || (j == matriz[i].length - 1 && i>= mitad)){
                        matriz[i][j] = 1;
                    }else{
                        matriz[i][j]= 0;
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

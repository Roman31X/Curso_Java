package Fundamentos_Arreglos;

import java.util.Scanner;

public class NumeroMASALTOARREGLO {
    public static void main(String[] args) {
        //IMPRIMIR SOLO NÚMEROS ALTOS DE UN ARREGLO DE 7
        //        //ELEMENTOS POR EJEMPLO RANGO DE 11 A 99 {14,33,15,36,78,21,43]
        //        //QUE NO SE REPITA
        Scanner sc = new Scanner(System.in);
        //Tamaño arreglo
        int[] numeros = new int[7];
        int alto = 0;
        int dato = 0;

        //Solicitamos NÚMEROS
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero : ");
            dato = sc.nextInt();
            numeros[i] = dato;
            if(dato > alto){
                if(dato > 11 && dato < 99){
                    alto = dato;
                }
            }
        }

        System.out.println("El valor mas alto del arreglo es : "+alto);
    }
}

package Fundamentos_Arreglos;

import java.util.Scanner;

public class ArregloNumeroAltos {
    public static void main(String[] args) {

        //IMPRIMIR SOLO NÚMEROS ALTOS DE UN ARREGLO DE 7
        //ELEMENTOS POR EJEMPLO RANGO DE 11 A 99 {14,33,15,36,78,21,43]
        //QUE NO SE REPITA

        Scanner sc = new Scanner(System.in);
        //Tamaño arreglo
        int[] numeros = new int[7];
        int[] altos = new int[numeros.length];
        int dato = 0;
        boolean pasa = true;

        System.out.println("Ingrese 7 números por teclado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero : ");
            dato = sc.nextInt();
            numeros[i] = dato;
            //EVALUAMOS LOS NUMEROS ALTOS
            if(dato > 11 && dato < 99){
                //VERIFICAMOS SI YA SE ENCUENTRA EN EL ARREGLO
                for (int j = 0; j < numeros.length; j++) {
                    //EVALUAMOS QUE NO SE REPITA
                    if(altos[j] == dato){
                        pasa = false;
                    }
                }
                //COMPROBADO QUE QUE NO SE REPITE LO GRABAMOS EN LA POSICIÓN ASIGNADA AL CONTADOR
                if (pasa) {
                    altos[i] = dato;
                }
                //VOLVEMOS EL VALOR A VERDADERO PARA EVALUAR UNA PROXIMA VEZ
                pasa = true;
            }
        }

        //MOSTRAR los números altos capturados
        for (int i = 0; i < altos.length; i++) {
            //RESTRINGIMOS QUE SOLO IMPRIMA LOS NUMEROS DIFERENTES DE CERO DENTRO DEL ARREGLO
            if(altos[i] != 0){
                System.out.println("Valor Alto: " + altos[i]);
            }
        }

    }
}

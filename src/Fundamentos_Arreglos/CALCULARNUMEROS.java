package Fundamentos_Arreglos;

import java.util.Scanner;

public class CALCULARNUMEROS {
    /*
    * Leer 7 números por teclado para llenar un arreglo
    * y a continuación calcular el promedio de los números
    * positivos, el promedio de los negativos y contar el
    * número de ceros.
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[7];
        double dato = 0;
        double promedioA = 0, promedioB = 0;
        int contadorA = 0, contadorB = 0, contadorC = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un número : ");
            dato = sc.nextDouble();
            numeros[i] = dato;
            if(dato > 0){
                promedioA += dato;
                contadorA++;
            } else if (dato < 0) {
                promedioB += dato;
                contadorB++;
            } else if (dato == 0) {
                contadorC++;
            }
        }
        //CALCULAMOS EL PROMEDIO
        System.out.println("El promedio de números positivos es : "+(promedioA/contadorA));
        System.out.println("El promedio de numeros negativos es : "+(promedioB/contadorB));
        System.out.println("El numero de ceros contados es de : "+contadorC);
    }
}

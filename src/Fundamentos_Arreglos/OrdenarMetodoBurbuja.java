package Fundamentos_Arreglos;

import org.w3c.dom.ls.LSOutput;

public class OrdenarMetodoBurbuja {

    public static void main(String[] args) {
        String[] dias = {"Viernes","Lunes","Miercoles","Martes","Sabado","Domingo","Jueves"};

        int total = dias.length;

        int contador = 0;

        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1; j++) {
                if(dias[j+1].compareTo(dias[j]) < 0){
                    String auxiliar = dias[j];
                    dias[j] = dias[j+1];
                    dias[j+1] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("Contador : "+contador);

        //Arreglo ya ordenado en orden alfabetico

        for (int i = 0; i < dias.length; i++) {
            System.out.println("posición ["+i+"] : "+dias[i]);
        }

        //Ordenando un arreglo de numero enteros

        int[] numeros = {5,7,4,1,8,2,3,6,9};
        int totalDos = numeros.length;
        int contadorDos = 0;

        for (int i = 0; i < totalDos - 1; i++) {
            for (int j = 0; j < totalDos - 1; j++) {
                //En este caso al hacer referncia un primitivo tenemos que castear los datos
                if(((Integer)numeros[j+1]).compareTo(numeros[j]) < 0){
                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = auxiliar;
                }
                contadorDos++;
            }
        }
        //Cuantos movimientos le tomo ordenar el arreglo
        System.out.println("Contador : "+contadorDos);

        //Arreglo ya ordenado de MENOR A MENOR
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero : "+numeros[i]);
        }

    }
}

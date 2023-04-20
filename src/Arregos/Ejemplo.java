package Arregos;

import java.sql.SQLOutput;

public class Ejemplo {
    public static void main(String[] args) {
        //Crear arreglos de una sola dimension
        String Dias[] = new String[7];
        /*Crear un arreglo de dos dimensiones
        la primera arreglo define las líneas
        y el segundo las columnas es 5*2 */
        int notas[][] = new int[5][2];
        /*Manejo de tres dimensiones
         * es mejor manejarlo en base
         *  de datos esta describe 3 columnas -
         * 3 filas - 3 painas*/
        int hora[][][] = new int[3][3][3];
        /**
         * Nota si hay arreglos de más de 3 dimensiones
         * no es recomendable implementar arreglos
         */
        //llenando los arreglos Días[]
        Dias[0] = "Lunes    ";
        Dias[1] = "Martes   ";
        Dias[2] = "Miércoles";
        Dias[3] = "Jueves   ";
        Dias[4] = "Viernes  ";
        Dias[5] = "Sábado   ";
        Dias[6] = "Domingo  ";
        Espacio();
        System.out.println("||======DIAS======||");
        for (int i = 0; i < 7; i++) {
            System.out.println("||     " + Dias[i] + "  ||");
            System.out.println("||================||");
        }
        System.out.println("||================||");
        Espacio();
        //Llenar el arreglo de dos dimensiones de notas[]
        //Se llena la primera fila y despues la segunda columna 15 - 18
        notas[0][0] = 15; //muestra la primera posición 15 - 18
        notas[0][1] = 18;
        //segundo fila y segunda columna
        notas[1][0] = 12;
        notas[1][1] = 10;
        //Tercera fila y Tercera columna
        notas[2][0] = 19;
        notas[2][1] = 20;
        //Cuarta fila y Cuarta columna
        notas[3][0] = 10;
        notas[3][1] = 10;
        //Quinto fila y Quinto columna
        notas[4][0] = 14;
        notas[4][1] = 13;
        //mostar el contenido del arreglo
        System.out.println("||=====NOTAS====||");
        for (int i = 0; i < 5; i++) {
            System.out.println("||==============||");
            for (int p = 0; p < 2; p++) {
                System.out.print("||  " + notas[i][p]);
                System.out.print("  ");
            }
            System.out.print("||");
            System.out.println();
        }
        System.out.println("||==============||");
        Espacio();
        //Llenaremos los arreglos de tres dimensiones
        hora[0][0][0] = 11;
        hora[0][0][1] = 12;
        hora[0][0][2] = 13;
        hora[0][1][0] = 14;
        hora[0][1][1] = 15;
        hora[0][1][2] = 16;
        hora[0][2][0] = 17;
        hora[0][2][1] = 18;
        hora[0][2][2] = 19;
        //fila dos
        hora[1][0][0] = 10;
        hora[1][0][1] = 20;
        hora[1][0][2] = 30;
        hora[1][1][0] = 40;
        hora[1][1][1] = 50;
        hora[1][1][2] = 60;
        hora[1][2][0] = 70;
        hora[1][2][1] = 80;
        hora[1][2][2] = 90;
        //Fila tres
        hora[2][0][0] = 15;
        hora[2][0][1] = 25;
        hora[2][0][2] = 35;
        hora[2][1][0] = 45;
        hora[2][1][1] = 55;
        hora[2][1][2] = 65;
        hora[2][2][0] = 75;
        hora[2][2][1] = 85;
        hora[2][2][2] = 95;
        //mostrar el arreglo de 3*9
        for (int i = 0; i < 3; i++) {
            System.out.println("||=================||=====["+i+"]=========||=================||");
            for (int j = 0; j < 3; j++) {
                System.out.print("||   ");
                for (int k = 0; k < 3; k++) {

                    System.out.print(hora[i][j][k]);
                    System.out.print("  ");
                }
                System.out.print("  ");
            }
            System.out.println("||");
        }
        System.out.println("||=================||=================||=================||");
        //creamos una clase para separar entre mensajes
    }
    public static void Espacio(){
        System.out.println("[========DIMENSIONES DE ARREGLO=======]");
    }
}

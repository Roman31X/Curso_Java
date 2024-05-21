package Fundamentos_Ciclos;

import java.util.*;

public class Ciclo_While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //declarar la variable
        //PARA  EL DATO DE CANTIDAD Y UNA VARIABLE CONTADOR
        int cantidad = 0,i=1;

        //SOLICITAMOS DATOS
        System.out.println("Ingrese cuantas tablas de multiplicar desea mostrar");
        System.out.println(Espacio());
        System.out.println("Ingrese valor para ");
        cantidad = sc.nextInt();

        //UTILIZAMOS CICLO WHILE
        while (i <= cantidad){
            //DECLARAMOS UN CONTADOR CON TIPO DE VIDA
            //DENTRO DEL CICLO

            int p=1;
            while (p <= 12){
                System.out.println("["+p+" * "+i+"] es => "+Multiplicar(p,i));
                //IMPLEMENTAMOS UN CONTADOR
                p++;
            }
            System.out.println(Espacio());
            //IMPLEMENTAMOS UN CONTADOR
            i++;
        }
    }

    /*
    * se crea Clases para:
    * Clase Multiplicar
    * Clase N de tabla
    * Clase Mensaje
    * */

    public static int Multiplicar(int p, int i){
        return p*i;
    }

    public static String Espacio(){
        return "=================================";
    }
}

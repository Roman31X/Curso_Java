package Bucles;
import java.util.*;
public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declarar la variable
        int cantidad = 0,i=1;

        System.out.println("Ingrese cuantas tablas de multiplicar desea mostrar");
        System.out.println(Espacio());
        System.out.println("Ingrese valor para ");
        cantidad = sc.nextInt();
        //utilizamos el bucle
        while (i<=cantidad){
            int p=1;
            while (p<=12){
                System.out.println("["+p+"*"+i+"] es => "+Multiplicar(p,i));
                p++;
            }
            System.out.println(Espacio());
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

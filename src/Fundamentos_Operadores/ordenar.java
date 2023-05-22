package Fundamentos_Operadores;
import java.util.*;
public class ordenar {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0;

        Scanner entrada = new Scanner (System.in);

        System.out.println("Este programa te ordena los números de mayor a menor");
        System.out.println("====================================================");

        System.out.println("Inserte el primer número: ");
        n1 = entrada.nextInt();

        System.out.println("Inserte el segundo número: ");
        n2 = entrada.nextInt();
        System.out.println("====================================================");
        if(n1 > n2){
            System.out.println("El orden correcto es " + n1 + " " + n2 );
        } else{
            System.out.println("El orden correcto es " + n2 + " " + n1);
        }
    }
}

package Fundamentos_Ciclos;
import java.util.*;
public class buscar_menor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = new int [10];
        int nu=0;
        /*Introducir números por consola*/
        System.out.println("Ingresar 10 números");
        for(int i=0; i < num.length;i++){
            System.out.print("Número "+i+" => ");
            nu = sc.nextInt();
            num[i] = nu;
        }
        int menor = 20;
        /*Realizar un bucle con un condicional que mostrara al menor*/
        for( int i=0; i < num.length;i++){
            if(menor > num[i]){
                menor = num[i];
            }
        }
        if(menor < 10){
            System.out.println("El numero "+menor+" es menor que 10");
        }else{
            System.out.println("El numero: "+menor+" es igual o mayor que 10");
        }
    }
}

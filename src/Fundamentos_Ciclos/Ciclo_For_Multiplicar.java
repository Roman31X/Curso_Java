package Fundamentos_Ciclos;
import java.util.*;
public class Ciclo_For_Multiplicar {
    public static void main(String[] args) {
        /*multiplicar sin los signos multipliación*/
        Scanner sc = new Scanner(System.in);
        double num1=0,num2=0,con=0;
        //solicitar los números a multiplicar
        System.out.print("Ingrese valor A: ");
        num1 =  sc.nextDouble();
        System.out.print("Ingrese valor B: ");
        num2 =  sc.nextDouble();
        /* CONDICIÓN PARA EVALUAR POR SI HAY NÚMEROS NEGATIVOS*/
        if(num1<0 || num2<0){
            //CICLO FOR
            for(int i = 0;i < num1*-1; i++){
                con+=num2*-1;
            }
        }else{
            //CICLO FOR
            for(int i = 0;i < num1; i++){
                con+=num2;
            }
        }
        //mostramos el resultado de la multiplicación
        System.out.println("La multiplicación de: "+num1+" * "+num2+" es: "+con);
    }
}

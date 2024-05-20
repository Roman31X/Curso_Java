package Ejercicio_Part_1;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese valor1 : ");
        int a = sc.nextInt();
        System.out.println("Ingrese valor2 : ");
        int b = sc.nextInt();

        if(a > b){
            System.out.println(a + " Es mayor que " + b);
        }else if(b > a){
            System.out.println(b + " Es mayor que " + a);
        }else{
            System.out.println("Son iguales");
        }
    }
}

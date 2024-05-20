package Ejercicio_Part_1;

import java.util.Scanner;

public class Libro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese titulo del libro : ");
        String titulo = sc.nextLine();
        System.out.println("Ingrese nombre de autor : ");
        String autor = sc.nextLine();

        System.out.println("El libro : "+titulo+" fue escrito por "+autor);
    }
}

package Ejercicio_Part_1;

import java.util.Scanner;

public class Libros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Proporciona el nombre : ");
        String nombre = sc.nextLine();
        System.out.println("Proporciona el id : ");
        int id = sc.nextInt();
        System.out.println("Proporciona el precio : ");
        double precio = sc.nextDouble();
        System.out.println("Proporciona el envio gratuito : ");
        boolean envioGratuito = sc.nextBoolean();

        System.out.println("Nombre del libro es: " + nombre + "\n"+
                           "ID del libro es : #"+ id +"\n"+
                           "El precio del libro es : $"+precio+ "\n"+
                           "Tiene envío Gratuito : "+envioGratuito);
    }
}

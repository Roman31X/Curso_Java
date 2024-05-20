package Ejercicio_Part_1;

import java.util.Scanner;

public class AreaPerimetro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese alto : ");
        int alto = sc.nextInt();
        System.out.println("Ingrese ancho : ");
        int ancho = sc.nextInt();

        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;

        System.out.println("El area es : "+ area);
        System.out.println("El perimetro es : "+ perimetro);
    }
}

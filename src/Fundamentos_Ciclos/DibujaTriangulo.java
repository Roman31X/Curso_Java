package Fundamentos_Ciclos;

import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un triangulo ***");
        var consola = new Scanner(System.in);
        System.out.print("Proporciona el numero de filas => ");
        int numeroFila = consola.nextInt();

        //Iteramos sobre cada fila del triángulo
        for (int fila = 1; fila <= numeroFila; fila++) {
            var espaciosBlanco = " ".repeat(numeroFila - fila);
            var asterisco = "*".repeat(2* fila - 1);
            System.out.println(espaciosBlanco + asterisco);
        }
    }
}

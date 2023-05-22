package Fundamentos_Clases_Metodos_Objetos;

import java.util.Scanner;

public class Clase_Calculadora {
    public static void main(String[] args) {
        //IMPORTAMOS LA CLASE SCANNER
        Scanner sc = new Scanner(System.in);
        //creamos un objeto instaciado de la clase "Cálculo"
        Clase_Calculo cal;
        //DECLARAMOS VÁRIABLES
        int a,b;
        //Solicitamos datos para realizar calculo
        System.out.println("Ingrese valor para \"A\"");
        a = sc.nextInt();
        System.out.println("Ingrese valor para \"B\"");
        b = sc.nextInt();
        //Realizamos calculo
        cal = new Clase_Calculo();
        System.out.println(cal.Valor(a,b));
        System.out.println("La suma es : "+cal.Suma(a,b));
        System.out.println("La resta es : "+cal.Resta(a,b));
        System.out.println("La multiplicación es : "+cal.Multiplicacion(a,b));
        System.out.println("La division es : "+cal.Division(a,b));
    }
}

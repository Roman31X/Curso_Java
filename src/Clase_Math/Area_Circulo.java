package Clase_Math;
import java.util.*;
public class Area_Circulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Atributo
        double area;
        double radio;
        //Solicitamos los datos de radio
        System.out.print("Ingrese el radio del CIRCULO => ");
        radio = sc.nextDouble();
        //Calculo
        area = 3.1416 * Math.pow(radio,2);
        //MENSAJE
        System.out.println("El area del Circulo es: ["+area+"]");
    }
}

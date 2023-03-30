package Ejercicios_Part_1;
import java.util.*;
import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nombre;//nombre de la factura
        double pre1,pre2;//precios de los productos
        double total,impuesto,toimpu;//variable spara acumular calcular
        //se solicita
        System.out.println("Introduce el nombre de la empresa o entidad");
        nombre = sc.nextLine();
        System.out.println("Introduce el precio del producto 1");
        pre1 = sc.nextDouble();
        System.out.println("Introduce el precio del producto 2");
        pre2 = sc.nextDouble();
        //realizamos los calculos
        //suma de los precios
        total = pre1 + pre2;
        //se realiza el calculo de impuesto
        impuesto = total * 0.19;
        //calculo de total generado
        toimpu = total + impuesto;
        //se muestra el mensaje de facturacion
        System.out.println("Se facturo a la: "+nombre+" el monto por producto es: "+total+
                " el impuesto: "+impuesto+" el total es de: "+toimpu);

    }
}

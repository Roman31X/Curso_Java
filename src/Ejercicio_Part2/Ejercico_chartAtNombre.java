package Ejercicio_Part2;
import java.util.*;
public class Ejercico_chartAtNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaramos las tres variables de nombres
        String nom1,nom2,nom3;
        //declaro varible par concatenar la nueva modificacion
        String nomlar="";
        //Se solicita por consola los nombre
        System.out.print("Ingrese primer nombre: ");
        nom1 = sc.nextLine();
        System.out.print("Ingrese segundo nombre: ");
        nom2 = sc.nextLine();
        System.out.print("Ingrese tercer nombre: ");
        nom3 = sc.nextLine();
        //se realiza la extracion de la segunda posicion
        nomlar+=Character.toUpperCase(nom1.charAt(1))+"."+nom1.substring(nom1.length()-2)+"_";
        nomlar+=Character.toUpperCase(nom2.charAt(1))+"."+nom2.substring(nom2.length()-2)+"_";
        nomlar+=Character.toUpperCase(nom3.charAt(1))+"."+nom3.substring(nom3.length()-2);
        //CONCATENAR las estracion
        System.out.println(nomlar);
    }
}
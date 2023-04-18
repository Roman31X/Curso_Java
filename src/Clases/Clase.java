package Clases;

public class Clase {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        System.out.println(Valor(a,b));
        System.out.println("La suma de a + b es: "+Suma(a,b));
        System.out.println("La resta de a - b es: "+Resta(a,b));
        System.out.println("La multiplicación de a * b es: "+Multiplicacion(a,b));
        System.out.println("La division de a '/' b es: "+Division(a,b));

    }
    //crear clases son buenas prácticas
    //creamos las clases fuera del main
    //método para mostrar datos de la variable
    public static String Valor(int a, int b){
        return "La variables son: ["+a+" y "+b+"]";
    }
    public static int Suma(int a, int b){
        return a + b;
    }

    public static int Resta(int a, int b){
        return a - b;
    }

    public static int Multiplicacion(int a, int b){
        return a * b;
    }

    public static int Division(int a, int b){
        return a / b;
    }
}

package Fundamentos_Clases_Metodos_Objetos;

import java.util.Scanner;

public class Clase_Calculadora {
    /**
     * MEMORIA [STACK - HEAP]
     * MEMORIA STACK : almacena datos de variables locales
     * MEMORIA HEAP : almacena datos de variables tipo objetos*/
    //DECLARAMOS VÁRIABLES GLOBALES
    public static int a=0,b=0;
    public static void main(String[] args) {
        //IMPORTAMOS LA CLASE SCANNER
        Scanner sc = new Scanner(System.in);
        //creamos un objeto instaciado de la clase "Cálculo"
        Clase_Calculo cal;
        //Solicitamos datos para realizar calculo
        System.out.println("Ingrese valor para \"A\"");
        a = sc.nextInt();
        System.out.println("Ingrese valor para \"B\"");
        b = sc.nextInt();
        //Realizamos calculo ENVIANDO LOS DATOS MEDINATE EL OBJETOS
        //A LA CLASE QUE RECIVIRAN COMO PARAMETRO "a" y "b"
        //COMO SE MOSTRAR EN EL SIGUIENTE EJEMPLO
        cal = new Clase_Calculo();
        System.out.println(cal.Valor(a,b));
        System.out.println("La suma es : "+cal.Suma(a,b));
        System.out.println("La resta es : "+cal.Resta(a,b));
        System.out.println("La multiplicación es : "+cal.Multiplicacion(a,b));
        System.out.println("La division es : "+cal.Division(a,b));
        //mostramos los resultados de los métodos sin parametros
        System.out.println("La suma de ["+a+"] + ["+b+"] es : ["+suma()+"]");
        System.out.println("La resta de ["+a+"] - ["+b+"] es : ["+resta()+"]");
        System.out.println("La multiplicación de ["+a+"] * ["+b+"] es : ["+multiplicar()+"]");
        System.out.println("La division de ["+a+"] / ["+b+"] es : ["+division()+"]");
    }
    //METODOS DE LA CLASE SIN PARAMETROS
    public static int suma(){
        return (a+b);
    }
    public static int resta(){
        return (a-b);
    }
    public static int multiplicar(){
        return (a*b);
    }
    public static int division(){
        return (a/b);
    }
}

package Operadores;

public class Operadores_Igualdad {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        //La variable boolean captura la respuesta de la evaluación
        //a es igual a b = falso
        boolean c = (a == b);
        System.out.println("c = " + c);
        //a es diferente de b = verdad
        boolean d = (a != b);
        System.out.println("d = " + d);
        System.out.println();
        //COMPARANDO SI EL CONTENIDO DEL VAROL DE CADENA SON IGUALES
        String nombre = "Diego";
        String apellido = "Roman";
        //nombre es igual a apellido = falso
        boolean e = (nombre == apellido);
        System.out.println("e = " + e);
        //EVALUAREMOS SI EL CONTENIDO ES IGUAL AL DE LA VARIBALE APELLIDO
        //nombres es igual a apellido = verdad
        //DESIGNAMOS NUEVA CADENA A "apellido" para que la evaluacion
        //salga verdadera
        apellido = "Diego";
        boolean f = nombre.equals(apellido);
        System.out.println("f = " + f);
        System.out.println();

        //OPERADORES RELACIONALES
        //EVALUACION DE LA VARIABLE "a"
        if( a > b){
            System.out.println("["+a+"] si es mayor a ["+b+"]");
        }else{
            System.out.println("["+a+"] Es un menor que ["+b+"]");
        }
    }
}

package Fundamentos_Condiciones;

public class Estructura_Switch {
    public static void main(String[] args) {
        //declaramos la variable
        int numero = 5;
        String dia;
        //utilizaremos un switch
        switch(numero){
            case 1:
                System.out.println("Hoy es Lunes");break;
            case 2:
                System.out.println("Hoy es Martes");break;
            case 3:
                System.out.println("Hoy es Miércoles");break;
            case 4:
                System.out.println("Hpy es Jueves");break;
            case 5:
                System.out.println("Hoy es Viernes");break;
            case 6:
                System.out.println("Hoy es Sábado");break;
            case 7:
                System.out.println("Hoy es Domingo");break;
            default:
                System.out.println("El numero ingresado es mayor a 7 de dia");
        }
    }
}

package Condiciones;

public class Dia_eshoy {
    public static void main(String[] args) {
        //seclaramos la variable
        int numero = 5;
        String dia;
        //utilizaremos un switch
        switch(numero){
            case 1:
                System.out.println("Hoy es Lunes");break;
            case 2:
                System.out.println("Hoy es Martes");break;
            case 3:
                System.out.println("Hoy es Miercoles");break;
            case 4:
                System.out.println("Hpy es Jueves");break;
            case 5:
                System.out.println("Hoy es Viernes");break;
            case 6:
                System.out.println("Hoy es Sabado");break;
            case 7:
                System.out.println("Hoy es Domingo");  break;
        }
    }
}

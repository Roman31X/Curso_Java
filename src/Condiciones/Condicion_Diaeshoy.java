package Condiciones;

public class Condicion_Diaeshoy {
    public static void main(String[] args) {
        //seclaramos la variable
        int numero = 5;
        String dia;
        //IMPLEMENTAMOS CONDICIÓN IF
        if(numero == 1){
            System.out.println("Hoy es Lunes");
        } else if (numero == 2) {
            System.out.println("Hoy es Martes");
        } else if (numero == 3) {
            System.out.println("Hoy es Miercoles");
        } else if (numero == 4) {
            System.out.println("Hpy es Jueves");
        } else if (numero == 5) {
            System.out.println("Hoy es Viernes");
        } else if (numero == 6) {
            System.out.println("Hoy es Sabado");
        } else if (numero == 7) {
            System.out.println("Hoy es Domingo");
        }  else {
            System.out.println("El numero ingresado es mayor a 7 de dia");
        }
    }
}

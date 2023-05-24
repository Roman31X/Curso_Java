package Fundamentos_Clase_Math;

public class Palabra_Final {
    public static void main(String[] args) {
        /*
        * MODIFICADOR DE ACCESO "final" el cual designa
        * que una vez se designe un valor a la váriable este
        * no puede ser modificado
        * */
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //MODIFICACIÓN DE DATOS DE LA VARIABLE
        //miVariable = 20; //nos marcara erros ya tenia una designación

    }

}

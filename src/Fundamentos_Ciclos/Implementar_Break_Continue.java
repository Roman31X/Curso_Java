package Fundamentos_Ciclos;

import java.util.Scanner;

public class Implementar_Break_Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * IMPLEMENTACIÓN DE [BREAK - CONTINUO]
         * MOSTRAR UNA TABLA DE MULTIPLICAR
         */
        int a = 0;
        //SOLICITAMOS DATOS DE QUE TABLA SE DESEA MOSTRAR
        System.out.println("Ingrese Un numero para mostrar\n" +
                           "sus multiplos hasta el número 12");
        a = sc.nextInt();
        //IMPLEMENTAMOS EL CICLO FOR
        System.out.println("||=====TABLA DEL ["+a+"]====||");
        for (int i = 1; i <= 12; i++) {
            System.out.println("||\t ["+a+"] * ["+i+"] = ["+(i*a)+"]");
        }
        //IMPLEMENTAMOS LOS "break"  PARA ROMPER EL BUCLE
        //MOSTRAR LOS NUMERO PARES DE LA MULTIPLICACION
        String par="";
        for (int i = 1; i <= 12; i++) {
            int b = i * a;
            if(b % 2 == 0){
                par = "si";
            }else{
                par = "no";
            }
            //implementamos un switch
            switch(par){
                case "si":
                    System.out.println("El ["+b+"] es un número par");
                    //con esta declaración termina
                    //la ejecución en del switch
                    break;
                case "no":
                    System.out.println("El ["+b+"] es un número impar");
                    break;
            }
            //Solo imprimir los números pares de
            //la multiplicación implementamos "continue"
            //"inicio:" //esta declaración es conocido como etiqueta
            //para indicar al continue donde regresara
            inicio: //NO ES UNA BUENA PRACTICA SOLO EN ANIDADOS
            for (int j = 1; j <= 12; j++) {
                int c = j * a;
                if(c % 2 != 0) {
                    System.out.println("||\t [" + a + "] * [" + i + "] = [" + (i * a) + "]");
                    continue inicio;    //con esta sentencia regresamos
                                        //regresamos al inicio del for con la siguiente
                                        //iteración
                }
            }
        }
    }
}

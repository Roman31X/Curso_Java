package Operadores;

public class Operadores_Condicionales {
    public static void main(String[] args) {
        //DECLARAMOS DOS VARIABLES PARA REALIZAR
        //EVALUACIONES DE CONDICIÓN
        int a = 10;
        int b = 5;
        //CREAMOS DOS VARIBALES DE TIPO BOOLEAN PARA
        //ALMACENAR EL RESULTADO DE LA EVALUACIÓN
        boolean c = ( a >= 10 && a <= 10);//AMBAS DEVEN DE SER VERDAD YA DAR "true"
        boolean d = ( b >= 10 || b <= 10);//UNA DE ELLAS PUEDE SER VERDAD Y LA OTRA FALSA "true"
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}

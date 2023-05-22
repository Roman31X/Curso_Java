package Fundamentos_Introduccion;

public class Uso_VariableBoolean {
    public static void main(String[] args) {
        /*
         * TIPOS VARIABLES BOOLEAN : [ true - false ]
         * EJEMPLO
         * */
        //DECLARAMOS UNA VARIABLE DE TIPO BOOLEANO
        boolean varBoolean1 = true;
        System.out.println("varBoolean = " + varBoolean1);
        System.out.println();
        
        boolean varBoolean2 = false;
        System.out.println("varBoolean2 = " + varBoolean2);
        System.out.println();
        //IMPLEMENTAMOS LA SENTENCIA IF PARA EVALUACIÓN DE LA VARIABLE
        if(varBoolean1){
            System.out.println("El valor de varBoolean1 es Verdadera = ["+varBoolean1+"]");
        }else{
            System.out.println("El valor de varBoolean2 es Falso = ["+varBoolean2+"]");
        }

    }
}

package Fundamentos_Introduccion;

public class Primitivos_Flotantes {
    public static void main(String[] args) {
        /*
         * TIPOS PRIMITIVOS FLOTANTES : [ float -double ]
         * EJEMPLO
         * */

        /**EJEMPLO [float = 32 bits]
         * Mínimo que soporta es de [1.4E-45]
         * Máximo que soporta es de [3.4028235E38]
         * de ser el dato mayor o menor a estos parámetros
         * inmediatamente se reporta un error
         */
        float numeroFloat = (float) 3.4028235E38;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor mínimo float : "+Float.MIN_VALUE);
        System.out.println("Valor máximo float : "+Float.MAX_VALUE);
        System.out.println();


        /**EJEMPLO [double = 64 bits]
         * Mínimo que soporta es de [4.9E-324]
         * Máximo que soporta es de [1.7976931348623157E308]
         * de ser el dato mayor o menor a estos parámetros
         * inmediatamente se reporta un error
         */
        double numeroDouble =  1.2;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor mínimo double : "+Double.MIN_VALUE);
        System.out.println("Valor máximo double: "+Double.MAX_VALUE);
        System.out.println();
    }
}

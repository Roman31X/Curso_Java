package Introduccion;

public class Primitivos_Flotantes {
    public static void main(String[] args) {
        /*
         * TIPOS PRIMITIVOS FLOTANTES : [ float -double ]
         * EJEMPLO
         * */
        /**EJEMPLO [float]
         * Mínimo que soporta es de [1.4E-45]
         * Máximo que soporta es de [3.4028235E38]
         * de ser el dato mayor o menor a estos parametro
         * inmediatamente se reporta un error
         */
        float numeroFloat = (float) 3.4028235E38;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo float : "+Float.MIN_VALUE);
        System.out.println("Valor maximo float : "+Float.MAX_VALUE);
        System.out.println();
        /**EJEMPLO [double]
         * Mínimo que soporta es de [4.9E-324]
         * Máximo que soporta es de [1.7976931348623157E308]
         * de ser el dato mayor o menor a estos parametro
         * inmediatamente se reporta un error
         */
        double numeroDouble =  1.2;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo double : "+Double.MIN_VALUE);
        System.out.println("Valor maximo double: "+Double.MAX_VALUE);
        System.out.println();
    }
}

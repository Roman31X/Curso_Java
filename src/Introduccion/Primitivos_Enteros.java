package Introduccion;

public class Primitivos_Enteros {
    public static void main(String[] args) {
        //Para realizar comentarios largo asi como
        //todo lo que se encuentre dentro de estos simbolos "** enter */
        //EJEMPLO
        /*
        * TIPOS PRIMITIVOS ENTEROS : [ byte - short - int - long ]
        * EJEMPLO
        * */
        /**EJEMPLO [byte]
         * Mínimo que soporta es de [-128]
         * Máximo que soporta es de [127]
         * de ser el dato mayor o menor a estos parametro
         * inmediatamente se reporta un error
         */
        byte numeroByte = 10;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor minimo byte : "+Byte.MIN_VALUE);
        System.out.println("Valor maximo byte : "+Byte.MAX_VALUE);
        System.out.println();
        /**EJEMPLO [short]
         * Mínimo que soporta es de [-32768]
         * Máximo que soporta es de [32767]
         * de ser el dato mayor o menor a estos parametro
         * inmediatamente se reporta un error
         */
        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short : "+Short.MIN_VALUE);
        System.out.println("Valor maximo short : "+Short.MAX_VALUE);
        System.out.println();
        /**EJEMPLO [int]
         * Mínimo que soporta es de [-2147483648]
         * Máximo que soporta es de [2147483647]
         * de ser el dato mayor o menor a estos parametro
         * inmediatamente se reporta un error
         */
        int numeroInt = 10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int : "+Integer.MIN_VALUE);
        System.out.println("Valor maximo int : "+Integer.MAX_VALUE);
        System.out.println();
        /**EJEMPLO [long]
         * Mínimo que soporta es de [-9223372036854775808]
         * Máximo que soporta es de [9223372036854775807]
         * de ser el dato mayor o menor a estos parametro
         * inmediatamente se reporta un error
         */
        long numeroLong = 10;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long : "+Long.MIN_VALUE);
        System.out.println("Valor maximo long : "+Long.MAX_VALUE);
        System.out.println();
    }
}

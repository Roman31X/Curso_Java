package AutoboxingUnboxing.test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Calases envolventes de tipo primitivos
        /*
        * int - Integer
        * long - Long
        * float - Float
        * double - Double
        * boolean - Boolean
        * byte - Byte
        * char - Character
        * short - Short        *
        * */
        /**AutoBoxing = encapsular el valor en el Objeto "numero"*/
        Integer numero = 10;
        System.out.println("Entero : [ "+numero+" ]");
        System.out.println("Entero double : [ "+numero.doubleValue()+" ]");
        /**UnBoxing = extracción valor primitivo en la variable "numero"*/
        int entero = numero;
        System.out.println("Numero : [ "+entero + " ]");
    }
}

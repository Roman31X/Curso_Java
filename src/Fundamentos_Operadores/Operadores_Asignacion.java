package Fundamentos_Operadores;

public class Operadores_Asignacion {
    public static void main(String[] args) {
        /*
        * OPERADORES DE ASIGNACIÓN : [ ++ , -- , = , += , -= , *= ,
        *  /= , %= , <<= , >>= , >>>= , &= , |= , ^= ]*/

        //DECLARAMOS VARIABLES 
        int a = 10;
        int b = 10;
        int c = a + b - 5;

        //ASIGNACIÓN INCREMENTO
        a += 1;//a = 11;
        System.out.println("a = " + a);

        //ASIGNACIÓN DECREMENTO
        b -= 1;//b = 9;
        System.out.println("b = " + b);

        //ASIGNACIÓN MULTIPLICAR
        c *= 2;//c = 30;
        System.out.println("c = " + c);

        //ASIGNACIÓN MULTIPLICACIÓN
        a /= 2;//a = 5;
        System.out.println("a = " + a);
    }
}

package Fundamentos_Operadores;

public class Operadore_Aritméticos {
    /*
    * OPERADORES ARITMÉTICOS : [ + , - , * , / , % ]
    * [suma - resta - division - porcentaje(captura el residuo)]
    * OPERADORES DE RELACIÓN : [ < , > , <= , >= , != , ==]
    * [menor - mayor - menor_igual - mayor_igual - diferente - igual]
    * OPERADORES LÓGICOS : [ && o & , || o | , ! , ^ ]
    * [ AND (ambas verdad) Y OR (una sola verdad) ] condiciones
    * OPERADORES UNITARIOS : [ ~ , - , ! ]
    * OPERADORES A NIVEL BITS : [ & , | , ^ , << , >> , >>>]
    * OPERADORES DE ASIGNACIÓN : [ ++ , -- , = , += , -= , *= ,
    *  /= , %= , <<= , >>= , >>>= , &= , |= , ^= ]
    * PRIORIDAD Y ORDEN DE EVALUACIÓN : [ () , [] , . , -~!++-- ,
    *  new(tipo)expresión , <<>> >>>, < <= > >= , == != , & , ? : "" etc]
    * */
    public static void main(String[] args) {
        //OPERADORES ARITMÉTICOS : [ + , - , * , / , % ]
        int a=10,b=5;//Variable y su designación de dato
        double c=0,d=0,e=0,f=0,g=0;//Variable almacenaran el resultado
        //SUMAR
        c = a + b;
        System.out.println("La suma de ["+a+"] + ["+b+"] es : ["+c+"]");
        //RESTAR
        d = a - b;
        System.out.println("La resta de ["+a+"] - ["+b+"] es : ["+d+"]");
        //MULTIPLICAR
        e = a * b;
        System.out.println("La multiplicación de ["+a+"] * ["+b+"] es : ["+e+"]");
        //DIVICIÓN
        f = a / b;
        System.out.println("La divición de ["+a+"] / ["+b+"] es : ["+f+"]");
        //RESIDUO
        g = a % b;
        System.out.println("El residuo de la divición es : ["+g+"]");
        //APLICANDO OPERADOR PARA IDENTIFICAR NÚMEROS PARES
        //EVALUACION DE LA VARIABLE "a"
        if( a % 2 == 0){
            System.out.println("["+a+"] Es un numero par");
        }else{
            System.out.println("["+a+"] Es un numero impar");
        }
        //EVALUACION DE LA VARIABLE "b"
        if( b % 2 == 0){
            System.out.println("["+b+"] Es un numero par");
        }else{
            System.out.println("["+b+"] Es un numero impar");
        }
    }
}

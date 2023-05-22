package Introduccion;

public class Primitivos_Char {
    public static void main(String[] args) {
        /*
        * La variable "char" solo puede soportar un solo caracter
        * Tambien se rigen por el juego de caractere "unicode" o decimal
        * Para conocer un poco mas de ellos puedes buscar como
        * [list unicode]
        */
        char miVariableCahr = 'a';
        System.out.println("miVariableCahr = " + miVariableCahr);
        System.out.println();
        
        //IMPLEMENTANDO EL CODIGO UNICODE
        char miVariableChar2 = '\u0021';
        System.out.println("miVariableChar2 = " + miVariableChar2);
        System.out.println();
        
        //IMPLEMENTANDO VALOR DECIMAL
        char miVariableChar3 = 33;
        System.out.println("miVariableChar = " + miVariableChar3);
        System.out.println();
        
        //IMPLEMENTAMOS VALOR DE SIMBOLO DE CARACTER
        char miVariableChar4 = '!';
        System.out.println("miVariableChar4 = " + miVariableChar4);
    }
}

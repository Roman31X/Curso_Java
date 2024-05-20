package Fundamentos_Introduccion;

public class Primitivos_Char {
    public static void main(String[] args) {
        /*
        * La variable "char" soló puede soportar un solo carácter
        * También se rigen por el juego de carácter "unicode" o decimal
        * Para conocer un poco más de ellos puedes buscar como
        * [list unicode]
        */
        char miVariableCahr1 = 'a';
        System.out.println("miVariableCahr1 = " + miVariableCahr1);
        System.out.println();
        
        //IMPLEMENTANDO EL CÓDIGO UNICODE
        char miVariableChar2 = '\u0021';
        System.out.println("miVariableChar2 = " + miVariableChar2);
        System.out.println();
        
        //IMPLEMENTANDO VALOR DECIMAL
        char miVariableChar3 = 33;
        System.out.println("miVariableChar3 = " + miVariableChar3);
        System.out.println();
        
        //IMPLEMENTAMOS VALOR DE SÍMBOLO DE CARÁCTER
        char miVariableChar4 = '!';
        System.out.println("miVariableChar4 = " + miVariableChar4);
    }
}

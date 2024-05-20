package Fundamentos_Introduccion;

public class Fundamentos {
    //Atajo para método "main" = "main + TAB"
    public static void main(String[] args) {
        //Definimos variables de tipo entera
        int miVariableEntera = 10;

        //mostramos el contenido de la variable por consola
        //atajo para mostrar mensaje "sout + TAB"
        //atajo para mostrar mensaje el nombre de la variable y su valor "soutv + TAB"
        System.out.println("miVariableEntera = " + miVariableEntera);

        //MODIFICAMOS LA VARIABLE ASIGNANDOLE NUEVO VALOR
        //ATAJO PARA VER LA VARIBALES DE LA CLASE "ctrl + ESPACIO"
        miVariableEntera = 20;
        System.out.println("miVariableEntera = " + miVariableEntera);
        System.out.println();

        //Definimos una nueva variable de tipo String 
        String miVariableCadena = "Hola Bienvenido";
        System.out.println("miVariableCadena = " + miVariableCadena);
        //MODIFICAMOS LA VARIABLE ASIGNANDOLE UNA NUEVA CADENA DE VALOR
        miVariableCadena = "Adios hasta la próxima";
        System.out.println("miVariableCadena = " + miVariableCadena);
        System.out.println();

        //DEFINIMOS UNA NUEVA VARIABLE DE TIPO "var = inferencia de tipos en Java"
        //ACEPTA valor String - int - double - float
        var miVariableEntera1 = 10;
        var miVariableCaracter1 = "Hola Mundo";
        var miVariableDouble1 = 15.5;
        var miVariableBooleano1 = true;
        //mostramos los datos asignados en las variables declaradas
        System.out.println("miVariableEntera1 = " + miVariableEntera1);
        System.out.println("miVariableCaracter1 = " + miVariableCaracter1);
        System.out.println("miVariableDouble1 = " + miVariableDouble1);
        System.out.println("miVariableFloat1 = " + miVariableBooleano1);
        System.out.println();

        //DATOS SOBRE LA DECLARACIÓN DE VARIABLE
        /*
        * BUENAS PRÁCTICAS IMPLEMENTAR CAMELCASE [int miVariableEntera = 10;
        * Caracteres aceptadas para declarar un variable son [ _ (guion bajo)
        * - $ (signo dolar) ]
        * NO es recomendable usar acentos = [ var áVariable = 10 ] X
        * No está permitido caracteres especiales = [ var #miVariable = 2 ] X
        *
        * EJEMPLO
        * int _cantidadAdultoMayor = 50;
        * double $pesosAdultoMayor = 60.5;
        * */

        //CONCATENAR DATOS DE VARIABLES
        var nombre = "Diego";
        var apellido = "Roman Guerra";

        var i = 3;
        var j = 4;
        //mostramos los datos de la variable usando el símbolo
        //de concatenación que es [+]
        //EJEMPLO

        System.out.println("USUARIO : "+nombre+" "+apellido);
        System.out.println(nombre + i + j); // realiza concatenación
        System.out.println(i + j + nombre); //izq a der realiza suma
        System.out.println();

        //CARACTERES ESPECIALES EN JAVA
        /*ESTOS SON:
        *  ["\n": dara un salto de línea en el mensaje]
        *  ["\t": dara una tabulación de espacio en la misma línea]
        *  ["\b": dara una acción de retroceder espacio como (suprimir)]
        *  ["\'" : dara acceso a poder usar las comillas simple en el mensaje]
        *  ["\"" : dara acceso a poder usar las comillas doble en el mensaje]
        *
        * EJEMPLO
        *
        * */
        System.out.println("USUARIO :\b\n\'"+nombre+"\'\t\""+apellido+"\"");
        System.out.println();

    }
}

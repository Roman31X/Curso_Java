package Variables;

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
        
        //Definimos una nueva variable de tipo String 
        String miVariableCadena = "Hola Bienvenido";
        System.out.println("miVariableCadena = " + miVariableCadena);
        //MODIFICAMOS LA VARIABLE ASIGNANDOLE UNA NUEVA CADENA DE VALOR
        miVariableCadena = "Adios hasta la proximma";
        System.out.println("miVariableCadena = " + miVariableCadena);
    }
}

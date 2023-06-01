package Argumentos_Variables;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(2,4,6,8,10,12,14);
        System.out.println("||=======||");
        imprimirNumeros(1,3,5,7,9,11,13);
        System.out.println("||======||");
        variosParametros("Diego",15,18,20,19);
        System.out.println("||=======||");
        variosNombres("Diego","Carlos","Daniel","Rene","Gustavo");
    }
    //con este método no determina cuantos argumentos seran enviados
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento : [ "+numeros[i]+"]");
        }
    }
    //Dos parametros más argumento variable
    //Únicamente la argumento variable debe estar al final
    private static void variosParametros(String nombre,int... numeros){
        System.out.println("|| NOMBRE : [ "+nombre+"]");
        imprimirNumeros(numeros);
    }
    private static void variosNombres(String... nombre){
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Alumno : ["+nombre[i]+"]");
        }
    }
}

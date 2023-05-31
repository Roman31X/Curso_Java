package Fundamentos_Ciclos;

public class Ciclo_ForEach_Argumento {
    public static void main(String[] args) {
        int edades[] = {20,22,23,25,19};
        //implementamos el foreach
        for (int edad: edades) {
            System.out.println("Edad : [ "+edad+" ]");
        }
    }
}

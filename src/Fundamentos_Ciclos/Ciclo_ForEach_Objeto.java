package Fundamentos_Ciclos;

import Fundamentos_Ciclos.persona.Persona;

public class Ciclo_ForEach_Objeto {
    public static void main(String[] args) {
        //Areglo de objeto de tipo persona
        Persona persona[] = {new Persona("Ana"), new Persona("Diego")};
        //foreach
        for (Persona persona1: persona ) {
            System.out.println("Persona : [ "+persona1+" ]");
        }

    }
}

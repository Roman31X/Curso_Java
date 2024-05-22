package Enumeraciones.test;

import Enumeraciones.enumeracion.Continentes;

public class testContinentes {
    public static void main(String[] args) {
        System.out.println("Continente 4 : [ "+ Continentes.AMERICA+" ]");
        System.out.println("Numero de países en  CUARTO Continente : [ "+Continentes.AMERICA.getPaises()+" ]");

        //CONTINENTE AFRICA
        System.out.println("Continente 4 : [ "+ Continentes.AFRICA+" ]");
        System.out.println("Numero de países en PRIMER Continente : [ "+Continentes.AFRICA.getPaises()+" ]");
    }
}

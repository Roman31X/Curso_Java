package Enumeraciones.test;

import Enumeraciones.enumeracion.Continentes;

public class testContinentes {
    public static void main(String[] args) {
        System.out.println("Continente 4 : [ "+ Continentes.AMERICA+" ]");
        System.out.println("Numero de paises en  CUARTO Continete : [ "+Continentes.AMERICA.getPaises()+" ]");
        //CONTINENTE AFRICA
        System.out.println("Continente 4 : [ "+ Continentes.AFRICA+" ]");
        System.out.println("Numero de paises en PRIMER Continete : [ "+Continentes.AFRICA.getPaises()+" ]");
    }
}

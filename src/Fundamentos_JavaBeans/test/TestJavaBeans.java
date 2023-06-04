package Fundamentos_JavaBeans.test;

import Fundamentos_JavaBeans.domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona(); //Para usar JavaBeans con el contructor vacio
        persona.setNombre("Diego");
        persona.setApellido("Roman");
        System.out.println(persona.toString());
        System.out.println("INDIVIDUAL : ");
        System.out.println("NOMBRE : ["+persona.getNombre()+"]");
        System.out.println("APELLIDO : ["+persona.getApellido()+"]");
    }
}

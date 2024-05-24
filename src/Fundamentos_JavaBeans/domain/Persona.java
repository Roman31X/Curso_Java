package Fundamentos_JavaBeans.domain;

import java.io.Serializable;

public class Persona implements Serializable {
    /**
     * PARA IMPLEMENTAR JAVA BEANS
     * SE DEBE DE PROTEGER LOS ATRIBUTOS
     * ACCESO DE CONSTRUCTOR SIN ARGUMENTOS Y UNO PARA TEST CON ARGUMENTOS
     * Y IMPLEMENTAR GETTER Y SETTER
     * ES OPCIONAL TOSTRING - HASHCODE*/
    private String nombre;
    private String apellido;

    //Constructor vacio
    public Persona() {
    }

    //Constructor con parámetros
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "|| PERSONA ||\n" +
                "|| Nombre : [" + nombre + "]\n" +
                "|| Apellido : [" + apellido + "]\n";
    }
}

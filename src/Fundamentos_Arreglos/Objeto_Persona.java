package Fundamentos_Arreglos;

public class Objeto_Persona {
    //DECLARAMOS SUS VARIABLES
    String nombre = "";
    String apellido = "";
    int edad;

    //CONSTRUCTOR VACÍO
    public Objeto_Persona() {
    }

    //CONSTRUCTOR CON PARÁMETROS
    public Objeto_Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    //MÉTODO SETTER Y GETTER
    public String getNombre() {        return nombre;    }
    public void setNombre(String nombre) {        this.nombre = nombre;    }
    public String getApellido() {        return apellido;    }
    public void setApellido(String apellido) {        this.apellido = apellido;    }
    public int getEdad() {        return edad;    }
    public void setEdad(int edad) {        this.edad = edad;    }

}

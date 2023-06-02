package Fundamentos_Modificador_Acceso.paquete1;

public class Clase1_publico {
    //Atributo publico nivel de acceso publico
    public String atributoPublico = "Este es un atributo publico";
    //constructor publico

    public Clase1_publico() {
        System.out.println("Este es un constructor publico");
    }
    //método con modificado d acceso publico
    public void metodoPublico(){
        System.out.println("Este es un método publico");
    }
}

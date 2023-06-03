package Fundamentos_Modificador_Acceso.paquete1;

public class Clase4_privado {
    //private : no funciona a nivel de clase
    private String variableprivada = "Diego";

    private Clase4_privado() {
        System.out.println("Este es un contrcutor privado");
    }
    //constructor publico

    public Clase4_privado(String variableprivada) {
        this.variableprivada = variableprivada;
        System.out.println("Constructor privado");
    }

    public String getVariableprivada() {
        return variableprivada;
    }

    public void setVariableprivada(String variableprivada) {
        this.variableprivada = variableprivada;
    }

    //método privado
    private void metodoPrivated(){
        System.out.println("Estes es un método de tipo private");
    }

    @Override
    public String toString() {
        return "variable padre " + variableprivada + " : ";
    }
}

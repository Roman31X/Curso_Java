package Fundamentos_Modificador_Acceso.paquete1;

public class Clase2_protejida {
    //modificador de acceso potected
    protected String variableProtected = "Esta es una variable de acceso Protected";
    //MODIFICADOR DE ACCESO EN CONSTRUCTOR Y MÉTODO

    protected Clase2_protejida() {
        System.out.println("Constructor con modificador de acceso protected");
    }
    //contrcutor publico para acceso

    public Clase2_protejida(String variableProtected) {
        System.out.println("Constructor publico ");
    }

    protected void metodoProtected(){
        System.out.println("Este es un metodo con modificador de acceso protected");
    }

    @Override
    public String toString() {
        return "Clase2_protejida{" +
                "variableProtected='" + variableProtected + '\'' +
                '}';
    }
}

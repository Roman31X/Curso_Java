package Clases_Tipo_Genericos.genericos;

//USANDO <T> DECIMOS QUE ES DE TIPO GENERICA
public class ClaseGenerica<T>{
    private T objeto;

    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }
    public void obtenerTipo(){
        System.out.println("El tipo T es : ["+objeto.getClass().getSimpleName()+"]");
    }
}

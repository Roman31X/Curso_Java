package Ejercicios_Part_1;

public class Caja  {
    /*ENUNCIADO
    *REQUERIMIENTO PROYECTO CAJA
    * Se solicita crear una clase llamada Caja con las siguientes
    * características:
    * Debe tener 3 atributos de tipo entero (ancho, alto y profundo)
    * Debe tener 2 constructores, uno vacio y uno con 3 argumentos , uno
    * por cada artributo de la clase.
    * Debe tener el método que calcule el volumen de la caja seguin la
    * formula de la lamina anterior.
    * Crear una clase de prueba para crear un objeto de tipo caja que tenga
    * como valores: ancho=3, alto= 2, profundo = 6 y que mande a imprimir
    * el volumen de la caja según los valores proporcionados
    * anteriormente.
    * */
    //declaramos variables globales
    int ancho = 6;
    int alto = 2;
    int profundo = 6;
    //CONSTRUCTOR SIN PARAMETROS
    public Caja() {
        //mensaje para mostrar  que si se ejecuta
        System.out.println("Mensaje desde el Constructor vacío");
    }
    //CONSTRUCTOR CON PARAMETROS
    public Caja(int ancho1, int alto1, int profundo1) {
        this.ancho = ancho1;
        this.alto = alto1;
        this.profundo = profundo1;
        CalculoVolumen(ancho,alto,profundo);
    }
    //METODO PARA CALCULAR EL VOLUMEN
    public int CalculoVolumen(int ancho,int alto,int profundo){
        return (ancho * alto * profundo);
    }
}

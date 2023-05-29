package Ejercicio_Part4.mx.com.gm.mundpc;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrden;
    private static final int MAX_COMPUTADORAS = 5;
    private int contadorComputadoras;

    public Orden() {
        this.idOrden = ++Orden.contadorOrden;
        computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[this.contadorComputadoras++] = computadora;
        }else{
            System.out.println("Has superado el limite : "+Orden.MAX_COMPUTADORAS);
        }
    }
    public void mostrarOrden(){
        System.out.println("||==========ORDEN[ "+this.idOrden+" ]===========||");
        System.out.println("|| Computadora de la orden : [ "+this.idOrden+"]");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);
            System.out.println("||======================================||");
        }

    }
}

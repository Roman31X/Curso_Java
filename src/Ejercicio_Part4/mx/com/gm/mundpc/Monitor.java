package Ejercicio_Part4.mx.com.gm.mundpc;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int ContadorMonitor;

    public Monitor() {
        this.idMonitor = ++Monitor.ContadorMonitor;
    }

    public Monitor(String marca, double tamanio) {
        this();//inicializamos al primer constructor
        this.marca = marca;
        this.tamanio = tamanio;
    }
    public int getIdMonitor(){
        return this.idMonitor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getTamanio() {
        return tamanio;
    }
    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "||=====MONITOR======||\n" +
               "|| ID Monitor : [" + idMonitor +"]\n"+
               "|| Marca : [ " + marca + " ]\n" +
               "|| Tamaño : [ " + tamanio +" ]";
    }
}

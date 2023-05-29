package Ejercicio_Part3.mx.com.gm.ventas;

public class Producto {
    //Atributos
    private final int idProducto; //no poder modificar una vez establecida
    private String nombre;
    private double precio;
    private static int contadorProducto;
    //constructor
    public Producto() {
        this.idProducto = ++Producto.contadorProducto;
    }
    //Constructor 2
    public Producto(String nombre, double precio) {
        this();//hace llamado al primer constructor constructo
        this.nombre = nombre;
        this.precio = precio;
    }
    //getter y setter
    public int getIdProducto() {
        return idProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //MÉTODO toString

    @Override
    public String toString() {
        return "||=====PRODUCTO=========||\n" +
               "|| ID Producto : [ " + idProducto +" ]\t||\n" +
               "|| Nombre : [ " + nombre + " ]\t||\n" +
               "|| Precio : [ " + precio + " ]\t||\n";
    }
}


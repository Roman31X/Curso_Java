package Ejercicio_Part3.mx.com.gm.ventas;

public class Orden {
    //Atributos
    private int idOrden;
    private Producto productos[];//arreglo de tipo clase
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int Max_Productos = 5;
    //Constructor
    public Orden() {
        //Obtener numero de Ordene
        this.idOrden = ++Orden.contadorOrdenes;
        //Inicializamos el tamaño del arreglo
        this.productos = new Producto[Orden.Max_Productos];
    }
    //método para recepción de un objeto de tipo producto
    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.Max_Productos){
            productos[contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el máximo de productos [ "+Orden.Max_Productos+" ]");
        }
    }
    //METODO CALCULAR TOTAL
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            //Producto producto = this.productos[i];
            //total += producto.getPrecio();
            total += this.productos[i].getPrecio();
        }
        return total;
    }
    //MÉTODO RETORNAR MENSAJE DE CONTENIDO
    public void MostrarOrden(){
        System.out.println(" ID Orden : ["+this.idOrden+" ]");
        double totalOrden = this.calcularTotal();
        System.out.println(" Total de Orden : [ S/ "+totalOrden+" ]");
        System.out.println("||===PRODUCTOS DE LA ORDEN===||");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i].toString());
        }
    }

}

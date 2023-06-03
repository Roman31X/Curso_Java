package Fundamentos_Polimorfismo.domain;

public class Empleado {
    protected String nombre;
    protected double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    public String sobreEscritura() {
        return "||==EMPLEADO==||\n" +
                "|| Nombre : [" + nombre + "]\n" +
                "|| Sueldo : [" + sueldo +"]";
    }
}

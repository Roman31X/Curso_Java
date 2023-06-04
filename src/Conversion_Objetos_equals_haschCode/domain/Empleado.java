package Conversion_Objetos_equals_haschCode.domain;

import java.util.Objects;

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


    public String obtenerDetalle() {
        return "||==EMPLEADO==||\n" +
                "|| Nombre : [" + nombre + "]\n" +
                "|| Sueldo : [" + sueldo +"]";
    }

    @Override
    public String toString() {
        return "|| EMPLEADO : \n" +
                "|| Nombre : [" + nombre +"]\n" +
                "|| Sueldo : [" + sueldo + "]\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Empleado empleado)) return false;
        return Double.compare(empleado.getSueldo(), getSueldo()) == 0 && Objects.equals(getNombre(), empleado.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombre(), getSueldo());
    }
}

package Conversion_Objetos.domain;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override //anotación indica al compilador que esta editando sobre el padre
    public String obtenerDetalle(){
        return super.obtenerDetalle()+"\n|| Departaento : ["+this.departamento+"]";
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

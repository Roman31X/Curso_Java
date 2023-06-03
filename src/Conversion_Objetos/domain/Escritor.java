package Conversion_Objetos.domain;

public class Escritor extends Empleado{
    final TipoEscritor tipoEscritor;

    public Escritor(String nombre, double sueldo, TipoEscritor tipoEscritor) {
        super(nombre, sueldo);
        this.tipoEscritor = tipoEscritor;
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle()+"\n|| Escritor : [" +
               tipoEscritor +"]";
    }

    @Override
    public String toString() {
        return "|| Escritor : \n" +
                "|| Tipo Escritura : [" + tipoEscritor +"]";
    }

    public TipoEscritor getTipoEscritor() {
        return tipoEscritor;
    }
}

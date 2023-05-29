package Ejercicio_Part4.mx.com.gm.mundpc;

public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRaton;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRaton;
    }

    @Override
    public String toString() {
        return "||====RATON===||\n" +
               "|| ID Raton : [ " + idRaton +" ]\n"+
               super.toString();
    }
}

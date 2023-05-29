package Ejercicio_Part4.mx.com.gm.mundpc;

public class Teclado extends DispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclado;
    }

    @Override
    public String toString() {
        return "||======TECLADO======||\n" +
               "|| ID Teclado : [" + idTeclado +" ]\n"+
               super.toString();
    }
}

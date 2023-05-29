package Ejercicio_Part4.mx.com.gm.mundpc;

public class DispositivoEntrada {
    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    public String getTipoEntrada() {
        return tipoEntrada;
    }
    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "||====DISPOSITIVO====||\n" +
               "|| Tipo de Entrada : [ " + tipoEntrada + " ]\n" +
               "|| Marca : [ " + marca + " ]";
    }
}

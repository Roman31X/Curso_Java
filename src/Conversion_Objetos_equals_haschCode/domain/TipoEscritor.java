package Conversion_Objetos_equals_haschCode.domain;

public enum TipoEscritor {
    CLASICO("Escritura a Mano"),
    MODERNO("Escritura Digital");

    private final String descripcion;

    private TipoEscritor(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

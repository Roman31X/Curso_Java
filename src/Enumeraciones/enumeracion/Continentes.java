package Enumeraciones.enumeracion;

public enum Continentes {
    //PUEDE CRECER MÁS SUS ATRIBUTOS EN ENUMERACIONES
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    private final int paises;
    //DE AGREGAR MAS VALORES SE AGREGARAN EL TIPO DE ARGUMENTO
    //EN EL CONSTRUCTOR
    Continentes(int paises){
        this.paises = paises;
    }
    //MEDIANTE EL MÉTODO GETTER SE RECUPERARA EL CONTENIDO DE LA VARIABLE
    public int getPaises(){
        return this.paises;
    }
}

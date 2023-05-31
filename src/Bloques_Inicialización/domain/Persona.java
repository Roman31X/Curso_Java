package Bloques_Inicialización.domain;

public class Persona {
    private final int idPersona;
    private static int contadorPresona;
    //este bloque se carga una sola vez en memoria al inicial la ejecución
    static{
        System.out.println("EJECUCIÓN BLOQUE ESTATICO");
        //no se puede usar el operado "this."
        ++Persona.contadorPresona;
        // no se puede incializar en estatico al no ser de ese tipo idPersona = 10;
    }
    //BLOQUE DE INICIALIZACIÓN ESTE SE EJECUTA ANTES DEL CONSTRUCTOR DE LA CLASE
    {
        System.out.println("EJECUCIÓN DE BLOQUE NO ESTATICO");
        this.idPersona = Persona.contadorPresona++;
    }
    //CONSTRUCTOR
    public Persona(){
        System.out.println("EJECUCIÓN DEL CONSTRUCTOR");
    }
    //RECUPERAR EL ID PERSONA
    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "idPersona=" + idPersona +
                '}';
    }
}

package Fundamentos_Modificador_Acceso.paquete2;

import Fundamentos_Modificador_Acceso.paquete1.Clase4_privado;

public class Clasehija4 extends Clase4_privado {
    //prodemos llamar al padre protected
    public Clasehija4() {
        //de este modod tendremos acceso al constructor
        //publico de la clase publica
        super("publico");
        System.out.println("Este es el constructor publico de la hija");
    }
}

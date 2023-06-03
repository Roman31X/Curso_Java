package Fundamentos_Modificador_Acceso.paquete3;

import Fundamentos_Modificador_Acceso.paquete1.Clase1_publico;
import Fundamentos_Modificador_Acceso.paquete1.Clase2_protejida;
import Fundamentos_Modificador_Acceso.paquete1.Clase4_privado;
import Fundamentos_Modificador_Acceso.paquete2.Clasehija2;
import Fundamentos_Modificador_Acceso.paquete2.Clasehija4;

public class TestModificador {
    public static void main(String[] args) {
        //PUBLIC
        Clase1_publico clase1 = new Clase1_publico();
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();
        System.out.println();
        //PROTECTED
        //no tendremos acceso al constructor protected
        Clase2_protejida clase2 = new Clase2_protejida("Colores");
        clase2.toString();
        //PROTECTED + HIJA
        //tenemos acceso al constructor protected
        Clasehija2 hija2 = new Clasehija2();
        //tenemos acceso a ver la modificación de la variable protected
        hija2.toString();
        System.out.println();
        //DEFAULT
        /**EL TEST DEL MODIFICADOR DE ACCESO DEFAULT SOLO
         * SE PUEDE HACER EN EL PAQUETE DONDE SE ENCUENTRE
         * LA CLASE*/
        //PRIVATE
        Clase4_privado privado = new Clase4_privado("Variable");
        privado.setVariableprivada("Modificado");
        System.out.println(privado.toString()+privado.getVariableprivada());
        Clasehija4 hija4 = new Clasehija4();
        hija4.toString();


    }
}

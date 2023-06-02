package Fundamentos_Modificador_Acceso.paquete2;

import Fundamentos_Modificador_Acceso.paquete1.Clase2_protejida;

public class Clasehija2 extends Clase2_protejida {
    public Clasehija2() {
        super();
        this.variableProtected = "Se modifico";
        System.out.println("Constructor hija modifico :  " + variableProtected);
        this.metodoProtected();

    }
}

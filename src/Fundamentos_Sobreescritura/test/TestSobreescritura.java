package Fundamentos_Sobreescritura.test;

import Fundamentos_Sobreescritura.domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Juan",5000,"Sistemas");
        System.out.println("Gerente : \n"+gerente1.sobreEscritura());
    }
}

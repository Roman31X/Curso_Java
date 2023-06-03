package Fundamentos_Polimorfismo.test;

import Fundamentos_Polimorfismo.domain.Empleado;
import Fundamentos_Polimorfismo.domain.Gerente;

public class testPolimorfismo {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan",5000);
        //System.out.println("Empleado : \n"+empleado.sobreEscritura());
        imprimir(empleado);


        //HIJA
        empleado= new Gerente("Diego",8000,"Sistemas");
        //System.out.println("Gerente : \n"+gerente.sobreEscritura());
        imprimir(empleado);


    }
    //POLIMORFISMO
    public static void imprimir(Empleado empleado){
        String detalles = empleado.sobreEscritura();
        System.out.println("Destalles: \n"+detalles);
        System.out.println("||===========================||");
        //System.out.println("Empleado : \n"+empleado.sobreEscritura());
    }
}

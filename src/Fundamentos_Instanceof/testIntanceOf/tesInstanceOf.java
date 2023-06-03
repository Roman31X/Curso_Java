package Fundamentos_Instanceof.testIntanceOf;


import Fundamentos_Instanceof.domain.Empleado;
import Fundamentos_Instanceof.domain.Gerente;

public class tesInstanceOf {
    public static void main(String[] args) {
        //PADRE
        Empleado empleado = new Empleado("Juan",5000);
        //determinarContenido(empleado);
        //HIJA
        empleado= new Gerente("Diego",8000,"Sistemas");
        determinarContenido(empleado);


    }
    //POLIMORFISMO
    public static void determinarContenido(Empleado empleado){
        //la variable empleado apunta aun tipo gerente
        if(empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            //conversion de tipo de variable a tipo gerente
            System.out.println("Gerente : ["+((Gerente) empleado).getDepartamento()+"]");
        }
        if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            System.out.println("Empleado : ["+empleado.getNombre()+"]");

        }
        if(empleado instanceof Object){
            System.out.println("Es  de tipo Object");
            empleado.toString();
        }
    }
}

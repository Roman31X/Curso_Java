package Conversion_Objetos_equals_haschCode.testConversion;

import Conversion_Objetos_equals_haschCode.domain.Empleado;

public class testClaseObject {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Diego",5000);
        Empleado empleado2 = new Empleado("Diego",5000);
        if(empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }else{
            System.out.println("Tienen distintas referencia en memoria");
        }
        System.out.println();
        if(empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales en contenido");
        }else{
            System.out.println("Los objetos no son iguales en contenido");
        }
        System.out.println();
        if(empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("El valor de hashCode() es igual verdadero");
            System.out.println("Porque ["+empleado1.getSueldo()+"] es igual a ["+empleado2.getSueldo()+"]");
        }else{
            System.out.println("El valor de hashCode() es diferente es falso");
            System.out.println("Porque ["+empleado1.getSueldo()+"] no es igual a ["+empleado2.getSueldo()+"]");
        }


    }
}

package Conversion_Objetos_equals_haschCode.testConversion;

import Conversion_Objetos_equals_haschCode.domain.Empleado;
import Conversion_Objetos_equals_haschCode.domain.Escritor;
import Conversion_Objetos_equals_haschCode.domain.TipoEscritor;

public class testConversionObjetos {
    public static void main(String[] args) {
         Empleado empleado;
         empleado = new Escritor("Diego",5000, TipoEscritor.CLASICO);
         System.out.println(empleado.obtenerDetalle());
         System.out.println();
         //System.out.println(empleado);
        /**DOWNCASTING - convierte a un padre ne tipo hija*/
         //conversion de empleado padre a hija escritor
         //forma rapida
         System.out.println("Tipo de escritura : ["+((Escritor)empleado).getTipoEscritor()+"]");
         //forma paso a paso
         Escritor escritor = (Escritor) empleado;
         System.out.println(escritor.getTipoEscritor());
         System.out.println();

         /**UPCASTING - convierte a una hija a tipo padre*/
         Empleado empleado2 = escritor;
         System.out.println(empleado2.obtenerDetalle());


    }
}

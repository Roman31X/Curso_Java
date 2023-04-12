package DataFecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Fecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variable que capture la fecha de nacimiento
        Date fecha = new Date();
        //Datos de la fecha actual
        System.out.println("fecha: "+fecha);
        //Calcular de cuantos años tengo
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //Solicitamos las fecha para hacer cálculo de años
        System.out.println("Ingrese la fecha en el siguiente orden:");
        System.out.println("=============Año-mes-dia===============");
        try {
            Date fecha1 = df.parse(sc.next());
            long diferencia = fecha.getTime() - fecha1.getTime();
            int year = (int) (diferencia / 1000 / 60 / 60 / 24 / 365);
            System.out.println("Tienes " + year + " años");
        }catch(ParseException e){
            e.printStackTrace();
        }




    }
}

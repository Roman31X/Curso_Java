package Enumeraciones.test;

import Enumeraciones.enumeracion.Enumeracion_Dias;

public class TestEnumeracion {
    public static void main(String[] args) {
        System.out.println("HOY ES : [ " + Enumeracion_Dias.LUNES + " ]");
        indicarDiaSemana(Enumeracion_Dias.MARTES);
    }
    private static void indicarDiaSemana(Enumeracion_Dias dia){
        switch (dia){
            case LUNES : System.out.println("Primer dia de la semana"); break;
            case MARTES: System.out.println("Segundo dia de la semana"); break;
            case MIERCOLES: System.out.println("Tercer dia de la semana"); break;
            case JUEVES: System.out.println("Cuarto dia de la semana"); break;
            case VIERNES: System.out.println("Quinto dia de la semana"); break;
            case SABADO: System.out.println("Sexto dia de la semana"); break;
            case DOMINGO: System.out.println("Septimo dia de la semana"); break;
        }
    }
}

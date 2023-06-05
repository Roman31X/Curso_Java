package Manejo_Archivos.test;

import static Manejo_Archivos.manejoArchivos.ManejoArchivo.*;

public class TestManejoArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "Prueba.txt";
        //crearArchivo(nombreArchivo);
        //escribirArchivo(nombreArchivo,"Hola desde Java");
        //anexarArchivo(nombreArchivo,"Ahora tiene que pagar por tu documento");
        leerArchivo(nombreArchivo);
    }
}

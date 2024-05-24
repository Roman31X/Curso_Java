package Manejo_Archivos.manejoArchivos;

import java.io.*;

public class ManejoArchivo {

    //método estatico para no instanciar con objetos
    public static void crearArchivo(String nombreArchivo){
        //creammos un objeto de tipo file en memoria
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se a creado correctamente el archivo");
        }catch (FileNotFoundException e){
            e.printStackTrace(System.out);
        }
    }

    //AGREGAR INFORMACIÓN
    public static void escribirArchivo(String nombreArchivo,String contenido){
        //Abrimos el archivo
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Ya tiene contenido el archivo");
        }catch (FileNotFoundException e){
            e.printStackTrace(System.out);
        }
    }

    //AGREGAR INFORMACIÓN
    public static void anexarArchivo(String nombreArchivo,String contenido){
        //Abrimos el archivo
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(new FileWriter(archivo,true));
            salida.println(contenido);
            salida.close();
            System.out.println("Ya tiene contenido el archivo");
        }catch (FileNotFoundException e){
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
    }

    //LEER INFORMACIÓN ARCHIVO
    public static void leerArchivo(String nombreArchivo){
        //Abrimos el archivo
        int i=0;
        var archivo = new File(nombreArchivo);
        //para leer lineas completa del archivo
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            //para leer líneas completas
            var lectura = entrada.readLine();
            while (lectura != null){
                System.out.println("Linea ["+i+"] : ["+lectura+"]");
                lectura = entrada.readLine();
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

    }
}

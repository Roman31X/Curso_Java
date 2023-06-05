package CatalogoPeliculas.mx.com.gm.peliculas.datos;


import CatalogoPeliculas.mx.com.gm.peliculas.domain.Pelicula;
import CatalogoPeliculas.mx.com.gm.peliculas.excepciones.*;

import java.io.*;
import java.util.*;

public class AccesoDatosImpl implements IAccesoDatos {

    @Override
    public boolean existe(String nombreRecurso){
        var archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> lista(String nombreRecurso) throws LecturaDatosEx {
        //Cargamos el archivo txt
        var archivo = new File(nombreRecurso);
        //Creamos una lista de tipo Pelicula
        List<Pelicula> peliculas  = new ArrayList<>();
        //Al realizar la ejecucion de lectura el compilador
        //nos suguiere implementar un try - catch
        try {
            //Almacenamos la lectuta de la primera linea del documento en
            //la variable entrada
            var entrada = new BufferedReader(new FileReader(archivo));
            //Declaramos una variable de tipo String para almacenar los nombres
            //de las peliculas
            String linea = null;
            //Se realiza la lectura y almacenamos en la variable "linea"
            linea = entrada.readLine();
            //Condición en bucle pra recorrerla lectura de linea
            //de no encontrar nada en la linea de lectura
            //este saldra del bucle
            while (linea != null){
                //Creamos una variable Objeto de la clase pelicula
                //Alamcenamos el dato de "linea" en "pelicula"
                Pelicula pelicula = new Pelicula(linea);
                //Se agrega el dato en el objeto
                peliculas.add(pelicula);
                //se realiza una lectura de la segunda linea del archivo txt
                linea = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Execcción al listar pelicula"+e.getMessage());
        }catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Execcción al listar pelicula"+e.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        //recepcionamos el nombre del archivo
        var archivo = new File(nombreRecurso);
        try {
            //Lectura de la primera linea del codumento
            //el compilador suguiere implementar estructura try - catch
            var salida = new PrintWriter(new FileWriter(archivo,anexar));
            //LECTURA DE LA SIGUIENTE LINEA
            salida.println(pelicula.toString());
            //CERRAMOS LECTURA
            salida.close();
            //ENBIIAMOS NOMBRE DE LA PELICULA BUSCADA
            System.out.println("Se ha escrito información al archivo : ["+pelicula+"]");
        } catch (IOException e) {
            //MENSAJE DE NO ENCONTRA EL NOMBRE DE LA PELICULA
            e.printStackTrace();
            throw new EscrituraDatosEx("Excepción al escribir pelicula : "+e.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        //CAPTURAMOSN EL NOMBRE DEL ARCHICO
        var archivo = new File(nombreRecurso);
        //DECLARAMOS UNA VARIBALE STRING DE CONTENIDO "null"
        String resultado = null;
        try {
            //Capturamos la primera lectura en la variable "entrada"
            var entrada = new BufferedReader(new FileReader(archivo));
            //variable para captirar la lectuta
            String linea = null;
            //guardamos la primera lectura en la varibale linea
            linea = entrada.readLine();
            //declaramos una varible d tipo int pra conocer
            //pa posición del nombre
            int indice = 1;
            //condición si la lectura es vacia
            while (linea != null){
                //una vez tengamos la lectura se evalua si es igual al valor ingresado
                if(buscar != null && buscar.equalsIgnoreCase(linea)){
                    //capturamos la busqueda en la variable "resultado"
                    resultado = "Pelicula : ["+linea+"] encontrada en el indice :["+indice+"]";
                    break;
                }
                //realizamos la siguiente lectura de linea
                linea = entrada.readLine();
                //aumentamos el contador para conocer la pocicion de la
                //linea de lectura
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Execcción al buscar pelicula : "+e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Execcción al buscar pelicula : "+e.getMessage());
        }
        return resultado;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        var archivo = new File(nombreRecurso);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado correctamente el archivo");
        } catch (IOException e) {
            e.printStackTrace();
            throw new LecturaDatosEx("Excepción al crear archivo"+e.getMessage());
        }
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {
        var archivo = new File(nombreRecurso);
        if(archivo.exists())
        archivo.delete();
        System.out.println("Se a borrado el archivo correctamente");
    }
}

package CatalogoPeliculas.mx.com.gm.peliculas.datos;

import CatalogoPeliculas.mx.com.gm.peliculas.domain.Pelicula;
import CatalogoPeliculas.mx.com.gm.peliculas.excepciones.*;

import java.util.List;

public interface AccesoDatos {
    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    List<Pelicula> lista(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Pelicula pelicula,String nombreRecurso,boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombre) throws AccesoDatosEx;

}

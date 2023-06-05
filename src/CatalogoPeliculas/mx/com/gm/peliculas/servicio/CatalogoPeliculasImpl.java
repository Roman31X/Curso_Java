package CatalogoPeliculas.mx.com.gm.peliculas.servicio;

import CatalogoPeliculas.mx.com.gm.peliculas.datos.*;
import CatalogoPeliculas.mx.com.gm.peliculas.domain.Pelicula;
import CatalogoPeliculas.mx.com.gm.peliculas.excepciones.AccesoDatosEx;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas{

    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula,NOMBRE_RECURSO,anexar);
        } catch (AccesoDatosEx e) {
            System.out.println("Erro de acceso a dato AGREGAR");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas = this.datos.lista(NOMBRE_RECURSO);
            for (var pelicula : peliculas) {
                System.out.println("|| Pelicula : [" + pelicula+"]");
            }
        } catch (AccesoDatosEx e) {
            System.out.println("Error de acceso a datos LISTA");
            e.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado = null;
        try {
            resultado = this.datos.buscar(NOMBRE_RECURSO,buscar);
        } catch (AccesoDatosEx e) {
            System.out.println("Erro de acceso a datos BUSCAR");
            e.printStackTrace(System.out);
        }
        System.out.println("|| Resultado = [" + resultado+"]");
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if(this.datos.existe(NOMBRE_RECURSO)){
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);

            }else{
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx e) {
            System.out.println("Error al iniciar Catalogo de Peliculas");
            e.printStackTrace(System.out);
        }
    }
}

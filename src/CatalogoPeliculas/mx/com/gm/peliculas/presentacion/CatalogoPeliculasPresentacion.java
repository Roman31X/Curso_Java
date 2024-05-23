package CatalogoPeliculas.mx.com.gm.peliculas.presentacion;

import CatalogoPeliculas.mx.com.gm.peliculas.servicio.*;

import java.util.*;

public class CatalogoPeliculasPresentacion {
    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0){
            System.out.println("||===INTERFAZ PELÍCULA===||\n"+
                               "|| [1] - Iniciar Catalogo ||\n"+
                               "|| [2] - Agregar Película ||\n"+
                               "|| [3] - Listar Película  ||\n"+
                               "|| [4] - Buscar Película  ||\n"+
                               "|| [0] - Salir            ||");
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion){
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la película");
                    var nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduce nombre película a buscar: ");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                case 0:
                    System.out.println("Adios, Gracias!!!");
                    break;
                default:
                    System.out.println("Opción no reconocida [-_-]");
                    break;
            }
        }
    }
}

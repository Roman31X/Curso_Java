package Fundamentos_Interfaces.ClaseInterfaces;

public class ImplementacionMysql implements IAaccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Se inserto el dato en la Base Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Se listo la Base de Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Se actualizo la Base de Mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("Se elimino el dato en la Base de Mysql");
    }
}

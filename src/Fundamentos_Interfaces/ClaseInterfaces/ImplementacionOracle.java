package Fundamentos_Interfaces.ClaseInterfaces;

public class ImplementacionOracle implements IAaccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Se inserto el dato en la Base Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Se listo el dato en la Base Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Se actualizo el dato en la Base Oracle");
    }

    @Override
    public void eliminar() {
        System.out.println("Se elimino el dato en la Base Oracle");
    }
}

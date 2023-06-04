package Fundamentos_Interfaces.ClaseInterfaces;

public interface IAaccesoDatos {
    int MAX_REGISTROS = 10;

    void insertar();

    void listar();

    void actualizar();

    void eliminar();


}

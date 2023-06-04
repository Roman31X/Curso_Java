package Fundamentos_Interfaces.testInterfaces;

import Fundamentos_Interfaces.ClaseInterfaces.IAaccesoDatos;
import Fundamentos_Interfaces.ClaseInterfaces.ImplementacionMysql;
import Fundamentos_Interfaces.ClaseInterfaces.ImplementacionOracle;

public class TestInterfaz {
    public static void main(String[] args) {
        //MYSQL
/*      IAaccesoDatos datos = new ImplementacionMysql();
        datos.insertar();
        datos.listar();
        datos.actualizar();
        datos.eliminar();
        System.out.println();
        //ORACLE
        IAaccesoDatos dato2 = new ImplementacionOracle();
        dato2.listar();
        dato2.insertar();
        dato2.actualizar();
        dato2.eliminar();*/
        //REUTILIZAR CODIGO
        //MYSQL
        IAaccesoDatos datos = new ImplementacionMysql();
        imprimir(datos);
        //ORACLE
        System.out.println();
        datos = new ImplementacionOracle();
        imprimir(datos);
    }
    public static void imprimir(IAaccesoDatos dato){
        dato.listar();
        dato.insertar();
        dato.actualizar();
        dato.eliminar();
    }
}

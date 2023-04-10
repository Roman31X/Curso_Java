package Bucles;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Modulo {
    public static void main(String[] args) {
        int opcionIndice = 0;
        Map<String,Integer> opciones = new HashMap<>();
        opciones.put("Actualizar",1);
        opciones.put("Eliminar",2);
        opciones.put("Agregar",3);
        opciones.put("Listar",4);
        opciones.put("Salir",5);

        Object[] opArreglo = opciones.keySet().toArray();

        Object opcion = JOptionPane.showInputDialog(null,"Seleccione una Opcion",
                "Mantener de Producto",
                JOptionPane.INFORMATION_MESSAGE,
                null,opArreglo,
                opArreglo[0]);

        if(opcion == null){

            JOptionPane.showInputDialog(null,"Debe seleccionar una operación");

        }else {
            int muere=0;
            opcionIndice = opciones.get(opcion.toString());
            int num=opcionIndice;
            do{


                switch (num){
                    case 1 :
                        JOptionPane.showMessageDialog(null, "Usuario ACTUALIZADO correctamente");
                        break;
                    case 2 :
                        JOptionPane.showMessageDialog(null, "Usuario ELIMINADO correctamente");
                        break;
                    case 3 :
                        JOptionPane.showMessageDialog(null, "Usuario AGREGADO correctamente");
                        break;
                    case 4 :
                        JOptionPane.showMessageDialog(null, "Usuario LISTADO correctamente");
                        break;
                    case 5 :
                        JOptionPane.showMessageDialog(null, "SALIO correctamente");muere = 0;
                        break;
                }
                opcionIndice = opciones.get(opcion.toString());
                num=opcionIndice;

            }while(muere >= 1);

        }
    }
}

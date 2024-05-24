package ApiColeccion.test;

import java.util.*;

public class TestColeccion {
    public static void main(String[] args) {
        //CREAMOS UN ARRAY DE TIPO OBJETO DE LA CLASE LIST
        List miLista = new ArrayList();

        /**ES ORDENADO AL MOSTRAR SUS ELEMENTOS A COMO FUERON
         * REGISTRADOS - PERO SI HAY DATOS IGUALES AUN ASI
         * LO MOSTRARA EN LA CONSOLA*/

        //AGREGAMOS DATOS AL ARRAYLIST
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");
        miLista.add("Domingo");

        //imprimir(miLista);
        //AL QUERER MOSTRAR SABEMOS QUE EL ARRAYLIST ES DE TIPO OBJETO
        //POR ELLO CAPTURAREMOS LOS ELEMENTOS DEL ARRAYLIST
        /*for (Object elemento : miLista) {
            System.out.println(elemento);
        }
        System.out.println();
        //EJECUCIÓN MEDIANTE LAMBDA O FUNCIÓN FLECHA
        //en este tipo de ejecución no es necesario indicar de que tipo es
        miLista.forEach(elemento ->{
            System.out.println("ELEMENTO : "+elemento);
        });*/

        System.out.println();

        /**NO RESPETA EL ORDEN EN QUE FUERON REGISTRADOS
         * - PERO NO DUPLICA DATOS IGUALES REGISTRADOS*/
        //Tipo SET
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miércoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sábado");
        miSet.add("Domingo");
        miSet.add("Domingo");
        //imprimir(miSet);

        //MAP
        Map miMapa = new HashMap();
        miMapa.put("001","Diego");
        miMapa.put("002","Carlos");
        miMapa.put("003","Daniel");
        miMapa.put("004","Renne");

        //recuperamos el elemento
        String elemento = (String)  miMapa.get("003");
        //System.out.println("Tipo de clase : ["+miMapa.getClass().getSimpleName()+"]");
        //System.out.println("Elemento : "+elemento);
        //PARA IMPRIMIR TODOS LOS ELEMENTOS GUARDADOS LLAVE
        imprimir(miMapa.keySet());

        //PARA IMPRIMIR TODOS LOS VALORES
        imprimir(miMapa.values());


    }

    //Interface más generic para recepción de objeto de tipo List y Set
    public static void imprimir(Collection coleccion){
        //lambda COLECCIÓN
        System.out.println("Tipo : ["+coleccion.getClass().getSimpleName()+"]");
        coleccion.forEach(elemento ->{
            System.out.println("Elemento : ["+elemento+"]");
        });
    }

    public static void imprimirCompacto(Collection coleccion){
        coleccion.forEach(System.out::println);
    }

}

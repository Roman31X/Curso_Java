package ApiColleccionGenericas.test;

import java.util.*;

public class TestApiColeccionGenerico {
    public static void main(String[] args) {
        //Inicializamos el tipo generico a List tipo <String>
        //Solo acepttara de tipo String
        List<String> miLista = new ArrayList<>();
        //AGREGAMOS DATOS AL ARRAYLIST
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miércoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sábado");
        miLista.add("Domingo");
        miLista.add("Domingo");
        //RECUPERAMOS EL ELEMENTO EN STRING NO ES NECESARIO
        //TRANSFORMAR
        String elemento = miLista.get(1);
        //IMPRIMIMOS
        System.out.println("elemento = " + elemento+"\n");
        //IMPRIMIMOS TODA LA LISTA
        imprimir(miLista);
        System.out.println();
        //SET GENERICO
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miércoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sábado");
        miSet.add("Domingo");
        miSet.add("Domingo");
        imprimir(miSet);
        //MAP GENERICO
        /**EN MAP NO DUPLICA CUANDO LA LLAVE SE DUPLICA Y EL CONTENDIO ES
         * DIFERENTE SE SUSTITUYE EL PRIMER VALOR POR EL ULTIMO
         * ASIGNADO CON ESA LLAVE*/
        System.out.println();
        Map<String,String> miMapa = new HashMap<>();
        miMapa.put("001","Diego");
        miMapa.put("002","Carlos");
        miMapa.put("003","Daniel");
        miMapa.put("004","Renne");
        miMapa.put("004","Daniela");
        //recuperamos el elemento
        String mapa = miMapa.get("003");
        System.out.println("mapa = " + mapa+"\n");
        //PARA IMPRIMIR TODOS LOS ELEMENTOS GUARDADOS LLAVE
        imprimir(miMapa.keySet());
        System.out.println();
        //PARA IMPRIMIR TODOS LOS VALORES
        imprimir(miMapa.values());
    }
    //<Objects> - generico todo tipo
    //<String> - unicamente cadena de tipo String
    public static void imprimir(Collection<String> colecion){
        colecion.forEach(elemento ->{
            System.out.println("Elemnto : "+elemento);
        });
    }
}

package Ejercicio_Part4.mundopc;

import Ejercicio_Part4.mx.com.gm.mundpc.*;

public class MundoPC {
    public static void main(String[] args) {
        //DATOS PARA UNA COMPUTADORA HP
        Monitor monitorHP = new Monitor("HP",13);
        Teclado tecladoHP = new Teclado("USB","HP");
        Raton ratonHP = new Raton("USB","HP");
        Computadora computadoraHP = new Computadora("Computadora HP",monitorHP,tecladoHP,ratonHP);
        //DATOS PARA UNA COMPUTADORA GAMER
        Monitor monitorGamer = new Monitor("Gamer",30);
        Teclado tecladoGamer = new Teclado("Bluetooth","Gamer");
        Raton ratonGamer = new Raton("Bluetooth","Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer",monitorGamer,tecladoGamer,ratonGamer);

        /**
         * <h1>PRIMERA ORDEN</h1>
         * Se crea un objeto del tipo orden para agregar<br>
         * la información de los dispositivos
         * <p>*/
        Orden orden1 = new Orden();
        //AGREGAMOS LOS OBJETOS E INFORMACION EN EL ARREGLO DE ORDEN
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        //LLAMAMOS AL MÉTODO MOSTRAR ORDEN
        orden1.mostrarOrden();

        /**
         * <h1>SEGUNDA ORDEN</h1>
         * Se crea un objeto del tipo orden para agregar<br>
         * la información de los dispositivos
         * <p>*/
        //DATOS PARA UNA COMPUTADORA OFICINA
        Monitor monitorOficina = new Monitor("HP",20);
        Teclado tecladoOficina = new Teclado("USB","LOGITECD");
        Raton ratonOficina = new Raton("Bluetooth","ASUS");
        Computadora computadoraOficina = new Computadora("Computadora Oficina",monitorOficina,tecladoOficina,ratonOficina);
        //ORDEN [2]
        Orden orden2 = new Orden();
        //AGREGAMOS LOS OBJETOS E INFORMACION EN EL ARREGLO DE ORDEN
        orden2.agregarComputadora(computadoraOficina);
        orden2.mostrarOrden();

    }
}

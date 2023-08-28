package Fundamentos_Arreglos;

import java.util.Scanner;

public class BuscarDentroArreglo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int respuesta = 0;
        int respuestaDos = 0;
        int respuestaTres = 0;
        int respuestaCuatro = 0;
        int[] entero = new int[5];
        String[] cadena = new String[5];

        do{
            respuesta = Menu();
            switch (respuesta){
                case 1:
                        respuestaDos = SegundoMenu();
                        switch (respuestaDos){
                            case 1:
                                entero = arregloEntero();
                                break;
                            case 2:
                                cadena = arregloCadena();
                            case 0:
                                break;
                        }
                        break;
                case 2:
                    respuestaTres = TercerMenú();
                    switch (respuestaTres){
                        case 1:
                            int encontarEntero = 0;
                            System.out.print("Ingrese numero a buscar en el arreglo :");
                            encontarEntero = sc.nextInt();
                            System.out.println(buscarEntero(entero,encontarEntero));
                            break;
                        case 2:
                            //Solicitamos cadea para buscar
                            String encontarCadena = "";
                            System.out.print("Ingrese nombre a buscar en el arreglo :");
                            encontarCadena = sc.next();
                            System.out.println(buscarCadena(cadena,encontarCadena));
                            break;
                        case 0:
                            break;
                    }
                    break;
                case 3:
                    respuestaCuatro = CuartoMenu();
                    switch (respuestaCuatro){
                        case 1:
                                if(entero == null){
                                    System.out.println("El arreglo de números esta vacio debe rellenarlo primero");
                                }else{
                                    for (int i = 0; i < entero.length; i++) {
                                        System.out.println(entero[i]);
                                    }
                                }
                            break;
                        case 2:
                                if(cadena.equals(null)){
                                    System.out.println("El arreglo de nombres esta vacio debe de rellenarlo primero");
                                }else{
                                    for (int i = 0; i < cadena.length; i++) {
                                        System.out.println(cadena[i]);
                                    }
                                }
                            break;
                        case 0:
                            break;
                    }
                    break;
                case 0:
                    break;
            }
            System.out.println("|---------------------------------|");
        }while (respuesta != 0);
        System.out.println("GRACIAS POR SU VISITA :)");
    }

    //MÉTODOS
    public static int Menu(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("|------------------------|");
        System.out.println("| [1] - Rellenar arreglo |");
        System.out.println("| [2] - Buscar dato      |");
        System.out.println("| [3] - Mostrar Arreglo  |");
        System.out.println("| [0] - SALIR            |");
        System.out.println("|------------------------|");
        System.out.print("RESPUESTA : ");
        opcion = sc.nextInt();
        return opcion;
    }

    public static int SegundoMenu(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("|------------------------|");
        System.out.println("| [1] - Llenar Números   |");
        System.out.println("| [2] - Llenar Nombres   |");
        System.out.println("| [0] - SALIR            |");
        System.out.println("|------------------------|");
        System.out.print("RESPUESTA : ");
        opcion = sc.nextInt();
        return opcion;
    }

    public static int TercerMenú(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("|------------------------|");
        System.out.println("| [1] - Buscar Números   |");
        System.out.println("| [2] - Buscar Nombres   |");
        System.out.println("| [0] - SALIR            |");
        System.out.println("|------------------------|");
        System.out.print("RESPUESTA : ");
        opcion = sc.nextInt();
        return opcion;
    }

    public static int CuartoMenu(){
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("|------------------------|");
        System.out.println("| [1] - Mostrar Números  |");
        System.out.println("| [2] - Mostrar Nombres  |");
        System.out.println("| [0] - SALIR            |");
        System.out.println("|------------------------|");
        System.out.print("RESPUESTA : ");
        opcion = sc.nextInt();
        return opcion;
    }
    //MÉTODO LLENAR ENTEROS
    public static int[] arregloEntero(){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int dato = 0;

        System.out.println("Ingrese datos para el arreglo de NÚMEROS");

        //Solicitamos los datos para el arreglo de números
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese numero : ");
            dato = sc.nextInt();
            numeros[i] = dato;
        }
        return numeros;
    }

    public static String[] arregloCadena(){
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[5];
        String cadena = "";

        System.out.println("Ingrese nombre para el arreglo de NOMBRES");
        //Solicitamos datos para el arreglo de nombres
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese nombre : ");
            cadena = sc.nextLine();
            nombres[i] = cadena;
        }
        return nombres;
    }

    //MÉTODO DE BUSCAR ENTEROS
    public static String buscarEntero(int[] numeros,int numero){
        int k = 0;
        for (; k < numeros.length && numeros[k] != numero; k++){
        }

        if (k == numeros.length){
            return "El numero ingresado no se encuentra en el arreglo";
        }else{
            return "En numero ["+numero+"] esta en la posición ["+k+"]";
        }
    }

    public static String buscarCadena(String[] nombres, String nombre) {
        int l = 0;
        for (; l < nombres.length && !nombres[l].equals(nombre); l++){
        }

        if (l == nombres.length){
            return "El nombre ingresado no se encuentra en el arreglo";
        }else{
            return "En nombre ["+nombre+"] esta en la posición ["+l+"]";
        }
    }
}

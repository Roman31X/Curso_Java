package Fundamentos_Modificador_Acceso.paquete1;
//para utilizar el default quitamos el public o cualquier modificador
//de acceso

class Clase3_defaul {

    //modificador da acceso default no puede ser usada
    //fuera de este paquete - solo ah nivel de clase
    String atributodefault = "Este es un atributo de tipo default";

    //constructor default
    Clase3_defaul() {
        System.out.println("Constructor default");
    }

    //método default
    void metodoDefault(){
        System.out.println("Este es un método default");
    }
}

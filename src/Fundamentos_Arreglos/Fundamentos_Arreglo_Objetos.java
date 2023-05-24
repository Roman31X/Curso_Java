package Fundamentos_Arreglos;

public class Fundamentos_Arreglo_Objetos {
    public static void main(String[] args) {
        //Creamos un arreglo de tipo Objetos
        Objeto_Persona persona1 [] = new Objeto_Persona[4];
        //Llenamos el objeto
        persona1 [0] = new Objeto_Persona("Diego","Roman",23);
        persona1 [1] = new Objeto_Persona("Dante","Roman",25);
        persona1 [2] = new Objeto_Persona("Daniela","Roman",20);
        persona1 [3] = new Objeto_Persona("Ana","Roman",55);
        //mostramos el contenido del arreglo NOMBRE
        for (int i = 0; i < persona1.length; i++) {
            if(persona1[i] != null){
                System.out.println("Persona 1 = " + persona1[i].getNombre());
            }
        }
        //mostramos el contenido del arreglo APELLIDO
        for (int i = 0; i < persona1.length; i++) {
            if(persona1[i] != null){
                System.out.println("Persona 1 = " + persona1[i].getApellido());
            }
        }
        //mostramos el contenido del arreglo EDAD
        for (int i = 0; i < persona1.length; i++) {
            if(persona1[i] != null){
                System.out.println("Persona 1 = " + persona1[i].getEdad());
            }
        }
    }
}

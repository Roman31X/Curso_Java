package Fundamentos_Arreglos;

public class Invertir_Arreglo {
    public static void main(String[] args) {
        //Atributo
        String fecha[] = {"Enero","Febrero","Marzo","Abril","Mayo"};
        // capturamos el tamaño del arreglo
        int tama = fecha.length;
        System.out.println("El tamaño del arreglo es: ["+tama+"]\n");
        for (int i = 0; i < tama; i++) {
            System.out.println("El mes es: ["+(i)+"] - ["+fecha[i]+"]");
        }
        System.out.println("||=========INVERTIR=========||");
        //Ahora invertimos
        for (int j = tama-1; j >= 0  ; j--) {
            System.out.println("El ultimo mes es: ["+(j)+"] - ["+fecha[j]+"]");
        }

    }
}

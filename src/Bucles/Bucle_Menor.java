package Bucles;

public class Bucle_Menor {
    public static void main(String[] args) {
        int num[] = {12,10,5,4,20,9,16,17,8,6};
        int menor = 20;
        /*Realizar un bucle con un condicional que mostrara al menor*/
        for( int i=0; i < num.length;i++){
            if(menor > num[i]){
                menor = num[i];
            }
        }
        System.out.println("El numero menor es: "+menor);
    }
}

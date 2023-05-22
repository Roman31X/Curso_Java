package Fundamentos_Ciclos;
import java.util.*;
public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaramos las variables
        double no[]=new double [10];
        double nota=0;
        double gen=0,genpro=0;
        //Bucle para capturar las notas
        System.out.println("Ingresar 20 notas en el rango de 1 - 7");
        System.out.println("Recuerda al ingresa decimales usar la coma");
        System.out.println("========================================");
        for(int i=0;i<no.length;i++){
            System.out.print("Ingresar Nota "+i+" => ");
            nota = sc.nextDouble();
            if(nota != 0){
                no[i] = nota;
                gen+=nota;
            }else{
                System.out.println("==========NO INGRESE 0 CERO ANIMAL===========");
                sc.close();
            }
        }

        double conmay=0,conmen=0;
        double promay=0,promen=0;
        int nm=0,ne=0;
        System.out.println("================PROME NOTAS MAYORES 5===============");
        for(int i=0; i<no.length;i++){
            if(no[i] >= 5){
                conmay+=no[i];
                nm++;
            }
        }
        promay = conmay / nm;
        System.out.println("El promedio de las notas mayores a 5 es: "+promay+" cantidad de mayores es: "+nm);
        System.out.println("================PROME NOTAS MENORES 4===============");
        for(int i=0; i<no.length;i++){
            if(no[i] <= 4){
                conmen+=no[i];
                ne++;
            }
        }
        promen = conmen / ne;
        System.out.println("El promedio de las notas menores a 4 es: "+promen+" cantidad de menores es: "+ne);
        System.out.println("================ NOTAS iguales a 1===============");
        int uni=0;
        for(int i=0; i<no.length;i++){
            if(1 ==no[i]){
                uni++;
            }
        }
        System.out.println("Hay un total de: "+uni+" iguales a 1");
        System.out.println("================PROMEDIO DE NOTAS TOTAL===============");
        genpro = gen / 10;
    }
}

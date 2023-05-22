package Fundamentos_Operadores;
import java.util.*;
public class Tanque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pro=4,estado=70,tam=70;
        int con=1;
        String men = "";
        //se crea un bucle
        do {
            System.out.println("Ingrese numero para conocer el estado del tanque");
            System.out.println("Ingrese 1 para ver el estado");
            System.out.println("Ingrese 2 si desea agregar combustible");
            System.out.println("Ingrese 3 Recorrer distancia");
            System.out.println("Ingrese 4 para salir de Tanque");
            pro = sc.nextInt();
            switch (pro){
                case 1:
                    String lleno = (estado >= 70)? "Tanque lleno" :
                            (estado<=70 && estado>=60)? "Tanque casi lleno" :
                                    (estado<=60 && estado>=40) ?"Tanque 3/4" :
                                            (estado<=40 && estado>=35) ?"medio estanque":
                                                    (estado<=35 && estado>=20) ?"suficiente":"Insuficiente";
                    System.out.println("Estado de tanque es: "+lleno+" solo tiene: "+estado);
                    break;
                case 2:
                    System.out.println("Selecciono agregar combustible");
                    System.out.println("Cuanto combustible desea agregar");
                    int nu = sc.nextInt();
                    estado+=nu;
                    break;
                case 3:
                    System.out.println("Selecciono Recorrer distancia");
                    System.out.println("Cuanto desea recorrer");
                    int re = sc.nextInt();
                    estado-=re;
                    break;
                case 4: con=0;break;
            }
            System.out.println("================================================================");
        }while(con == 1);
    }
}

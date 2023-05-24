package Fundamentos_Clase_Math;

public class ArgumentosLineal {
    public static void main(String[] args) {

        if(args.length == 0 ){
            System.out.println("Debe ingresar argumento");
            System.exit(-1);
        }

        for (int i = 0; i <  args.length; i++) {
            System.out.println("Argumento n: ["+(i+1)+"] : ["+args[i]+"]");
        }
    }
}

package Fundamentos_Funciones;

public class FuncionRecursiva {
    static void recursiva(int numero){
        if(numero == 1){
            System.out.print(numero + " ");
        }else{
            //System.out.print(numero + " ");
            recursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        recursiva(5);
    }
}

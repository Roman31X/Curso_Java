package Fundamentos_Funciones;

public class FuncionSumar {
    static int sumar(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        int a = 5, b = 5;
        int respuesta = sumar(a,b);
        System.out.println("La suma de a + b es : "+respuesta);
    }
}

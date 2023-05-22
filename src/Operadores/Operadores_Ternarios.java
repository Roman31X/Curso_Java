package Operadores;

public class Operadores_Ternarios {
    public static void main(String[] args) {
        //CON LOS OPERADORIOS TERNARIOS PODEMOS EVALUAR
        //UNA CONDICIÓN ES COMO IMPLEMENTAR UN IF -ELSE
        //SIMPLIFICADO
        int edad = 23;
        //EVALUAREMOS CON LA EDAD QUE RESULTADO LE CORRESPONDE
        //A LA VARIBLE PERSONA QUE ESTARA DECLARADA COMO String
        //o cadena
        /**
         * OPERADOR TERNARIO
         * IMPLICA LA CONDICIÓN "( EDAD <= 10)"
         * CARÁCTER DE CONDICIÓN "?"
         * SI ES VERDAD "NIÑO"
         * CARÁCTER DE SER FALSO ":"
         * DE SER FALSA LA EVALUACIÓN "ADOLESCENTE"
         * */
        String persona = ( edad <= 10)? "Niño":
                         ( edad <= 20 )? "Adolescente":
                         ( edad <= 30 )? "Joven": "Adulto";
        //UNA VEZ EVALUADA OBTENDREMOS EL VALOR ASIGNADO
        //A LA VARIBALE DE TIPO String persona
        System.out.println("La persona con la edad de ["+edad+
                           "] es un ["+persona+"]");
    }
}

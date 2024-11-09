package orientacaoobjetos.arranjos.exercicio05.utils;

import java.util.Arrays;

public class NumerosUtil {

    public static void verificaPares(int[] numeros) {
        int[] pares = Arrays.stream(numeros).filter(numero -> numero % 2 == 0).toArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < pares.length; i++) {
            stringBuilder.append(pares[i]).append(" ");
        }
        System.out.println("NUMEROS PARES: ");
        System.out.println(stringBuilder);
        System.out.println("QUANTIDADE DE PARES: " + pares.length);
    }
}

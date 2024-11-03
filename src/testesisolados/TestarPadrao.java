package testesisolados;

import java.util.regex.Pattern;

public class TestarPadrao {

    private static final Pattern PATTERN = Pattern.compile("^S \\d+$");

    public static void main(String[] args) {

        String teste1 = "123456";
        String teste2 = "ABSC#12";
        String teste3 = "S 123";
        String teste4 = "S123";
        String teste5 = "";

        System.out.println(padraoAutorizacaoFrete(teste1));
        System.out.println(padraoAutorizacaoFrete(teste2));
        System.out.println(padraoAutorizacaoFrete(teste3));
        System.out.println(padraoAutorizacaoFrete(teste4));
        System.out.println(padraoAutorizacaoFrete(teste5));
    }

    public static boolean padraoAutorizacaoFrete(String valor) {
        return PATTERN.asPredicate().test(valor);
    }
}

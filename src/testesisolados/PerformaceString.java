package testesisolados;

public class PerformaceString {

    private static final Integer QUANTIDADE_REPETICOES = 100000;

    public static void main(String[] args) {
        String stringFinal = "";
        long inicio = System.currentTimeMillis();
        for(int i = 0; i < QUANTIDADE_REPETICOES; i++) {
            stringFinal+= "a";
        }
        long fim = System.currentTimeMillis();
        long resultado = fim - inicio;
        System.out.println("Tempo de execução em ms String: " + resultado);

        inicio = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < QUANTIDADE_REPETICOES; i++) {
            stringBuilder.append("a");
        }
        fim = System.currentTimeMillis();
        resultado = fim - inicio;
        System.out.println("Tempo de execução em ms StringBuilder: " + resultado);

        // Sincronizado, ideal para uso quando várias Threads lendo ou modificando a mesma String.
        inicio = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < QUANTIDADE_REPETICOES; i++) {
            stringBuffer.append("a");
        }
        fim = System.currentTimeMillis();
        resultado = fim - inicio;
        System.out.println("Tempo de execução em ms StringBuffer: " + resultado);
    }



    // Tempo de execução em ms String: 859
    // Tempo de execução em ms StringBuilder: 4
    // Tempo de execução em ms StringBuffer: 5
}

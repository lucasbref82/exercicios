package orientacaoobjetos.utilitarios;

import java.time.format.DateTimeFormatter;

public class ExercicioUtils {

    private ExercicioUtils() {

    }

    static {
    }

    public static final DateTimeFormatter PADRAO_DATA_BRASIL = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static boolean hasLenght(String value) {
        return value != null && !value.isEmpty();
    }

    public static boolean nullabeObject(Object o) {
        return o == null;
    }
}

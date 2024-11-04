package objetos.introducao.aplication.exercicio05.entities;

import java.util.ArrayList;
import java.util.List;

public class Estudante {

    public String nome;
    public List<Double> notas = new ArrayList<>();

    public Double calculaTotal() {
        return notas.stream().mapToDouble(Double::doubleValue).sum();
    }

    public Double calculaPontosFaltantes() {
        return 60 - calculaTotal();
    }

}

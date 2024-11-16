package orientacaoobjetos.abstracao.exercicio01.entities;

import orientacaoobjetos.abstracao.exercicio01.enums.Cor;

public class Retangulo extends Forma {

    private Double largura;
    private Double altura;

    public Retangulo() {
    }

    public Retangulo(Cor cor, Double largura, Double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    @Override
    public Double area() {
        return largura * altura;
    }
}

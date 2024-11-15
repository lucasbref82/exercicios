package orientacaoobjetos.composicao.exercicio02.entities;

import java.util.Objects;

public class Comentario {
    private String texto;

    public Comentario(String texto) {
        this.texto = texto;
    }

    private Comentario() {

    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comentario that = (Comentario) o;
        return Objects.equals(texto, that.texto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(texto);
    }
}

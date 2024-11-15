package orientacaoobjetos.composicao.exercicio02.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Objects;

public class Postagem {
    private LocalDateTime momento;
    private String titulo;
    private String conteudo;
    private Integer curtidas;
    List<Comentario> comentarios;

    private DateTimeFormatter padrao = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Postagem(LocalDateTime momento, String titulo, String conteudo, Integer curtidas, List<Comentario> comentarios) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.curtidas = curtidas;
        this.comentarios = comentarios;
    }

    private Postagem() {

    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Postagem postagem = (Postagem) o;
        return Objects.equals(momento, postagem.momento) && Objects.equals(titulo, postagem.titulo) && Objects.equals(conteudo, postagem.conteudo) && Objects.equals(curtidas, postagem.curtidas) && Objects.equals(comentarios, postagem.comentarios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(momento, titulo, conteudo, curtidas, comentarios);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(titulo).append("\n");
        stringBuilder.append(curtidas).append(" Likes - ").append(padrao.format(momento)).append("\n");
        stringBuilder.append("Comentarios: ").append("\n");
        for (Comentario comentario : comentarios) {
            stringBuilder.append(comentario.getTexto()).append("\n");
        }
        return stringBuilder.toString();
    }
}

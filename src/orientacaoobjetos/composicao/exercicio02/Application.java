package orientacaoobjetos.composicao.exercicio02;

import orientacaoobjetos.composicao.exercicio02.entities.Comentario;
import orientacaoobjetos.composicao.exercicio02.entities.Postagem;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Comentario> comentarios1 = List.of(new Comentario("Trenha uma boa viagem"), new Comentario("Uau isso é incrivel !"));
        Postagem primeiroPost = new Postagem(LocalDateTime.of(2018, 6,16,13, 5,44), "Viajando para Nova Zelandia", "Estou indo visitar esse país maravilhoso", 12, comentarios1);
        List<Comentario> comentarios2 = List.of(new Comentario("Boa noite."), new Comentario("Que a força esteja com você"));
        Postagem segundoPost =  new Postagem(LocalDateTime.of(2018, 7,28,23, 14,19), "Boa noite pessoal.", "Vejo vocês amanhã.", 5, comentarios2);
        System.out.println(primeiroPost);
        System.out.println(segundoPost);

    }
}

public class Autoria {
    private Livro livro;
    private Autor autor;
    private String papel; // ex: "autor principal", "coautor"

    public Autoria(Livro livro, Autor autor, String papel) {
        this.livro = livro;
        this.autor = autor;
        this.papel = papel;
    }

    public Livro getLivro() {
        return livro;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getPapel() {
        return papel;
    }

    // Método estático centralizado para criar a Autoria e sincronizar os dois lados
    public static Autoria autorar(Livro livro, Autor autor, String papel) {
        Autoria autoria = new Autoria(livro, autor, papel);
        livro.adicionarAutoria(autoria);
        autor.adicionarAutoria(autoria);
        return autoria;
    }
}
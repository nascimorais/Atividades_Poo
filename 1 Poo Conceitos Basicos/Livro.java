public class Livro {
    // Exercício 1: Atributos de instância
    private String titulo;
    private String autor;
    private boolean disponivel;

    // Exercício 2: Variável de classe (static)
    private static int totalLivros = 0;

    // Exercício 1 & 2: Construtor padrão
    public Livro() {
        this.titulo = "Sem título";
        this.autor = "Autor desconhecido";
        this.disponivel = true;
        totalLivros++; // Incrementa o contador de livros
    }

    // Exercício 1 & 2: Construtor com parâmetros
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
        totalLivros++; // Incrementa o contador de livros
    }

    // Exercício 2: Método de classe (static)
    public static int getTotalLivros() {
        return totalLivros;
    }

    // Exercício 3: Métodos de instância
    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("O livro '" + this.titulo + "' foi emprestado com sucesso!");
        } else {
            System.out.println("O livro '" + this.titulo + "' já está emprestado.");
        }
    }

    public void devolver() {
        this.disponivel = true;
        System.out.println("O livro '" + this.titulo + "' foi devolvido com sucesso!");
    }

    public void exibirFicha() {
        String status = this.disponivel ? "Disponível" : "Emprestado";
        System.out.println("----------------------------------------");
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Status: " + status);
        System.out.println("----------------------------------------");
    }
}
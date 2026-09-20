import java.util.List;

public class TesteAssociacaoNN {
    public static void main(String[] args) {
        // --- 1. Testando Livro e Autor ---
        Livro livro1 = new Livro("Dom Casmurro");
        Livro livro2 = new Livro("O Alquimista");

        Autor autor1 = new Autor("Machado de Assis");
        Autor autor2 = new Autor("Paulo Coelho");

        // Criação do vínculo sincronizado
        Autoria.autorar(livro1, autor1, "Autor Principal");
        Autoria.autorar(livro2, autor2, "Autor Principal");
        Autoria.autorar(livro1, autor2, "Colaborador Especial");

        System.out.println("=== RELATÓRIO DE LIVROS E AUTORES ===");
        List<Livro> livros = List.of(livro1, livro2);
        for (Livro livro : livros) {
            System.out.println("Livro: " + livro.getTitulo());
            for (Autoria autoria : livro.getAutorias()) {
                System.out.println("  - Autor: " + autoria.getAutor().getNome() + " (" + autoria.getPapel() + ")");
            }
        }

        System.out.println();

        // --- 2. Testando Ator e Filme ---
        Ator ator1 = new Ator("Keanu Reeves");
        Ator ator2 = new Ator("Laurence Fishburne");

        Filme filme1 = new Filme("Matrix");
        Filme filme2 = new Filme("John Wick");

        // Criação do vínculo sincronizado
        Atuacao.atuar(ator1, filme1, "Neo");
        Atuacao.atuar(ator2, filme1, "Morpheus");
        Atuacao.atuar(ator1, filme2, "John Wick");

        System.out.println("=== RELATÓRIO DE FILMES E ELENCO ===");
        List<Filme> filmes = List.of(filme1, filme2);
        for (Filme filme : filmes) {
            System.out.println("Filme: " + filme.getTitulo());
            for (Atuacao atuacao : filme.getAtuacoes()) {
                System.out.println("  - Ator: " + atuacao.getAtor().getNome() + " como " + atuacao.getPersonagem());
            }
        }
    }
}
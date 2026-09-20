public class Main {
    public static void main(String[] args) {
        System.out.println("--- TESTE DA CLASSE LIVRO ---");
        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");

        // Uso de getters
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Disponível? " + livro.isDisponivel());

        // Alterando estado via métodos
        livro.emprestar();
        System.out.println("Disponível após empréstimo? " + livro.isDisponivel());
        livro.devolver();

        System.out.println("\n--- TESTE DA CLASSE PRODUTO ---");
        Produto produto = new Produto("Teclado Mecânico", 250.0, 10);

        // Uso de getters
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$ " + produto.getPreco());
        System.out.println("Stock: " + produto.getQuantidadeEstoque());

        // Testando validação do setPreco com valor negativo
        System.out.println("\nTentando definir preço negativo (-50.0):");
        produto.setPreco(-50.0);
        System.out.println("Preço atual (permanece inalterado): R$ " + produto.getPreco());

        // Alterando preço com valor válido
        produto.setPreco(220.0);
        System.out.println("Novo Preço: R$ " + produto.getPreco());

        /*
         * EXERCÍCIO 3 (Item 3) - Teste de Erro de Compilação:
         * Descomentar a linha abaixo causará um erro de compilação,
         * pois o atributo 'titulo' é private na classe Livro:
         */
        // System.out.println(livro.titulo); // <- Erro: titulo has private access in Livro
    }
}
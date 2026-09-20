public class Produto {
    // Atributos de instância
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Variável de classe (static) para contar o total de produtos cadastrados
    private static int totalProdutos = 0;

    // 1. Construtor padrão
    public Produto() {
        this.nome = "Produto Indefinido";
        this.preco = 0.0;
        this.quantidadeEstoque = 0;
        totalProdutos++; // Incrementa a contadora
    }

    // 2. Construtor com parâmetros
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        totalProdutos++; // Incrementa a contadora
    }

    // Método de classe (static) para retornar o total de produtos
    public static int getTotalProdutos() {
        return totalProdutos;
    }
}
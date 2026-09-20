public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        setPreco(preco); // Utiliza o setter para aplicar a validação no construtor
        this.quantidadeEstoque = Math.max(quantidadeEstoque, 0);
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    // Setters com validação
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço não pode ser negativo! (" + preco + ")");
        }
    }

    // Métodos para gestão de stock
    public void repor(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
            System.out.println("Foram adicionadas " + quantidade + " unidades ao stock.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEstoque) {
            this.quantidadeEstoque -= quantidade;
            System.out.println("Venda de " + quantidade + " unidades realizada.");
        } else {
            System.out.println("Erro: Stock insuficiente ou quantidade inválida.");
        }
    }
}
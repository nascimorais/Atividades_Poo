public class ContaCripto extends ContaInvestimento {
    private String carteira;

    public ContaCripto(String titular, double saldo, double taxaRendimento, String carteira) {
        super(titular, saldo, taxaRendimento);
        this.carteira = carteira;
    }

    @Override
    public void exibirExtrato() {
        System.out.println("Conta Cripto de " + titular + " | Saldo em BTC: R$ " + saldo + " | Carteira: " + carteira);
    }
}
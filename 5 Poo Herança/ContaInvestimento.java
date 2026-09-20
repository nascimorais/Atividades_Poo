public class ContaInvestimento extends ContaBancaria {
    protected double taxaRendimento;

    public ContaInvestimento(String titular, double saldo, double taxaRendimento) {
        super(titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void exibirExtrato() {
        System.out.println("Conta Investimento de " + titular + " | Saldo: R$ " + saldo + " | Taxa: " + taxaRendimento + "%");
    }
}
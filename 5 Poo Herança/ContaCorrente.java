public class ContaCorrente extends ContaBancaria {
    protected double taxaManutencao;

    public ContaCorrente(String titular, double saldo, double taxaManutencao) {
        super(titular, saldo);
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public void exibirExtrato() {
        System.out.println(getDescricao());
    }

    public String getDescricao() {
        return "Conta Corrente de " + titular + " | Saldo: R$ " + saldo
                + " | Taxa de Manutenção: R$ " + taxaManutencao;
    }
}
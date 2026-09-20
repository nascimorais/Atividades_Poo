public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getDescricao() {
        return "Conta Bancária de " + titular + " | Saldo: R$ " + saldo;
    }

    public void exibirExtrato() {
        System.out.println(getDescricao());
    }
}
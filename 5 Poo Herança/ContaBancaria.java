public class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void exibirExtrato() {
        System.out.println("Conta comum de " + titular + " | Saldo: R$ " + saldo);
    }
}
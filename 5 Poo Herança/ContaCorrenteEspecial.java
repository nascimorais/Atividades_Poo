public class ContaCorrenteEspecial extends ContaCorrente {
    private double limiteCredito;

    public ContaCorrenteEspecial(String titular, double saldo, double taxaManutencao, double limiteCredito) {
        super(titular, saldo, taxaManutencao);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " | Limite Especial: R$ " + limiteCredito;
    }
}
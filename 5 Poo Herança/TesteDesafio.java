import java.util.ArrayList;

public class TesteDesafio {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria("Maria", 1000.0));
        contas.add(new ContaInvestimento("João", 5000.0, 10.5));
        contas.add(new ContaCripto("Ana", 15000.0, 25.0, "0xABC123..."));

        System.out.println("--- EXTRATOS (POLIMORFISMO EM 3 NÍVEIS) ---");
        for (ContaBancaria c : contas) {
            c.exibirExtrato();
        }
    }
}
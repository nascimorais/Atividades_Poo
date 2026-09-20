import java.util.ArrayList;

public class TesteDesafio {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(new ContaBancaria("Maria", 1000.0));
        contas.add(new ContaCorrente("João", 5000.0, 25.0));
        contas.add(new ContaCorrenteEspecial("Ana", 15000.0, 30.0, 10000.0));

        System.out.println("--- CONTAS (POLIMORFISMO EM 3 NÍVEIS) ---");
        for (ContaBancaria c : contas) {
            System.out.println(c.getDescricao());
        }
    }
}
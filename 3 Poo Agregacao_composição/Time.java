import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private List<Jogador> jogadores;

    public Time(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
    }

    // O jogador já existe e é recebido de fora
    public void adicionarJogador(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public void listarJogadores() {
        System.out.println("Jogadores do " + nome + ":");
        for (Jogador jogador : jogadores) {
            System.out.println("- " + jogador.getNome() + " (" + jogador.getNumeroCamisa() + ")");
        }
    }
}
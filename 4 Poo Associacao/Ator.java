import java.util.ArrayList;
import java.util.List;

public class Ator {
    private String nome;
    private List<Atuacao> atuacoes;

    public Ator(String nome) {
        this.nome = nome;
        this.atuacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Atuacao> getAtuacoes() {
        return atuacoes;
    }

    public void adicionarAtuacao(Atuacao atuacao) {
        this.atuacoes.add(atuacao);
    }
}
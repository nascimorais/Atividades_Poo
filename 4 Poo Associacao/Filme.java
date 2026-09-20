import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String titulo;
    private List<Atuacao> atuacoes;

    public Filme(String titulo) {
        this.titulo = titulo;
        this.atuacoes = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Atuacao> getAtuacoes() {
        return atuacoes;
    }

    public void adicionarAtuacao(Atuacao atuacao) {
        this.atuacoes.add(atuacao);
    }
}
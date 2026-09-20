
import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private List<Autoria> autorias;

    public Autor(String nome) {
        this.nome = nome;
        this.autorias = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Autoria> getAutorias() {
        return autorias;
    }

    public void adicionarAutoria(Autoria autoria) {
        this.autorias.add(autoria);
    }
}
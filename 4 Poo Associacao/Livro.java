import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private List<Autoria> autorias;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.autorias = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public List<Autoria> getAutorias() {
        return autorias;
    }

    public void adicionarAutoria(Autoria autoria) {
        this.autorias.add(autoria);
    }
}
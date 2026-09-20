import java.util.ArrayList;
import java.util.List;
public class Casa {
private String endereco;
private List<Comodo> comodos;
// O construtor cria os Comodos internamente (Composição)
public Casa(String endereco) {
this.endereco = endereco;
this.comodos = new ArrayList<>();
// Instanciação interna sem receber Comodo pronto de fora
this.comodos.add(new Comodo("Quarto", 12.5));
this.comodos.add(new Comodo("Sala", 20.0));
this.comodos.add(new Comodo("Cozinha", 10.0));
}
public void listarComodos() {
System.out.println("Cômodos da casa localizada em " + endereco
+ ":");
for (Comodo comodo : comodos) {
System.out.println("- " + comodo.getNome() + ": " +
comodo.getAreaM2() + "m²");
}
}
}
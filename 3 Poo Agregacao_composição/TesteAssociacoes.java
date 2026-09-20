public class TesteAssociacoes {
public static void main(String[] args) {
System.out.println("=== 1. ASSOCIAÇÃO SIMPLES ===");
Professor prof = new Professor("Carlos Eduardo");
Turma turma = new Turma("Programação Orientada a Objetos",
prof);
System.out.println("Turma: " + turma.getNome());
System.out.println("Professor responsável: " +
turma.getProfessor().getNome());
System.out.println();
System.out.println("=== 2. AGREGAÇÃO ===");
Time time = new Time("Brasil FC");
Jogador j1 = new Jogador("Alisson", 1);
Jogador j2 = new Jogador("Marquinhos", 4);
Jogador j3 = new Jogador("Vini Jr", 7);
time.adicionarJogador(j1);
time.adicionarJogador(j2);
time.adicionarJogador(j3);
time.listarJogadores();
System.out.println();
System.out.println("=== 3. COMPOSIÇÃO ===");
Casa casa = new Casa("Rua das Flores, 123");
casa.listarComodos();
}
}
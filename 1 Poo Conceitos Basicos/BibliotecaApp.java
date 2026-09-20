public class BibliotecaApp {
    public static void main(String[] args) {
        // Exercício 4 - Passo 2: Instanciar pelo menos 3 objetos Livro usando ambos os construtores
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("O Hobbit", "J.R.R. Tolkien");
        Livro livro3 = new Livro(); // Usando o construtor padrão

        System.out.println("=== OPERAÇÕES DE EMPRÉSTIMO E DEVOLUÇÃO ===");

        // Exercício 4 - Passo 3: Emprestar dois livros e devolver um
        livro1.emprestar();
        livro2.emprestar();
        livro1.devolver();

        System.out.println("\n=== FICHAS DOS LIVROS ===");

        // Exercício 4 - Passo 4: Exibir a ficha de cada livro
        livro1.exibirFicha();
        livro2.exibirFicha();
        livro3.exibirFicha();

        System.out.println("\n=== TOTAL DE LIVROS ===");

        // Exercício 4 - Passo 5: Imprimir o total de livros criados
        System.out.println("Total de livros cadastrados no sistema: " + Livro.getTotalLivros());
    }
}
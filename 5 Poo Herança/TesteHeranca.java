import java.util.ArrayList;

public class TesteHeranca {
    public static void main(String[] args) {
        // ArrayList de Veiculo
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(new Carro("Toyota", 2022, 4));
        veiculos.add(new Moto("Honda", 2021, 250));

        System.out.println("--- DADOS DOS VEÍCULOS ---");
        for (Veiculo v : veiculos) {
            v.exibirDados();
        }

        System.out.println();

        // ArrayList de Forma
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Circulo(3.0));
        formas.add(new Retangulo(4.0, 5.0));

        double somaAreas = 0;
        for (Forma f : formas) {
            somaAreas += f.calcularArea();
        }

        System.out.println("--- SOMA DAS ÁREAS ---");
        System.out.printf("Soma total das áreas: %.2f\n", somaAreas);
    }
}
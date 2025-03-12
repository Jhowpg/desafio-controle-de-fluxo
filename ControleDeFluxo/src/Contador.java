import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digitar sua primeira entrada...");
        int primeiraEntrada = scanner.nextInt();
        System.out.println("Agora digite sua segunda entrada...");
        int segundaEntrada = scanner.nextInt();
        // teste
        try {
            contar(primeiraEntrada, segundaEntrada);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

        scanner.close();
    }

    static void contar(int primeiraEntrada, int segundaEntrada) throws ParametrosInvalidosException {
        // validar se primeiraEntrada é MAIOR que segundaEntrada e lançar a exceção
        if (primeiraEntrada > segundaEntrada) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = segundaEntrada - primeiraEntrada;
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < (contagem + 1); i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

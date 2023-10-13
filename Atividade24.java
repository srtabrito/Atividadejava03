import java.util.Scanner;

public class Atividade24 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int valor;
        int maior = 0;
        int menor = 0;
        boolean primeiroValor = true;

        while (true) {
            System.out.print("Digite um valor inteiro positivo (ou 0 para encerrar): ");
            valor = entrada.nextInt();

            if (valor == 0) {
                break;
            } else if (valor <= 0) {
                System.out.println("Valor negativo ou igual a zero. Tente novamente.");
                continue;
            }

            if (primeiroValor) {
                maior = valor;
                menor = valor;
                primeiroValor = false;
            }

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
        }

        if (primeiroValor) {
            System.out.println("Nenhum valor positivo foi inserido.");
        } else {
            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
        }

        entrada.close();
    }
}

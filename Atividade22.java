import java.util.Scanner;

public class Atividade22 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int idade;
        double altura;
        int totalPessoasMais50 = 0;
        double somaAlturasMais50 = 0;

        while (true) {
            System.out.print("Digite a idade (ou idade <= 0 para encerrar): ");
            idade = entrada.nextInt();

            if (idade <= 0) {
                break;
            }

            System.out.print("Digite a altura (em metros): ");
            altura = entrada.nextDouble();

            if (idade > 50) {
                totalPessoasMais50++;
                somaAlturasMais50 += altura;
            }
        }

        if (totalPessoasMais50 > 0) {
            double mediaAlturasMais50 = somaAlturasMais50 / totalPessoasMais50;
            System.out.println("Média das alturas das pessoas com mais de 50 anos: " + mediaAlturasMais50 + " metros");
        } else {
            System.out.println("Não foram inseridos dados para pessoas com mais de 50 anos.");
        }

        entrada.close();
    }
}

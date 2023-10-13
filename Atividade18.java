import java.util.Scanner;
public class Atividade18 {
    public static void main(String[] args) {

        var entrada = new Scanner(System.in);

        int idade, menorIdade = -1, maiorIdade = -1;
        char sexo, sexoMenorSalario = ' ';
        double salario, somaSalarios = 0, menorSalario = Double.POSITIVE_INFINITY;
        int mulheresSalarioAte200 = 0;
        boolean primeiraIteracao = true;

        while (true) {
            System.out.print("Idade (negativa para sair): ");
            idade = entrada.nextInt();
            if (idade < 0) {
                break;
            }

            System.out.print("Sexo (M/F): ");
            sexo = entrada.next().charAt(0);

            System.out.print("Salário: R$ ");
            salario = entrada.nextDouble();

            somaSalarios += salario;

            if (menorIdade == -1 || idade < menorIdade) {
                menorIdade = idade;
            }
            if (idade > maiorIdade) {
                maiorIdade = idade;
            }

            if (sexo == 'F' && salario <= 200) {
                mulheresSalarioAte200++;
            }

            if (primeiraIteracao || salario < menorSalario) {
                menorSalario = salario;
                sexoMenorSalario = sexo;
                primeiraIteracao = false;
            }
        }

        if (primeiraIteracao) {
            System.out.println("Nenhum dado foi inserido!");
        } else {
            double mediaSalarios = somaSalarios / (maiorIdade - menorIdade + 1);

            System.out.println("Média dos salários: R$ " + mediaSalarios);
            System.out.println("Maior idade: " + maiorIdade);
            System.out.println("Menor idade: " + menorIdade);
            System.out.println("Quantidade de mulheres com salário até R$ 200,00: " + mulheresSalarioAte200);
            System.out.println("Sexo da pessoa com o menor salário: " + sexoMenorSalario);
        }

        entrada.close();
    }
}

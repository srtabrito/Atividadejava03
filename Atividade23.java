import java.util.Scanner;

public class Atividade23 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int opcao;
        double salario;

        while (true) {
            System.out.println("Menu de opções:");
            System.out.println("1. Novo salário");
            System.out.println("2. Férias");
            System.out.println("3. Décimo terceiro");
            System.out.println("4. Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = entrada.nextInt();

            if (opcao == 4) {
                System.out.println("Programa encerrado.");
                break;
            }

            System.out.print("Digite o salário do funcionário: R$ ");
            salario = entrada.nextDouble();

            switch (opcao) {
                case 1:
                    double novoSalario;
                    if (salario <= 210) {
                        novoSalario = salario * 1.15;
                    } else if (salario <= 600) {
                        novoSalario = salario * 1.10;
                    } else {
                        novoSalario = salario * 1.05;
                    }
                    System.out.println("Novo salário: R$ " + novoSalario);
                    break;
                case 2:
                    double valorFerias = salario + (salario / 3);
                    System.out.println("Valor das férias: R$ " + valorFerias);
                    break;
                case 3:
                    System.out.print("Digite o número de meses de trabalho na empresa (até 12): ");
                    int mesesTrabalho = entrada.nextInt();
                    double decimoTerceiro = (salario * mesesTrabalho) / 12;
                    System.out.println("Valor do décimo terceiro: R$ " + decimoTerceiro);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        entrada.close();
    }
}

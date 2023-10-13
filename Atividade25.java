import java.util.Scanner;

public class Atividade25 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int codigoCliente;
        double totalInvestido = 0;
        double totalJurosPagos = 0;

        while (true) {
            System.out.print("Digite o código do cliente (ou código <= 0 para encerrar): ");
            codigoCliente = entrada.nextInt();

            if (codigoCliente <= 0) {
                break;
            }

            System.out.print("Digite o tipo do investimento (1 - Poupança, 2 - Poupança plus, 3 - Fundos de renda fixa): ");
            int tipoInvestimento = entrada.nextInt();

            if (tipoInvestimento < 1 || tipoInvestimento > 3) {
                System.out.println("Tipo de investimento inválido. Tente novamente.");
                continue;
            }

            System.out.print("Digite o valor investido: R$ ");
            double valorInvestido = entrada.nextDouble();

            double rendimentoMensal;

            if (tipoInvestimento == 1) {
                rendimentoMensal = valorInvestido * 0.015; // 1,5%
            } else if (tipoInvestimento == 2) {
                rendimentoMensal = valorInvestido * 0.02; // 2%
            } else if (tipoInvestimento == 3) {
                rendimentoMensal = valorInvestido * 0.04; // 4%
            } else {
                rendimentoMensal = 0;
            }

            double jurosMensais = rendimentoMensal - valorInvestido;

            totalInvestido += valorInvestido;
            totalJurosPagos += jurosMensais;

            System.out.println("Rendimento mensal: R$ " + rendimentoMensal);
        }

        System.out.println("Total investido: R$ " + totalInvestido);
        System.out.println("Total de juros pagos: R$ " + totalJurosPagos);

        entrada.close();
    }
}

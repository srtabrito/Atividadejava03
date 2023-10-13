import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int totalPessoas = 5;
        int[] idades = new int[totalPessoas];
        double[] alturas = new double[totalPessoas];
        double[] pesos = new double[totalPessoas];

        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Informe a idade da pessoa " + (i + 1) + ":");
            idades[i] = entrada.nextInt();

            System.out.println("Informe a altura (em metros) da pessoa " + (i + 1) + ":");
            alturas[i] = entrada.nextDouble();

            System.out.println("Informe o peso (em kg) da pessoa " + (i + 1) + ":");
            pesos[i] = entrada.nextDouble();
        }

        entrada.close();

        int quantidadePessoasAcima50 = 0;
        double somaAlturasIdade10a20 = 0;
        int quantidadePessoasIdade10a20 = 0;
        int quantidadePessoasPesoMenor40 = 0;

        for (int i = 0; i < totalPessoas; i++) {
            if (idades[i] > 50) {
                quantidadePessoasAcima50++;
            }

            if (idades[i] >= 10 && idades[i] <= 20) {
                somaAlturasIdade10a20 += alturas[i];
                quantidadePessoasIdade10a20++;
            }

            if (pesos[i] < 40) {
                quantidadePessoasPesoMenor40++;
            }
        }

        double mediaAlturasIdade10a20 = somaAlturasIdade10a20 / quantidadePessoasIdade10a20;
        double porcentagemPessoasPesoMenor40 = (quantidadePessoasPesoMenor40 * 100.0) / totalPessoas;

        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + quantidadePessoasAcima50);
        System.out.println("Média das alturas das pessoas com idade entre 10 e 20 anos: " + mediaAlturasIdade10a20 + " metros");
        System.out.println("Porcentagem de pessoas com peso inferior a 40 kg: " + porcentagemPessoasPesoMenor40 + "%");
    }
}





import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
//        Faça um programa que receba dez idades, pesos e alturas, calcule e mostre:
//        ■■ a média das idades das dez pessoas;
//        ■■ a quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 metro; e
//        ■■ a porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de
//        1,90 m.
        var entrada = new Scanner(System.in);
        int somasIdade = 0;
        int quantidadePessoasPeso90Altura150 = 0;
        int quantidadePessoasAlturaMaior190 = 0;
        int quantidadePessoasIdade10a30AlturaMaior190 = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Informe sua Idade: ");
            int idade = entrada.nextInt();

            System.out.println("Informe seu Peso: ");
            double peso = entrada.nextDouble();

            System.out.println("Informe sua Altura: ");
            double altura = entrada.nextDouble();

            somasIdade += idade;


            if (peso > 90 && altura < 1.50) {
                quantidadePessoasPeso90Altura150++;
            }

            if (altura > 1.90) {
                quantidadePessoasAlturaMaior190++;

                if (idade >= 10 && idade <= 30) {
                    quantidadePessoasIdade10a30AlturaMaior190++;
                }
            }
        }
        entrada.close();

        double mediaIdade = somasIdade / 10;
        double porcentagemIdade10a30AlturaMaior190 = 0.0;

        if (quantidadePessoasAlturaMaior190 > 0) {
            porcentagemIdade10a30AlturaMaior190 = (double) quantidadePessoasIdade10a30AlturaMaior190 * 100 / quantidadePessoasAlturaMaior190;
        }

        System.out.println("Média das idades das dez pessoas: " + mediaIdade);
        System.out.println("Quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 m: " + quantidadePessoasPeso90Altura150);
        System.out.println("Porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m: " + porcentagemIdade10a30AlturaMaior190 + "%");
    }
}
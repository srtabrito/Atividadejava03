import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {

        var entrada = new Scanner(System.in);

        int totalPessoas = 6, pessoasAcima50PesoMenos60 = 0, pessoasAlturaMenor150 = 0, pessoasOlhosAzuis = 0, pessoasRuivasSemOlhosAzuis = 0, somaIdadesAlturaMenor150 = 0;

        for (int i = 0; i <= 5  ; i++) {
            System.out.println("Informe sua Idade: ");
            int idade = entrada.nextInt();

            System.out.println("Informe seu Peso: ");
            double peso = entrada.nextDouble();

            System.out.println("Informe sua Altura: ");
            double altura = entrada.nextDouble();

            System.out.println("Informe a cor dos seus olhos (A — azul P — preto V — verde C — castanho): ");
            char corOlhos = entrada.next().charAt(0);

            System.out.println("Informe a cor dos cabelos (P — preto; C — castanho; L — louro; e R — ruivo): ");
            char corCabelos = entrada.next().charAt(0);

            if (idade > 50 && peso < 60) {
                pessoasAcima50PesoMenos60 ++;
            }

            if (altura < 1.50) {
                somaIdadesAlturaMenor150 += idade;
                pessoasAlturaMenor150++;
            }

            if (corOlhos == 'A') {
                pessoasOlhosAzuis++;
            }

            if (corCabelos == 'R' && corOlhos != 'A') {
                pessoasRuivasSemOlhosAzuis++;
            }
            entrada.close();
        }

        double mediaIdadesAlturaMenor150 = 0.0;
        double porcentagemOlhosAzuis = 0.0;

        if (pessoasAlturaMenor150 > 0) {
            mediaIdadesAlturaMenor150 = somaIdadesAlturaMenor150 / pessoasAlturaMenor150;
        }

        if (totalPessoas > 0) {
            porcentagemOlhosAzuis = pessoasOlhosAzuis * 100 / totalPessoas;
        }

        System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg: " +
                pessoasAcima50PesoMenos60);
        System.out.println("Média das idades das pessoas com altura inferior a 1,50 m: " + mediaIdadesAlturaMenor150);
        System.out.println("Porcentagem de pessoas com olhos azuis: " + porcentagemOlhosAzuis + "%");
        System.out.println("Quantidade de pessoas ruivas e que não possuem olhos azuis: " +
                pessoasRuivasSemOlhosAzuis);
    }
}

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int totalAudienciaTotal = 0;
        int audienciaCanal4 = 0;
        int audienciaCanal5 = 0;
        int audienciaCanal7 = 0;
        int audienciaCanal12 = 0;

        System.out.println("Digite o número do canal (4, 5, 7, 12) e o número de pessoas assistindo (ou 0 para encerrar):");

        while (true) {
            System.out.print("Canal (ou 0 para encerrar): ");
            int numeroCanal = entrada.nextInt();

            if (numeroCanal == 0) {
                break;
            }

            System.out.print("Número de pessoas assistindo: ");
            int numeroPessoas = entrada.nextInt();

            totalAudienciaTotal += numeroPessoas;

            switch (numeroCanal) {
                case 4:
                    audienciaCanal4 += numeroPessoas;
                    break;
                case 5:
                    audienciaCanal5 += numeroPessoas;
                    break;
                case 7:
                    audienciaCanal7 += numeroPessoas;
                    break;
                case 12:
                    audienciaCanal12 += numeroPessoas;
                    break;
                default:
                    System.out.println("Canal inválido. Use 4, 5, 7 ou 12.");
            }
        }

        System.out.println("Porcentagem de Audiência de cada canal:");
        System.out.println("Canal 4: " + (audienciaCanal4 * 100.0 / totalAudienciaTotal) + "%");
        System.out.println("Canal 5: " + (audienciaCanal5 * 100.0 / totalAudienciaTotal) + "%");
        System.out.println("Canal 7: " + (audienciaCanal7 * 100.0 / totalAudienciaTotal) + "%");
        System.out.println("Canal 12: " + (audienciaCanal12 * 100.0 / totalAudienciaTotal) + "%");

        entrada.close();
    }
}

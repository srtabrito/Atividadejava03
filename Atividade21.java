import java.util.Scanner;
public class Atividade21 {
    public static void main(String[] args) {
    var entrada = new Scanner(System.in);

    int voto, totalCandidato1 = 0, totalCandidato2 = 0, totalCandidato3 = 0, totalCandidato4 = 0;
    int totalNulos = 0, totalBrancos = 0, totalVotos = 0;

    while (true) {
     System.out.print("Digite o código do voto (ou 0 para encerrar): ");
     voto = entrada.nextInt();

    if (voto == 0) {
        break;
    }

    if (voto >= 1 && voto <= 4) {
        switch (voto) {
            case 1:
                totalCandidato1++;
                break;
            case 2:
                totalCandidato2++;
                break;
            case 3:
                totalCandidato3++;
                break;
            case 4:
                totalCandidato4++;
                break;
        }
    } else if (voto == 5) {
        totalNulos++;
    } else if (voto == 6) {
        totalBrancos++;
    } else {
        System.out.println("Código de voto inválido.");
    }

    totalVotos++;
}

        System.out.println("Total de votos para o Candidato 1: " + totalCandidato1);
        System.out.println("Total de votos para o Candidato 2: " + totalCandidato2);
        System.out.println("Total de votos para o Candidato 3: " + totalCandidato3);
        System.out.println("Total de votos para o Candidato 4: " + totalCandidato4);
        System.out.println("Total de votos nulos: " + totalNulos);
        System.out.println("Total de votos em branco: " + totalBrancos);
        System.out.println("Total de votos: " + totalVotos);

        double porcentagemNulos = (totalNulos * 100.0) / totalVotos;
        double porcentagemBrancos = (totalBrancos * 100.0) / totalVotos;

        System.out.println("Porcentagem de votos nulos: " + porcentagemNulos + "%");
        System.out.println("Porcentagem de votos em branco: " + porcentagemBrancos + "%");

        entrada.close();
    }
}


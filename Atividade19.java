import java.util.Scanner;
public class Atividade19 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        char tipoAcao;
        double precoCompra, precoVenda;
        double lucro, lucroTotal = 0;
        int lucroSuperior1000 = 0, lucroInferior200 = 0;

        while (true) {
            System.out.print("Tipo da ação (ou 'F' para finalizar): ");
            tipoAcao = entrada.next().charAt(0);

            if (tipoAcao == 'F') {
                break;
            }

            System.out.print("Preço de compra: R$ ");
            precoCompra = entrada.nextDouble();
            System.out.print("Preço de venda: R$ ");
            precoVenda = entrada.nextDouble();

            lucro = precoVenda - precoCompra;
            lucroTotal += lucro;

            System.out.println("Lucro da ação: R$ " + lucro);

            if (lucro > 1000) {
                lucroSuperior1000++;
            } else if (lucro < 200) {
                lucroInferior200++;
            }
        }

        System.out.println("Quantidade de ações com lucro superior a R$ 1.000,00: " + lucroSuperior1000);
        System.out.println("Quantidade de ações com lucro inferior a R$ 200,00: " + lucroInferior200);
        System.out.println("Lucro total da empresa: R$ " + lucroTotal);

        entrada.close();
    }
}
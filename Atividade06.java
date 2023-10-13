import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
            var entrada = new Scanner(System.in);

            double totalAVista = 0, totalAPrazo = 0, valorCompra, total;
            char codigo;

            for (int i = 0; i < 15; i++) {
                System.out.print("Informe código: ");
                codigo = entrada.next().charAt(0);

                System.out.print("Informe valor compra: ");
                valorCompra = entrada.nextDouble();

                if (codigo == 'V' || codigo == 'v') {
                    totalAVista = totalAVista + valorCompra;

                } else if (codigo == 'P' || codigo == 'p') {
                    totalAPrazo = totalAPrazo + valorCompra;

                } else {
                    System.out.println("Código inválido!");
                }

            }
            total = totalAPrazo + totalAVista;

            System.out.println(
                    "o valor total das compras à vista: " + totalAVista);
            System.out.println(
                    "o valor total das compras a prazo: " + totalAPrazo);
            System.out.println(
                    "o valor total das compras efetuadas: " + total);
            System.out.println(
                    "o valor total das compras efetuadas: " + totalAPrazo / 3);

            entrada.close();

    }
}
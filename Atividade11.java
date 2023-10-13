import java.util.Scanner;

public class Atividade11 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        double valorCarro = 0, precoFinal2 = 0, valorParcela = 0, juros = 0;

        System.out.print("Informe o valor do carro: R$");
        valorCarro = entrada.nextDouble();

        double precoFinal = valorCarro * 0.80;

        System.out.println("À vista: R$"+precoFinal);
        for (int i = 6; i <= 60; i = i + 6) {
            juros = i/2;
            valorParcela = (valorCarro / i) + (juros/100);
            precoFinal2 = valorCarro + (valorCarro * juros/100);
            System.out.println("Parcelas: "+i+"| Acréscimo: "+juros + "% | Valor da parcela: R$" +valorParcela+"| Preço final: R$"+precoFinal2);
        }
        entrada.close();
    }
}

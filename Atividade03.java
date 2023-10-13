import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        int faixa01 = 0, faixa02 = 0, faixa03 = 0, faixa04 = 0, faixa05 = 0, idade = 0;

        for (int i = 0; i <= 7; i++){
             System.out.print("Informe sua idade: ");
             idade = entrada.nextInt();
            
             if (idade <= 15) {
                faixa01++;
             }else if (idade >= 16 && idade <= 30){
                faixa02++;
             }else if (idade >= 31 && idade <= 45){
                faixa03++;
             }else if (idade >+ 46 && idade <+ 60){
                faixa04++;
             }else{
                faixa05++;
            }
        }
        System.out.println("Quantidade de pessoas por faixa étaria: ");
        System.out.println("Faixa 01: " + faixa01);
        System.out.println("Faixa 02: " + faixa02);
        System.out.println("Faixa 03: " + faixa03);
        System.out.println("Faixa 04: " + faixa04);
        System.out.println("Faixa 05: " + faixa05);
        double porcfx01 = faixa01/0.08;
        double porcfx05 = faixa05/0.08;
        System.out.println("A porcentagem de pessoas na primeira faixa etária com relação ao total de pessoas: " + porcfx01 + "%");
        System.out.println("A porcentagem de pessoas na última faixa etária com relação ao total de pessoas: " + porcfx05 + "%");

        entrada.close();
    }
}

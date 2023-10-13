import java.util.Scanner;
public class Atividade15 {
    public static void main(String[] args) {
    var entrada = new Scanner(System.in);

    char sexo = ' ', resposta = ' ';
    int sim = 0, nao = 0, mulher = 0, homem = 0, homemNao = 0;
    double perHomem = 0;

    for (int i = 0; i < 10; i++) {
        System.out.println("M - Masculino | F - Feminino");
        System.out.println("Informe sexo: ");
        sexo = entrada.next().toUpperCase().charAt(0);
        System.out.println("Sua resposta (S — sim; ou N — não): ");
        resposta = entrada.next().toUpperCase().charAt(0);

        if(resposta == 'S'){
            sim++;
            if (sexo == 'f'){
                mulher++;
            }
        }else if(resposta == 'N'){
            nao++;
            if (sexo == 'm'){
                homemNao++;
            }
        }
        if(sexo == 'm'){
            homem++;
        }

    }

    System.out.println("Número de pessoas que responderam sim: "+ sim);
    System.out.println("Número de pessoas que responderam não: "+ nao);
    System.out.println("Número de mulheres que responderam sim: "+ mulher);
    if (homem == 0) {
        System.out.println("Nenhum homem respondeu a pesquisa!");
    } else {
        perHomem = homemNao/(double)homem * 100;
        System.out.println("Percentagem de homens que responderam não"
                + perHomem);
    }

    entrada.close();
}
}

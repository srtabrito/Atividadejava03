import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite dez números:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = entrada.nextInt();
        }

        int somaPares = 0;
        int somaPrimos = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                somaPares += numero;
            }

            if (isPrimo(numero)) {
                somaPrimos += numero;
            }
        }

        System.out.println("A soma dos números pares é: " + somaPares);
        System.out.println("A soma dos números primos é: " + somaPrimos);

        entrada.close();
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
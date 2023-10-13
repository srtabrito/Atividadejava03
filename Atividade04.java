import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {

        var entrada = new Scanner(System.in);

        int numero;
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " × " + i + " = " + resultado);
        }
        entrada.close();
    }   
}

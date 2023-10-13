public class Atividade02 {
    public static void main(String[] args) {

          double valorIngresso;
          int quantidadeIngresso = 120;

          for (double valor = 5; valor >= 1; valor = valor - 0.50) {
              valorIngresso = valor * quantidadeIngresso - 200;
              System.out.println("Lucro: " + valorIngresso + "\n Quantidade ingresso vendido: " 
              + quantidadeIngresso + "\n Valor ingresso: " + valor);
              quantidadeIngresso = quantidadeIngresso + 26;
          }
    }
}

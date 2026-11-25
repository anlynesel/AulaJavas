import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor total das vendas do funcionário (R$): ");
        double vendas = scanner.nextDouble();

        double percentualComissao;


        if (vendas < 1000.0) {
            percentualComissao = 0.05;
        } else if (vendas <= 5000.0) {
            percentualComissao = 0.10;
        } else {
            percentualComissao = 0.15;
        }

        double valorComissao = vendas * percentualComissao;

        System.out.printf("Taxa de comissão: %.0f%%\n", percentualComissao * 100);
        System.out.printf("Valor da comissão: R$ %.2f\n", valorComissao);

        scanner.close();
    }
}
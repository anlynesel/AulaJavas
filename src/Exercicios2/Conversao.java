package Exercicios2;

import java.util.Scanner;

public class Conversao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em Reais (R$): ");
        double reais = scanner.nextDouble();

        System.out.println("\nMoedas para conversão:");
        System.out.println("1 - Dólar (USD)");
        System.out.println("2 - Euro (EUR)");
        System.out.println("3 - Libra (GBP)");
        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();

        double cotacaoDolar = 5.00;
        double cotacaoEuro = 5.50;
        double cotacaoLibra = 6.40;

        switch (opcao) {
            case 1:
                double valorDolar = reais / cotacaoDolar;
                System.out.printf("R$ %.2f equivalem a $ %.2f (Dólares)\n", reais, valorDolar);
                break;
            case 2:
                double valorEuro = reais / cotacaoEuro;
                System.out.printf("R$ %.2f equivalem a € %.2f (Euros)\n", reais, valorEuro);
                break;
            case 3:
                double valorLibra = reais / cotacaoLibra;
                System.out.printf("R$ %.2f equivalem a £ %.2f (Libras)\n", reais, valorLibra);
                break;
            default:
                System.out.println("Código de moeda inválido!");
                break;
        }

        scanner.close();
    }
}
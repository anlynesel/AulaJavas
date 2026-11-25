package Exercicios5;

import java.util.Scanner;

public class Operação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nOperações disponíveis:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();


        switch (opcao) {
            case 1:
                System.out.printf("Resultado da Soma: %.2f\n", num1 + num2);
                break;
            case 2:
                System.out.printf("Resultado da Subtração: %.2f\n", num1 - num2);
                break;
            case 3:
                System.out.printf("Resultado da Multiplicação: %.2f\n", num1 * num2);
                break;
            case 4:
                if (num2 != 0) {
                    System.out.printf("Resultado da Divisão: %.2f\n", num1 / num2);
                } else {
                    System.out.println("Erro: Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        scanner.close();
    }
}
package Exercicios2;

import java.util.Scanner;

public class AvaliaçãoDesempenho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota de avaliação do funcionário (1 a 5): ");
        int nota = scanner.nextInt();

        switch (nota) {
            case 1:
                System.out.println("Desempenho: Precisa melhorar");
                break;
            case 2:
                System.out.println("Desempenho: Abaixo da média");
                break;
            case 3:
                System.out.println("Desempenho: Média");
                break;
            case 4:
                System.out.println("Desempenho: Acima da média");
                break;
            case 5:
                System.out.println("Desempenho: Excelente");
                break;
            default:
                System.out.println("Nota inválida! Digite um valor inteiro entre 1 e 5.");
                break;
        }

        scanner.close();
    }
}

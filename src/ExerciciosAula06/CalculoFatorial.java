package ExerciciosAula06;
import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        long fatorial = 1;
        int contador = numero;

        if (numero > 0) {
            do {
                fatorial *= contador;
                contador--;
            } while (contador >= 1);
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        scanner.close();
    }
}


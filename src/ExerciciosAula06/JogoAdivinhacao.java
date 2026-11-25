package ExerciciosAula06;
import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int palpite;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número secreto entre 1 e 100!");

        do {
            System.out.print("Seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR.");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é MENOR.");
            }
        } while (palpite != numeroSecreto);

        System.out.println("Parabéns! Você acertou em " + tentativas + " tentativa(s).");
        scanner.close();
    }
}

package ExerciciosAula06;
import java.util.ArrayList;
import java.util.Scanner;

public class VerificacaoNumeros10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        System.out.println("Digite números entre 0 e 100 (digite um número negativo para encerrar):");

        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();


            if (numero > 100) {
                System.out.println("Número muito grande, interrupção realizada");
                break;
            }

            if (numero < 0) {
                break;
            }

            if (numero % 2 == 0) {
                pares.add(numero);
                continue;
            }

            impares.add(numero);
            continue;
        }

        System.out.println("\nNúmeros pares digitados: " + pares);
        System.out.println("Números ímpares digitados: " + impares);
        scanner.close();
    }
}


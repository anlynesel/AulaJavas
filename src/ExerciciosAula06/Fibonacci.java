package ExerciciosAula06;

public class Fibonacci {
    public static void main(String[] args) {
        int anterior = 0;
        int atual = 1;
        int contador = 1;

        System.out.println("Os primeiros 10 números da sequência de Fibonacci:");

        while (contador <= 10) {
            System.out.print(anterior + " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
            contador++;
        }
    }
}

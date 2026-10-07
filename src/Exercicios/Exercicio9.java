package Exercicios;

public class Exercicio9 {
    public static void main(String[] args) {
        float valorFloat = 123.89f;

        long valorLong = (long) valorFloat;

        double valorDouble = valorLong;

        System.out.println("--- Exercício 9 ---");
        System.out.println("Valor Float inicial: " + valorFloat);
        System.out.println("Valor Long (Casting Explícito): " + valorLong);
        System.out.println("Valor Double (Casting Implícito): " + valorDouble);
    }
}

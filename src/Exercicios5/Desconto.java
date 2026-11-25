import java.util.Scanner;


public class Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra (R$): ");
        double valorCompra = scanner.nextDouble();

        double valorFinal;


        if (valorCompra > 100.0) {
            double desconto = valorCompra * 0.10;
            valorFinal = valorCompra - desconto;
            System.out.println("Desconto de 10% aplicado com sucesso!");
        } else {
            valorFinal = valorCompra;
            System.out.println("Sem desconto aplicado (valor igual ou inferior a R$100,00).");
        }

        System.out.printf("Valor final a pagar: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}

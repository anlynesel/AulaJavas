import java.util.Scanner;

public class AcessoSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = scanner.nextInt();


        if (idade >= 18) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado. Idade mínima necessária é 18 anos.");
        }

        scanner.close();
    }
}

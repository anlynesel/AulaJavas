package Exercicios2;

import java.util.Scanner;

public class HorasExtras {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("valor vendas desse mês: R$");
        double valorVenda = sc.nextDouble();

        if (valorVenda <= 1000){
            double comissao = valorVenda * 0.05;
            System.out.println("Comissao: R$ " + comissao);

        }else if (valorVenda >= 5000){
            double comissao = valorVenda * 0.10;
            System.out.println("Comissao: R$ " + comissao);

        }else{
            double comissao = valorVenda * 0.15;
            System.out.println("Comissao: R$ " + comissao);
        }
    }
}

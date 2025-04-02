package com.infnet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // fiz com juros simples pois não foi especificado no enunciado

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco Keppler!!!");
        System.out.println("Vamos simular seu empréstimo!");
        System.out.print("Primeiro, qual é seu nome?\n>  ");
        String nome = scanner.nextLine();
        System.out.printf("Ótimo, %s!%n", nome);
        System.out.print("De quanto você precisa?\n>  ");
        double valorDoEmprestimo = scanner.nextDouble();
        while (valorDoEmprestimo <= 0) {
            System.out.println("O valor não pode ser negativo!");
            System.out.print("De quanto você precisa?\n>  ");
            valorDoEmprestimo = scanner.nextDouble();
        }
        System.out.print("Em quantas parcelas? (min: 6, max: 48)\n>  ");
        int parcelas = scanner.nextInt();
        while (parcelas < 6 || parcelas > 48) {
            System.out.println("A parcela deve ser de 6 à 48!");
            System.out.print("Em quantas parcelas? (min: 6, max: 48)\n>  ");
            parcelas = scanner.nextInt();
        }

        double totalJuro = valorDoEmprestimo * 0.03 * parcelas;
        double totalPago = valorDoEmprestimo + totalJuro;
        double parcelaMensal = totalPago / parcelas;

        System.out.printf("O total pago será de R$%.2f em %d parcelas de R$%.2f.", totalPago, parcelas, parcelaMensal);
    }
}
package com.infnet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual seu nome?\n>  ");
        String nome = scanner.nextLine();
        System.out.println("Vamos calcular seu IR!");
        System.out.print("Digite seu salário!\n>  ");
        double salario = scanner.nextDouble();
        double salarioAnual = salario * 12;
        double imposto;
        double salarioLiquido;

        if (salarioAnual > 45012.61) {
            imposto = salarioAnual * 0.275;
        } else if (salarioAnual >= 33919.81) {
            imposto = salarioAnual * 0.15;
        } else if (salarioAnual >= 22847.77){
            imposto = salarioAnual * 0.075;
        } else {
            imposto = 0;
        }

        salarioLiquido = salarioAnual - imposto;

        System.out.printf("%s, o valor do seu imposto é de R$%.2f e do seu salário R$%.2f", nome, imposto, salarioLiquido);

    }
}
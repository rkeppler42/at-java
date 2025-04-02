package com.infnet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é seu nome?\n>  ");
        String nome = scanner.nextLine();
        System.out.printf("Vamos criar uma senha para você, %s!", nome);
        String senha;
        String caracteresEspeciais = "!@#$%&*()_+=|<>?{}[]~-";
        boolean validPassword = false;

        do {
            System.out.print("Digite sua senha - ela deve ter no mínimo 8 caractéres, uma letra maiúscula, um caractere" +
                    " especial e um número\n>  ");
            senha = scanner.nextLine();
            boolean capitalFlag = false;
            boolean numberFlag = false;
            boolean specialFlag = false;


            for (int i = 0; i < senha.length(); i++) {
                char ch = senha.charAt(i);
                if (Character.isUpperCase(ch)) {
                    capitalFlag = true;
                } else if (caracteresEspeciais.indexOf(ch) != -1) {
                    specialFlag = true;
                } else if (Character.isDigit(ch)) {
                    numberFlag = true;
                }
            }

            if (!capitalFlag) {
                System.out.println("Sua senha deve conter pelo menos 1 letra maiúscula!");
            }

            if (!specialFlag) {
                System.out.println("Sua senha deve conter pelo menos 1 caractere especial!");
            }

            if (!numberFlag) {
                System.out.println("Sua senha deve conter pelo menos 1 número!");
            }

            if (senha.length() < 8) {
                System.out.println("Sua senha deve conter pelo menos 8 caracteres!");
            }

            validPassword = capitalFlag && specialFlag && numberFlag && senha.length() >= 8;
        } while (!validPassword);

        System.out.println("Senha gravada!");

    }
}
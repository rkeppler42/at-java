package com.infnet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindos ao Chat Keppler!");
        System.out.print("Digite o nome do primeiro usuário: ");
        String nomeUsuario1 = scanner.nextLine();
        System.out.print("Digite o nome do segundo usuário: ");
        String nomeUsuario2 = scanner.nextLine();

        String[] mensagens = new String[10];
        String[] usuarios = {nomeUsuario1, nomeUsuario2};

        for (int i = 0; i < mensagens.length; i++) {
            if (i % 2 == 0) {
                System.out.print(usuarios[0] + ", digite sua mensagem: ");
                mensagens[i] = nomeUsuario1 + ": " + scanner.nextLine();
            } else {
                System.out.print(usuarios[1] + ", digite sua mensagem: ");
                mensagens[i] = nomeUsuario2 + ": " + scanner.nextLine();
            }
        }

        System.out.println("===== Histórico de Mensagens =====");
        for (String mensagem : mensagens) {
            System.out.println(mensagem);
        }
        System.out.println("'''");

        System.out.println("Obrigado por utilizarem o sistema! Boa sorte para vocês! \uD83D\uDE80");
    }
}
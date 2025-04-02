package com.infnet;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Vamos registrar as 3 compras.");
        try {
            FileWriter fileWriter = new FileWriter("compras.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 1; i < 4; i++) {
                System.out.println("Vamos cadastrar a compra nº" + i);

                System.out.print("Produto: ");
                String produto = scanner.nextLine();

                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();

                System.out.print("Preço unitário: ");
                double precoUnitario = scanner.nextDouble();
                scanner.nextLine();

                bufferedWriter.write("Produto: " + produto);
                bufferedWriter.newLine();
                bufferedWriter.write("Quantidade: " + quantidade);
                bufferedWriter.newLine();
                bufferedWriter.write("Preço unitário: " + precoUnitario);
                bufferedWriter.newLine();
                bufferedWriter.write("----------------------------");
                bufferedWriter.newLine();

            }

            bufferedWriter.close();
            System.out.println("Compras registradas, pequeno gafanhoto!");

            System.out.println("\n=== Compras Registradas ===");
            FileReader fileReader = new FileReader("compras.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Erro ao manipular arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro na entrada de número: " + e.getMessage());
        }
    }
}
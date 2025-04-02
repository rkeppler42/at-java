package com.infnet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos verificar se o aluno está aprovado.");

        Aluno aluno = new Aluno();
        System.out.println("Qual o nome do aluno?");
        String nome = scanner.nextLine();
        aluno.setNome(nome);
        System.out.println("Qual a matrícula do aluno?");
        String matricula = scanner.nextLine();
        aluno.setMatricula(matricula);
        System.out.println("Qual a primeira nota do aluno?");
        double nota1 = scanner.nextDouble();
        aluno.setNota1(nota1);
        System.out.println("Qual a segunda nota do aluno?");
        double nota2 = scanner.nextDouble();
        aluno.setNota2(nota2);
        System.out.println("Qual a terceira nota do aluno?");
        double nota3 = scanner.nextDouble();
        aluno.setNota3(nota3);
        String situacao = aluno.verificarAprovacao();

        System.out.println("O aluno " + aluno.getNome() + " com matrícula " + aluno.getMatricula() + " está " + situacao + ".");
    }
}

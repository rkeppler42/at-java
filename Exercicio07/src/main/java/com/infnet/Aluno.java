package com.infnet;

import java.util.Scanner;


public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNota1(double nota1) {
        while (nota1 < 0 || nota1 > 10) {
            System.out.println("Nota inválida! Digite novamente!");
            Scanner scanner = new Scanner(System.in);
            nota1 = scanner.nextDouble();
        }
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        while (nota2 < 0 || nota2 > 10) {
            System.out.println("Nota inválida! Digite novamente!");
            Scanner scanner = new Scanner(System.in);
            nota2 = scanner.nextDouble();
        }
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        while (nota3 < 0 || nota3 > 10) {
            System.out.println("Nota inválida! Digite novamente!");
            Scanner scanner = new Scanner(System.in);
            nota3 = scanner.nextDouble();
        }
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String verificarAprovacao() {
        if (calcularMedia() >= 7) {
            return "aprovado";
        } else {
            return "reprovado";
        }
    }
}

package com.infnet;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", 1000);
        Estagiario estagiario = new Estagiario("Maria", 1000);
        System.out.printf("Gerente: %s, Salário: %.2f\n", gerente.getNome(), gerente.getSalarioBase());
        System.out.printf("Estagiário: %s, Salário: %.2f\n", estagiario.getNome(), estagiario.getSalarioBase());
    }
}
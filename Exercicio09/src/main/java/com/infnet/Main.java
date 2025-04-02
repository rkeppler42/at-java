package com.infnet;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Roberto", 1000);

        conta.depositar(500);
        conta.sacar(200);
        conta.exibirSaldo();
        conta.sacar(1900);
        conta.exibirSaldo();
    }
}
package com.infnet;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public ContaBancaria(String titular, double saldo) {
        this.setTitular(titular);
        this.setSaldo(saldo);
    }

    public void depositar(double valor) {
        System.out.println("Tentando depositar R$" + valor);
        if (valor > 0) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Seu saldo atual é de R$" + this.getSaldo());
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void sacar(double valor) {
        System.out.println("Tentando sacar R$" + valor);
        if (valor > 0 && valor <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Seu saldo atual é de R$" + this.getSaldo());
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void exibirSaldo() {
        System.out.println("Seu saldo atual é de R$" + this.getSaldo());
    }


}

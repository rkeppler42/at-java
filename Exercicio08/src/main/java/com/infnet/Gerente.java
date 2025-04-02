package com.infnet;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double getSalarioBase() {
        return super.getSalarioBase() * 1.2;
    }
}

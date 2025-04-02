package com.infnet;

public class Estagiario extends Funcionario{
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double getSalarioBase() {
        return super.getSalarioBase() * 0.9;
    }
}

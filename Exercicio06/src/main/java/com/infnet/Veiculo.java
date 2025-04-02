package com.infnet;

public class Veiculo {
    private String placa;
    private String modelo;
    private int anoDeFabricacao;
    private double quilometragem;

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoDeFabricacao);
        System.out.println("Quilometragem: " + quilometragem);
    }

    public void registrarViagem(double distancia) {
        quilometragem += distancia;
    }
}

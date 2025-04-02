package com.infnet;

public class Main {
    public static void main(String[] args){
        Veiculo veiculo1 = new Veiculo();
        veiculo1.setPlaca("ABC1234");
        veiculo1.setModelo("Fusca");
        veiculo1.setAnoDeFabricacao(1970);
        veiculo1.setQuilometragem(50000);
        veiculo1.exibirDetalhes();
        veiculo1.registrarViagem(100);
        veiculo1.exibirDetalhes();

        Veiculo veiculo2 = new Veiculo();
        veiculo2.setPlaca("XYZ9876");
        veiculo2.setModelo("Brasília");
        veiculo2.setAnoDeFabricacao(1980);
        veiculo2.setQuilometragem(30000);
        veiculo2.exibirDetalhes();
        veiculo2.registrarViagem(200);
        veiculo2.exibirDetalhes();
    }
}

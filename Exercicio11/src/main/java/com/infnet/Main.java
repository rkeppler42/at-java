package com.infnet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Estou sorteando os números!");
        int[] numerosSorteados = new int[6];


        for (int i = 0; i < 6; i++) {

            int numeroSorteado = random.nextInt(60) + 1;
            boolean repetido = false;

            for (int j = 0; j < i; j++) {
                if (numerosSorteados[j] == numeroSorteado) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                i--;
            } else {
                numerosSorteados[i] = numeroSorteado;
            }
        }

        System.out.println("Pronto, meu amigo! agora você vai ter que adivinhar os números sorteados!");


        int[] numerosUsuario = new int[6];
        for (int i = 0; i < 6; i++) {

            System.out.println("Digite um número: ");
            int numeroUsuario = scanner.nextInt();

            boolean repetido = false;
            for (int j = 0; j < i; j++) {
                if (numerosUsuario[j] == numeroUsuario) {
                    repetido = true;
                    break;
                }
            }

            if (repetido) {
                System.out.println("Número repetido, tente novamente!");
                i--;
            } else {
                numerosUsuario[i] = numeroUsuario;
            }
        }

        int acertos = 0;

        List<Integer> numerosAcertados = new ArrayList<> ();

        for (int numeroUsuario : numerosUsuario) {
            for (int numeroSorteado : numerosSorteados) {
                if (numeroUsuario == numeroSorteado) {
                    acertos++;
                    numerosAcertados.add(numeroUsuario);
                }
            }
        }


        System.out.println("Você acertou " + acertos + " números!");
        System.out.println("Os números sorteados foram: ");
        for (int i = 0; i < 6; i++) {
            System.out.println(numerosSorteados[i]);
        }
        System.out.println("Os números que você acertou foram: ");
        for (int i = 0; i < numerosAcertados.size(); i++) {
            System.out.println(numerosAcertados.get(i));
        }

    }
}
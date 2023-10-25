package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar: ");

    int quantidadeAtividades = scanner.nextInt();
    scanner.nextLine();

    String[] nome = new String[quantidadeAtividades];
    double[] peso = new double[quantidadeAtividades];
    double[] nota = new double[quantidadeAtividades];

    int somaPeso = 0;
    double somaNota = 0;

    for (int i = 0; i < quantidadeAtividades; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ": ");
      nome[i] = scanner.nextLine();
      
      System.out.println("Digite o peso da atividade " + (i + 1) + ": ");
      peso[i] = scanner.nextDouble();
      scanner.nextLine();
      
      System.out.println("Digite a nota obtida para " + nome[i] + ": ");
      nota[i] = scanner.nextDouble();
      scanner.nextLine();

      somaPeso += peso[i];

      somaNota += (peso[i] * nota[i]) / 100;
    }

    if (somaPeso != 100) {
      System.out.println("A soma dos pesos é diferente de 100!");
    }

    double mediaDeNotas = somaNota * 100 / somaPeso;

    if (mediaDeNotas >= 85.0) {
      System.out.println(
          "Parabéns! Você alcançou " + mediaDeNotas 
           + "%! E temos o prazer de informar que você obteve aprovação!");
    } else {
      System.out.println(
          "Lamentamos informar que, com base na sua pontuação alcançada neste período, "
            + 
            mediaDeNotas
            + 
            "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    }
    scanner.close();
  }
}
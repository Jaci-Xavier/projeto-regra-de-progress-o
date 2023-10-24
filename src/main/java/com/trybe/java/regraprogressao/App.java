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

    for (int i = 0; i < quantidadeAtividades; i++) {
      System.out.println("Digite o nome da atividade " + (i + 1) + ": ");
      nome[i] = scanner.nextLine();
      System.out.println("Digite o peso da atividade " + (i + 1) + ": ");
      peso[i] = scanner.nextDouble();
      scanner.nextLine();
    }
    scanner.close();
  }
}
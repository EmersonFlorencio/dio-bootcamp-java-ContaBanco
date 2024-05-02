package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Por favor, digite o Nome do Usuário !");
      String nomeDoUsuario = scanner.nextLine();

      System.out.println("Por favor, digite o número da Agência !");
      int numeroAgencia = scanner.nextInt();

      System.out.println("Por favor, digite o número da Conta !");
      String numeroConta = scanner.next();

      System.out.println("Por favor, digite o Saldo !");
      String saldo = scanner.next();
      float saldoFinal = Float.parseFloat(saldo.replace("," , "."));

      scanner.close();

      StringBuilder message = new StringBuilder();

      message.append("Olá ").append(nomeDoUsuario)
          .append(", obrigado por criar uma conta em nosso banco, sua agência é ")
          .append(numeroAgencia).append(", conta ")
          .append(numeroConta).append(" e seu saldo ").append(saldoFinal)
          .append(" já está disponível para saque!.");

      System.out.println(message);
    }
}

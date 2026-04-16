package Exercicio_1;

import java.util.Scanner;
import java.util.ArrayList;

public class MainContas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList <Conta> contas = new ArrayList<>();
        Conta conta;

        System.out.print("Digite o valor a ser sacado: ");
        double valorSaque = input.nextDouble();

        System.out.print("Quantas contas serao criadas: ");
        int quantidade = input.nextInt();

        for(int i = 0; i < quantidade; i++){
            System.out.println("Tipo de Conta:");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            int tipo = input.nextInt();

            if(tipo == 1){
                conta = new ContaCorrente();
            }
            else{
                conta = new ContaPoupanca();
            }
            System.out.print("Numero da Conta: ");
            conta.setNumero(input.nextInt());
            System.out.print("Saldo Inicial: ");
            conta.setSaldo(input.nextDouble());

            contas.add(conta);
        }

        for(int i = 0; i < contas.size(); i++){
            Conta count = contas.get(i);
            count.sacar(valorSaque);

            System.out.println("Numero da Conta: " + count.getNumero());
            System.out.println("Tipo da Conta: " + count.getTipo());
            System.out.println("Saldo Final: " + count.getSaldo());

        }

        input.close();
    }
}

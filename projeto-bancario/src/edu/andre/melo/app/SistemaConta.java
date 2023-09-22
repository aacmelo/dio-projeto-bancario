package edu.andre.melo.app;

import edu.andre.melo.classes.CadastroCliente;
import edu.andre.melo.classes.ContaCorrente;
import edu.andre.melo.classes.ContaPoupanca;

import java.util.Scanner;
public class SistemaConta {
    public static void main(String[] args) {

        CadastroCliente cadastroCliente = new CadastroCliente();
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while(opcao != 13){
            System.out.print("\n");
            System.out.print("=========================Programa Bancário=======================");
            System.out.println("\n");
            System.out.println("1 Cadastrar Cliente");
            System.out.println("2 Cadastrar Conta Corrente");
            System.out.println("3 Cadastrar Conta Poupança");
            System.out.println("4 Consultar Dados do Cliente");
            System.out.println("5 Consultar Conta Corrente do Cliente");
            System.out.println("6 Consultar Conta Poupança do Cliente");
            System.out.println("7 Sacar Conta Corrente");
            System.out.println("8 Sacar Conta Poupança");
            System.out.println("9 Depositar Conta Corrente");
            System.out.println("10 Depositar Conta Poupança");
            System.out.println("11 Saldo Conta Corrente");
            System.out.println("12 Saldo Conta Poupança");
            System.out.println("13 Fim do Programa");
            System.out.print("\n");
            System.out.print("Escolha uma das Opções: ");
            opcao = scanner.nextInt();
            if(opcao != 13){
                switch (opcao) {
                    case 1 -> cadastroCliente.cadastroCliente();
                    case 2 -> contaCorrente.cadastrarContaCorrente();
                    case 3 -> contaPoupanca.cadastrarContaPoupanca();
                    case 4 -> cadastroCliente.consultarCadastroCliente();
                    case 5 -> contaCorrente.consultarContaCorrente();
                    case 6 -> contaPoupanca.consultarContaPoupanca();
                    case 7 -> contaCorrente.sacarContaCorrente();
                    case 8 -> contaPoupanca.sacarContaPoupanca();
                    case 9 -> contaCorrente.depositarContaCorrente();
                    case 10 -> contaPoupanca.depositarContaPoupanca();
                    case 11 -> contaCorrente.consultarSaldoContaCorrente();
                    case 12 -> contaPoupanca.consultarSaldoContaPoupanca();
                    default -> {
                        System.out.print("\n");
                        System.err.print("Opção Invalida do Sistema!");
                        System.out.print("\n");
                    }
                }
            }
        }
    }
}

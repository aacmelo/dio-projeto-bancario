package edu.andre.melo.classes;

import java.util.Objects;
import java.util.Scanner;
public class ContaPoupanca extends Conta{
    String nomeCliente, tipoConta;
    int numeroAgencia = 0, numeroConta = 0, senhaConta = 0;
    double saldo;
    public void cadastrarContaPoupanca(){

        Conta contaPoupanca = new ContaPoupanca();
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n");
        System.out.println("====================Cadastro de Conta Poupança=================");
        System.out.print("\n");
        System.out.print("Digite o Nome do Cliente: ");
        contaPoupanca.setCliente(scanner.nextLine());
        System.out.print("Digite o Tipo da Conta: ");
        contaPoupanca.setTipoConta(scanner.nextLine());
        System.out.print("Digite o Numero da Agencia: ");
        contaPoupanca.setAgencia(scanner.nextInt());
        System.out.print("Digite o Numero da Conta: ");
        contaPoupanca.setConta(scanner.nextInt());
        System.out.print("Senha do Cliente: ");
        contaPoupanca.setSenha(scanner.nextInt());
        System.out.print("Digite o Saldo da Conta: ");
        contaPoupanca.setSaldo(scanner.nextDouble());

        nomeCliente = contaPoupanca.getCliente();
        tipoConta = contaPoupanca.getTipoConta();
        numeroAgencia = contaPoupanca.getAgencia();
        numeroConta = contaPoupanca.getConta();
        senhaConta = contaPoupanca.getSenha();
        saldo = contaPoupanca.getSaldo();
    }
        public void consultarContaPoupanca(){

        Scanner scanner = new Scanner(System.in);
        String clienteNome;

            System.out.print("\n");
            System.out.println("====================Consultar Conta Poupança=================");
            System.out.print("\n");
            System.out.print("Digite o Nome do Cliente: ");
            clienteNome = scanner.nextLine();
            if(!Objects.equals(clienteNome, nomeCliente)){
                System.err.println("Nome do Cliente não cadastrado!");
                System.err.println("Digite o Nome Completo do Cliente!");
                System.out.print("\n");
            }else{
                System.out.println("Nome: "+nomeCliente);
                System.out.println("Conta: "+tipoConta);
                System.out.println("Agencia: "+numeroAgencia);
                System.out.println("Conta: "+numeroConta);
                System.out.println("Saldo: "+saldo);
            }
        }
    public void sacarContaPoupanca() {

        int agencia, conta, senha;
        double valor, saldoConta;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n");
        System.out.println("====================Sacar Conta Poupança=================");
        System.out.print("\n");
        System.out.print("Digite o Numero da Agencia: ");
        agencia = scanner.nextInt();
        System.out.print("Digite o Numero da Conta: ");
        conta = scanner.nextInt();
        System.out.print("Digite a Senha: ");
        senha = scanner.nextInt();
        if (agencia != numeroAgencia) {
            System.err.println("Agencia Não Cadastrada!");
            System.out.print("\n");
        } else if (conta != numeroConta) {
            System.err.println("Conta Não Cadastrada!");
            System.out.print("\n");
        } else if (senha != senhaConta) {
            System.err.println("Senha Incorreta!");
            System.out.print("\n");
        } else {
            System.out.print("Digite o Valor para o Saque: ");
            valor = scanner.nextDouble();
            if (valor > saldo) {
                System.out.println("Saldo da Conta Insuficiente!");
                System.out.print("\n");
            } else if (valor <= 0) {
                System.out.println("Sem Saldo na Conta!");
                System.out.print("\n");
            } else {
                saldoConta = saldo - valor;
                saldo = saldoConta;
            }
        }
    }
    public void depositarContaPoupanca(){

        int agencia, conta, senha;
        double valor, saldoConta;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n");
        System.out.println("====================Depositar Conta Poupança=================");
        System.out.print("\n");
        System.out.print("Digite o Numero da Agencia: ");
        agencia = scanner.nextInt();
        System.out.print("Digite o Numero da Conta: ");
        conta = scanner.nextInt();
        System.out.print("Digite a Senha: ");
        senha = scanner.nextInt();
        if (agencia != numeroAgencia) {
            System.err.println("Agencia Não Cadastrada!");
            System.out.print("\n");
        } else if (conta != numeroConta) {
            System.err.println("Conta Não Cadastrada!");
            System.out.print("\n");
        } else if (senha != senhaConta) {
            System.err.println("Senha Incorreta!");
            System.out.print("\n");
        } else {
            System.out.print("Digite o Valor para do Deposito: ");
            valor = scanner.nextDouble();
            saldoConta = saldo + valor;
            saldo = saldoConta;
        }
    }
    public void consultarSaldoContaPoupanca(){

        int agencia, conta, senha;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n");
        System.out.println("====================Saldo da Conta Poupança=================");
        System.out.print("\n");
        System.out.print("Digite o Numero da Agencia: ");
        agencia = scanner.nextInt();
        System.out.print("Digite o Numero da Conta: ");
        conta = scanner.nextInt();
        System.out.print("Digite a Senha: ");
        senha = scanner.nextInt();
        if(agencia != numeroAgencia){
            System.err.println("Agencia Não Cadastrada!");
            System.out.print("\n");
        }else if(conta != numeroConta){
            System.err.println("Conta Não Cadastrada!");
            System.out.println("\n");
        }else if(senha != senhaConta){
            System.err.println("Senha Incorreta!");
            System.out.println("\n");
        }else{
            System.out.print("\n");
            System.out.println("Seu Saldo Atual é: "+saldo);
        }
    }
}

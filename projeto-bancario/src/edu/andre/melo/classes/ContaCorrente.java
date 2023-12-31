package edu.andre.melo.classes;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;
public class ContaCorrente extends Conta {
    String nomeCliente, tipoConta;
    int numeroAgencia = 0, numeroConta = 0, senhaConta = 0;
    double saldo = 0;
    public void cadastrarContaCorrente() {

        Conta contaCorrente = new ContaCorrente();
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n");
        System.out.println("====================Cadastro de Conta Corrente====================");
        System.out.print("\n");
        System.out.print("Digite o Nome do Cliente: ");
        contaCorrente.setCliente(scanner.nextLine());
        System.out.print("Digite o Tipo de Conta: ");
        contaCorrente.setTipoConta(scanner.nextLine());
        System.out.print("Digite o Numero da Agencia: ");
        contaCorrente.setAgencia(scanner.nextInt());
        System.out.print("Digite o Numero da Conta: ");
        contaCorrente.setConta(scanner.nextInt());
        System.out.print("Senha do Cliente: ");
        contaCorrente.setSenha(scanner.nextInt());

        nomeCliente = contaCorrente.getCliente();
        tipoConta = contaCorrente.getTipoConta();
        numeroAgencia = contaCorrente.getAgencia();
        numeroConta = contaCorrente.getConta();
        senhaConta = contaCorrente.getSenha();
    }
    public void consultarContaCorrente() {

        Scanner scanner = new Scanner(System.in);
        String clienteNome;

        System.out.print("\n");
        System.out.println("====================Consultar Conta Corrente=================");
        System.out.print("\n");
        System.out.print("Digite o Nome do Cliente: ");
        clienteNome = scanner.nextLine();
        if (!Objects.equals(clienteNome, nomeCliente)) {
            System.err.println("Nome do Cliente não cadastrado!");
            System.err.println("Digite o Nome Completo do Cliente e Cadastre a Conta Corrente!");
            System.out.print("\n");
        } else {
            System.out.print("\n");
            System.out.println("Nome: " +nomeCliente);
            System.out.println("Conta: " +tipoConta);
            System.out.println("Numero da Agencia: " +numeroAgencia);
            System.out.println("Numero da Conta: " +numeroConta);
        }
    }
    public void sacarContaCorrente() {

        int agencia, conta, senha;
        double valor, saldoConta;
        ContaCorrente contaCorrente = new ContaCorrente();
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n");
        System.out.println("====================Sacar Conta Corrente=================");
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
                contaCorrente.setSaldo(saldo);
            }
            System.out.print("\n");
            System.out.println("Saque Realizado com Sucesso!");
        }
    }
    public void depositarContaCorrente(){

        int agencia, conta, senha;
        double valor, saldoConta;
        ContaCorrente contaCorrente = new ContaCorrente();
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n");
        System.out.println("====================Depositar Conta Corrente=================");
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
            contaCorrente.setSaldo(saldo);
        }
            System.out.print("\n");
            System.out.println("Deposito Realizado com Sucesso!");
        }
        public void consultarSaldoContaCorrente(){

            int agencia, conta, senha;
            Scanner scanner = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#,000.00");

            System.out.print("\n");
            System.out.println("====================Saldo da Conta Corrente=================");
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
                System.out.println("Seu Saldo Atual é: R$ "+df.format(saldo));
            }
        }
    }


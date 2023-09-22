package edu.andre.melo.classes;

import java.util.Objects;
import java.util.Scanner;
public class CadastroCliente extends Cliente {
    String nomeCliente, numeroRG, numeroCPF, endereco;
    double renda = 0;
    public void cadastroCliente() {

        CadastroCliente cadastroCliente = new CadastroCliente();
        Scanner scanner = new Scanner(System.in);

        System.out.print("\n");
        System.out.println("=======================Cadastro de Cliente=======================");
        System.out.print("\n");
        System.out.print("Digite o Nome do Cliente: ");
        cadastroCliente.setNome(scanner.nextLine());
        System.out.print("Digite o Numero do RG: ");
        cadastroCliente.setNumeroRG(scanner.nextLine());
        System.out.print("Digite o Numero do CPF: ");
        cadastroCliente.setNumeroCPF(scanner.nextLine());
        System.out.print("Digite o Endereço: ");
        cadastroCliente.setEndereco(scanner.nextLine());
        System.out.print("Digite o Valor da Renda Mensal: ");
        cadastroCliente.setRenda(scanner.nextDouble());

        nomeCliente = cadastroCliente.getNome();
        numeroRG = cadastroCliente.getNumeroRG();
        numeroCPF = cadastroCliente.getNumeroCPF();
        endereco = cadastroCliente.getEndereco();
        renda = cadastroCliente.getRenda();
    }
    public void consultarCadastroCliente() {

        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.print("\n");
        System.out.println("====================Consultar Cadastro do Cliente=================");
        System.out.print("\n");
        System.out.print("Digite o nome do Cliente: ");
        nome = scanner.nextLine();
        if (!Objects.equals(nome, nomeCliente)) {
            System.err.println("Nome do Cliente não Cadastrado!");
            System.err.println("Digite o Nome Completo do Cliente!");
            System.out.print("\n");
        } else{
            System.out.println("Nome do Cliente: " +nomeCliente);
            System.out.println("Numero RG: " +numeroRG);
            System.out.println("Numero CPF: " +numeroCPF);
            System.out.println("Endereço: " +endereco);
            System.out.println("Renda Mensal: " +renda);
        }
    }
}

package edu.andre.melo.classes;
public abstract class Conta {
    private String cliente;
    private String tipoConta;
    private int agencia;
    private int conta;
    private int senha;
    private double saldo;
    public Conta(){
    }
    public String getCliente(){
        return cliente;
    }
    public void setCliente(String cliente){
        this.cliente =   cliente;
    }
    public String getTipoConta(){
        return tipoConta;
    }
    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }
    public int getAgencia(){
        return agencia;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public int getConta(){
        return conta;
    }
    public void setConta(int conta){
        this.conta = conta;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
}

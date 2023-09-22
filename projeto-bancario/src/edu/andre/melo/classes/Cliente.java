package edu.andre.melo.classes;
public class Cliente {
    private String nome;
    private String numeroRG;
    private String numeroCPF;
    private String endereco;
    private double renda;
    public Cliente(){
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNumeroRG(){
        return numeroRG;
    }
    public void setNumeroRG(String numeroRG){
        this.numeroRG = numeroRG;
    }
    public String getNumeroCPF(){
        return numeroCPF;
    }
    public void setNumeroCPF(String numeroCPF){
        this.numeroCPF = numeroCPF;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public double getRenda(){
        return renda;
    }
    public void setRenda(double renda){
        this.renda = renda;
    }
}

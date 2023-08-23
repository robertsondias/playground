
package com.example.model;

public class Cliente {
    private String cpf;
    private int anoNascimento;
    private String nome;
    private String cidade;
    private double renda;
    private char sexo;
    private boolean especial;
    
    public Cliente(){
        //System.out.println("Criando sem parâmetro");
        double aleatorio = Math.random();
        if(aleatorio > 0.5)
            especial = true;            
    }

    public Cliente(double renda, char sexo){
        this();
        //System.out.println("Criando com parâmetro");
        setRenda(renda);
        this.sexo = sexo;
    }
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty())
            System.out.println("Nome é obrigatorio:");
        else this.nome = nome.toUpperCase().trim();
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }
    
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'M' || sexo == 'F' || sexo == 'm' || sexo == 'f')
        this.sexo = sexo;
        else System.out.println("Sexo é inválido");
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getRenda(){
        return renda;
    }

    public void setRenda(double renda) {
        if (renda >= 0)
            this.renda = renda;
        else System.out.println("A Renda deve ser maior ou igual que zero");        
    }
    public String toString(){
        return "Cliente: " + nome + " Cidade: " + cidade;
    }
}
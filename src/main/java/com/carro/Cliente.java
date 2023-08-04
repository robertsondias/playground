package com.carro;

public class Cliente {
    private String cpf;
    private String nome;
    private String cidade;
    private double renda;
    private char sexo;
    private int anoNascimento;
    private boolean especial;
        
    public Cliente(){
        System.out.println(" Criando um construtor sem parâmentro: ");
        double aleatorio = Math.random();
        if (aleatorio > 0.5 )
            especial = true;

    }
    public Cliente(double renda, char sexo){
        this();
        System.out.println(" Criando um construtor com parâmentros: ");
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
        if (nome.isBlank())
            System.out.println("O nome é obrigatório");
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
        if (sexo == 'M' || sexo == 'F')
            this.sexo = sexo;
        else System.out.println("Sexo é inválido");
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        if (renda >= 0)
            this.renda = renda;
        else System.out.println("A renda deve ser maior ou igual a zero");
        }
    
}
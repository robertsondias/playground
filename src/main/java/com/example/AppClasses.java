package com.example;

import com.example.model.Cliente;

public class AppClasses {
    public static void main(String[] args) {
        System.out.println("Criando classes: ");
        Cliente cliente = new Cliente();
        cliente.setRenda(-1000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1981);
        cliente.setNome("Robertson Dias");
        cliente.setCpf("99999999999");
        cliente.setCidade("Palmas");

        var vetornome = cliente.getNome().split(" ");
        System.out.println(vetornome[0]);
        System.out.println(vetornome[1]);


        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Cliente é especial: " + cliente.isEspecial());
        System.out.println("Nome Cliente 1: " + cliente.getNome());

        Cliente cliente2 = new Cliente(2000, 'F');
        cliente2.setCidade("PALMAs");
        cliente2.setNome("Asus");
        cliente2.setCpf("99999999999");
        System.out.println();

        if (cliente.getCpf().equals(cliente2.getCpf()))
            System.out.println("Cliente 1 e 2 tem o mesmo CPF");
        else System.out.println("CPF são diferentes");

        if (cliente.getCidade().equalsIgnoreCase(cliente2.getCidade()))
            System.out.println("Cliente 1 e 2 moram mesma cidade");
        else System.out.println("Moram cidades diferentes");
            
        
        System.out.println("Nome Cliente 2: " + cliente2.getNome());
        System.out.println("Renda do cliente 2 é: " + cliente2.getRenda());
        System.out.println("Sexo cliente 2 é: " + cliente2.getSexo());
        System.out.println("Nascimento cliente 2 é: " + cliente2.getAnoNascimento());
        System.out.println("Cliente é especial: " + cliente2.isEspecial());
        
    }
}

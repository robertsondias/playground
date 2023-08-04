package com.carro;

public class AppClasses {
    public static void main(String[] args) {
        System.out.println("Criando classes");
        Cliente cliente = new Cliente();
        cliente.setRenda(1000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1981);
        cliente.setNome("Robertson");
        cliente.setCpf("999999999");
        cliente.setCidade("Igarape");
        System.out.println("Nome:  " + cliente.getNome());
        System.out.println("CPF:  " + cliente.getCpf());
        System.out.println("CIDADE:  " + cliente.getCidade());
        System.out.println("Renda:" + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Cliente é especial? " + cliente.isEspecial());
        
        Cliente cliente2 = new Cliente(2000, 'F');
        cliente2.setNome("Jaqueline Rabelo");
        cliente2.setCpf("979999999");
        cliente2.setCidade("IGARAPE");
        System.out.println();
        
        var vetorNome = cliente2.getNome().split(" ");
        System.out.println(vetorNome[0]);
        System.out.println(vetorNome[1]);
        
        System.out.println("Segundo caracter: " + cliente2.getCpf().charAt(1));
        System.out.println("Segunda letra  nome: " + cliente2.getNome().charAt(1));
        
        if(cliente.getCpf().equals(cliente2.getCpf()))
        System.out.println("O CPF são iguais");
        else System.out.println("Os CPF's são diferentes");
        
        if(cliente.getCidade().equalsIgnoreCase(cliente2.getCidade()))
        System.out.println("As cidades são iguais");
        else System.out.println("Moram em cidades diferentes");

        System.out.println("Nome:  " + cliente2.getNome());
        System.out.println("Renda:  " + cliente2.getRenda());
        System.out.println("CPF:  " + cliente2.getCpf());
        System.out.println("CIDADE:  " + cliente2.getCidade());
        System.out.println("Sexo:  " + cliente2.getSexo());
        System.out.println("Ano Nascimento:  " + cliente2.getAnoNascimento());
        System.out.println("Cliente é especial? " + cliente2.isEspecial());
    }
}

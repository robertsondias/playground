package com.example;

import java.util.Scanner;

import com.example.model.Cliente;

public class AppScanner {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        cliente.setNome (scanner.nextLine());

        System.out.println("Digite seu sexo:");
        String sexo = scanner.nextLine();
        cliente.setSexo(sexo.charAt(0));

        System.out.println("Digite seu CPF: ");
        cliente.setCpf(scanner.nextLine());

        System.out.println("Digite a cidade: ");
        cliente.setCidade(scanner.nextLine());

        System.out.println("Digite a reda: ");
        cliente.setRenda(scanner.nextDouble());

        System.out.println("Digite o ano de nascimento: ");
        cliente.setAnoNascimento(scanner.nextInt());
            
        cliente.setRenda(-1000);
        cliente.setSexo('M');
        cliente.setAnoNascimento(1981);
        cliente.setNome("Robertson Dias");
        cliente.setCpf("99999999999");
        cliente.setCidade("Palmas");

        System.out.println("Nome Cliente: " + cliente.getNome());
        System.out.println("Renda: " + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano de Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Cliente é especial: " + cliente.isEspecial());        

        scanner.close();
    }
}
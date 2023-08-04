package com.carro;

import java.util.Scanner;

public class AppScanner {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        cliente.setNome(scanner.nextLine());

        System.out.println("Digite o CPF: ");
        cliente.setCpf(scanner.nextLine());

        System.out.println("Digite a cidade: ");
        cliente.setCidade(scanner.nextLine());
        
        System.out.println("Digite o Nascimemnto: ");
        cliente.setAnoNascimento(scanner.nextInt());

        scanner.nextLine();
        System.out.println("Digite o sexo: ");
        String sexo = scanner.nextLine();
        cliente.setSexo(sexo.charAt(0));

        System.out.println("Nome:  " + cliente.getNome());
        System.out.println("CPF:  " + cliente.getCpf());
        System.out.println("CIDADE:  " + cliente.getCidade());
        System.out.println("Renda:" + cliente.getRenda());
        System.out.println("Sexo: " + cliente.getSexo());
        System.out.println("Ano Nascimento: " + cliente.getAnoNascimento());
        System.out.println("Cliente é especial? " + cliente.isEspecial());

    scanner.close();
        
    }
}

package com.example;

import com.example.model.Cliente;

public class AppOperadoresRelacionais {
    public static void main(String[] args) {
        var cliente1 = new Cliente();
        cliente1.setAnoNascimento(2003);

        var cliente2 = new Cliente();
        cliente2.setAnoNascimento(2003);

        boolean Cliente1MaisJovem = cliente1.getAnoNascimento() > cliente2.getAnoNascimento();
        boolean Cliente1MaisVelho = cliente1.getAnoNascimento() < cliente2.getAnoNascimento();
        
        if (Cliente1MaisJovem) {
            System.out.println("OS cliente 1 é mais novo que o cliente 2");  
        } 
        else if (Cliente1MaisVelho) {    
            System.out.println("O cliente 1 é mais velho que o 2.");         
        }
        else    
            System.out.println("OS clientes têm a mesma idade.");
    }
}

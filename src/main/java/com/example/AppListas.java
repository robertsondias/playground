package com.example;

import java.util.LinkedList;
import java.util.List;

import com.example.model.Cliente;

public class AppListas {
   public static void main(String[] args) {
     List<Cliente> listaClientes = new LinkedList<>();
    var cliente1 = new Cliente();
    cliente1.setNome("Robertson");
    cliente1.setCidade("BH");

    var cliente2 = new Cliente();
    cliente2.setNome("Jaqueline");
    cliente2.setCidade("Igarape");

    listaClientes.add(cliente1);
    listaClientes.add(cliente2);
    listaClientes.add(cliente1);
    listaClientes.add(cliente2);
    listaClientes.add(cliente1);
    listaClientes.add(cliente2);
    listaClientes.add(cliente1);
    listaClientes.add(cliente2);
    listaClientes.add(cliente1);
    listaClientes.add(cliente2);
    listaClientes.add(cliente2);

    listaClientes.remove(0);
    listaClientes.remove(0);
    listaClientes.remove(0);


    for (Cliente cliente : listaClientes) {
        System.err.println(cliente);
    }
    
   }
}

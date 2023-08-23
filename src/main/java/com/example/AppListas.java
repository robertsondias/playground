package com.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.example.model.Cliente;

public class AppListas {
   public static void main(String[] args) {
    
    List<Cliente> listasClientes = new LinkedList<>();
    var cliente1 = new Cliente();
    cliente1.setNome("Robertson");
    cliente1.setCidade("Belo horizonte");
    
    var cliente2 = new Cliente();
    cliente2.setNome("Jack");
    cliente2.setCidade("Igarapé");
    
    listasClientes.add(cliente1);
    listasClientes.add(cliente1);
    listasClientes.add(cliente2);
    listasClientes.add(cliente2);
    listasClientes.add(cliente2);
    listasClientes.add(cliente1);
    listasClientes.add(cliente1);
    listasClientes.add(cliente1);
    listasClientes.add(cliente1);
    listasClientes.add(cliente1);
    listasClientes.add(cliente1);
    listasClientes.add(cliente1);
    listasClientes.add(cliente2);
    listasClientes.add(cliente2);
    listasClientes.add(cliente2);
    listasClientes.add(cliente2);
    listasClientes.add(cliente2);
    listasClientes.remove(0);
    listasClientes.remove(0);
    listasClientes.remove(0);
    listasClientes.remove(7);

    int i = listasClientes.size() -1;
    listasClientes.remove(i);

    for (var cliente : listasClientes) {
      System.out.println(cliente);
    }
   }
}

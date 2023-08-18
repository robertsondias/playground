package com.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.example.DAO.ConnectionManager;
import com.example.DAO.DAO;
import com.example.DAO.EstadoDAO;
import com.example.DAO.ProdutoDAO;
import com.example.model.Marca;
import com.example.model.Produto;


public class AppBd {
    
    public static void main(String[] args) {
        new AppBd();
    }    

    public AppBd(){
        try(var conn = ConnectionManager.getConnection() ){
            //carregarDriveJDBC(); \\ não é mais nescessário, pois é carregado automaticamente
            var estadoDAO = new EstadoDAO(conn);
            estadoDAO.listar();
            estadoDAO.localizar("TO");
            
            var marca = new Marca();
            marca.setId(2L);
            
            var produto = new Produto();
            produto.setId(206L);
            produto.setMarca(marca);
            produto.setValor(77);
            produto.setNome("Produto de Alteracao");
            
            // inserirProduto(conn, produto);
            var produtoDAO = new ProdutoDAO(conn);
            produtoDAO.alterar(produto);
            produtoDAO.excluir(206L);
            
            var dao = new DAO(conn);
            dao.listar("produto");
        } catch (SQLException e) {
                System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }
    }

    

    

    

    

    /*
    private void carregarDriveJDBC() {
        try {
            Class.forName("org.postgresql.Driver");            
        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível carregar a biblioteca(Classe) para acesso ao banco de dados " + e.getMessage());        
        }
    }
     */
}

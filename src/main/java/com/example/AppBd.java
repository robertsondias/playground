package com.example;

import java.sql.SQLException;

import com.example.dao.ConnectionManager;
import com.example.dao.DAO;
import com.example.dao.EstadoDAO;
import com.example.dao.ProdutoDAO;
import com.example.model.Marca;
import com.example.model.Produto;

public class AppBd {
    public static void main(String[] args) {
        new AppBd();
    }

    public AppBd(){
        try(var conn = ConnectionManager.getConnection()){
            var estadoDAO = new EstadoDAO(conn);
            var listaEstados = estadoDAO.listar();
            for (var estado : listaEstados) {
                System.out.println(estado);
                
            }
            estadoDAO.localizar("PR");
            
            var marca = new Marca();
            marca.setId(1L);
            
            var produto = new Produto();
            produto.setId(213L);
            produto.setMarca(marca);
            produto.setNome(" Produto novo");
            produto.setValor(9000);
            
            var produtoDAO = new ProdutoDAO(conn);
            produtoDAO.alterar(produto);
            produtoDAO.excluir(214L);

            //var dao = new DAO(conn);
            //dao.listar("produto");
        } catch (SQLException e) {
            System.err.println("Nâo foi possível conectar ao banco dados" + e.getMessage());            
        }        

    }        
    
    private void carregarDriveJDBC() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Nao foi possível carregar a biblioteca(classe) para acesso ao banco de dados" + e.getMessage());
        }
    }    
}

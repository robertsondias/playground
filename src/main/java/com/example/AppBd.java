package com.example;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.DAO.ConnectionManager;
import com.example.DAO.DAO;
import com.example.DAO.EstadoDAO;
import com.example.DAO.ProdutoDAO;
import com.example.model.Estado;
import com.example.model.Marca;
import com.example.model.Produto;
import com.example.model.RegiaoGeografica;


public class AppBd {
    
    public static void main(String[] args) {
        new AppBd();
    }    

    public AppBd(){
        try(var conn = ConnectionManager.getConnection() ){
            //carregarDriveJDBC(); \\ não é mais nescessário, pois é carregado automaticamente
            
            

            var regiao = new RegiaoGeografica();
            regiao.setId(5L);
            
            var estado = new Estado();
            estado.setId(28L);
            estado.setRegiao(regiao);
            estado.setNome("New Jersey");
            estado.setUf("NJ");
            estado.setPopulacao(111111);
            estado.setAreakm2(22222); 

            inserirEstado(conn, estado);
            
            
            var estadoDAO = new EstadoDAO(conn);
            //estadoDAO.excluir(26L);
            estadoDAO.listar();
            //estadoDAO.localizar("TO");
            //estadoDAO.alterar(estado);                   
            

            var marca = new Marca();
            marca.setId(2L);
            
            var produto = new Produto();
            produto.setId(204L);
            produto.setMarca(marca);
            produto.setValor(77);
            produto.setNome("Produto de Alteracao");            
            
            
            var produtoDAO = new ProdutoDAO(conn);
            //produtoDAO.alterar(produto);
            //produtoDAO.excluir(206L);
            //produtoDAO.inserir(produto);
            
            var dao = new DAO(conn);
            //dao.listar("produto");

        } catch (SQLException e) {
                System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }
    }

    private void inserirEstado(Connection conn, Estado estado) {
        var sql = "insert into estado (id, nome, uf, regiao_id, area_km2, populacao) values (?, ?, ?, ?, ?,?)";        
        try (var statement = conn.prepareStatement(sql)) {

            statement.setLong(1, estado.getId());
            statement.setString(2, estado.getNome());
            statement.setString(3, estado.getUf());
            statement.setLong(4, estado.getRegiao().getId());
            statement.setInt(5, estado.getAreakm2());
            statement.setInt(6, estado.getPopulacao());
            statement.executeUpdate();
        } catch (SQLException e) {
           System.err.println("Erro ao inserir no bd Estado" + e.getMessage());
        }
    }
}

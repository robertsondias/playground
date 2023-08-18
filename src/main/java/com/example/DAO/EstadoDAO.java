package com.example.DAO;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.model.Estado;

public class EstadoDAO {
    private Connection conn;

    public EstadoDAO(Connection conn) {
        this.conn = conn;
    }

    public void listar() {        
        try {
            var statement = conn.createStatement();
            var result = statement.executeQuery("select * from estado");
            while (result.next()){
                System.out.printf("Id: %d Nome: %s UF: %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf") );
            }
            System.out.println();
        } catch (SQLException e) {
            System.err.println("Impossivel conectar ao banco de dados" + e.getMessage());
        }
    }

    public void localizar(String uf) {
        try {
            // var sql = "select * from estado where uf = '" + uf + "'";  // suscetível a SQL injection
            var sql = "select * from estado where uf = ?";
            var statement = conn.prepareStatement(sql);
            //System.out.println(sql);
            statement.setString(1, uf);
            var result = statement.executeQuery();
            if (result.next()){
                System.out.printf("Id: %d Nome: %s UF %s\n", result.getInt("id"), result.getString("nome"), result.getString("uf"));
            }
        } catch (SQLException e) {
           System.err.println("Erro ao executar consulta SQL" + e.getMessage());
        }
    }

    public void alterar(Estado estado) {
        var sql = "update estado set nome = ?, uf = ?, regiao_id = ?, area_km2 = ?, populacao = ? where id = ?";
        try (var statement = conn.prepareStatement(sql)) {
            statement.setString(1, estado.getNome());
            statement.setString(2, estado.getUf());
            statement.setLong(3, estado.getRegiao().getId());
            statement.setInt(4, estado.getAreakm2());
            statement.setInt(5, estado.getPopulacao());
            statement.setLong(6, estado.getId());
            statement.executeUpdate();          
        } catch (SQLException e) {
            System.out.println("Não é possivel alterar o banco de dados." + e.getMessage());
        }
    }

    public void excluir(long id) {
        var sql = "delete from estado where id = ?";
            try {
                var statement = conn.prepareStatement(sql);
                statement.setLong(1, id);
                statement.executeUpdate();
            } catch (SQLException e) {
                System.err.println("Não foi possível excluir no banco de dados: " + e.getMessage());
            }
    }

    
}

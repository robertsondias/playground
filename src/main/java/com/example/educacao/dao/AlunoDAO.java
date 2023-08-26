package com.example.educacao.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.DAO.DAO;
import com.example.educacao.model.Aluno;

public class AlunoDAO extends DAO{
    public AlunoDAO(Connection conn) {
        super(conn);
    }

    public void inserir(Aluno aluno) {
        try {
            var sql = "insert into aluno (nome) VALUES (?)";
            var statement = conn.prepareStatement(sql);
            statement.setString(1, aluno.getNome());
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void inserirNota(int IdDisciplina, double nota, int matricula){
        if(IdDisciplina <= 0 || IdDisciplina >3)
            throw new IllegalArgumentException("O id da matricula está errado");
        
        try{
            var sql = "update aluno set nota" + IdDisciplina + " = ? where matricula = ?";
            System.out.println(sql);
            var statement = conn.prepareStatement(sql);
            statement.setDouble(1, nota);
            statement.setInt(2, matricula);
            statement.execute();
        
        }catch (SQLException e){
            throw new RuntimeException();
    }
}

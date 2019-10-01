package br.edu.cesmac.JDBC.DAO;

import br.edu.cesmac.JDBC.ConnectionFactory;
import br.edu.cesmac.JDBC.Editoria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EditoriaDao {
    private Connection connection;

    public EditoriaDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Editoria editoria) {
        String sql = "INSERT INTO editoria" +
                " (nome)" +
                " values (?)";
        try {
            PreparedStatement stmt;
            stmt = this.connection.prepareStatement(sql);
            stmt.setString(1, editoria.getNome());
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public List<Editoria> getLista() {
        List<Editoria> editorias = new ArrayList<Editoria>();
        try {
            String sql = "SELECT idEditoria, nome " +
                    " FROM editoria " +
                    " ORDER BY nome";
            PreparedStatement stmt = this.connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Long id = resultado.getLong("idEditoria");
                String nome = resultado.getString("nome");
                Editoria editoria = new Editoria();
                editoria.setId(id);
                editoria.setNome(nome);
                editorias.add(editoria);
            }
            resultado.close();
            stmt.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return editorias;
    }
}
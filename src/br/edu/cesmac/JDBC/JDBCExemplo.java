package br.edu.cesmac.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JDBCExemplo {
    public static void main(String[] args) throws SQLException {
        Connection conexao = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/noticiasSI", "postgres", "post");
        System.out.println("Conectado!");
        conexao.close();
    }
}


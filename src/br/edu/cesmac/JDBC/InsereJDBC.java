package br.edu.cesmac.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.edu.cesmac.JDBC.ConnectionFactory;

public class InsereJDBC {
    public static void main(String[] args) throws SQLException {
        try(Connection con = new ConnectionFactory().getConnection()) {
            String sql = "INSERT INTO editoria" +
                    " (nome)" +
                    " values (?)";
            PreparedStatement stmt;
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "Esportes");
            stmt.execute();
            System.out.println("Gravado!");
            stmt = con.prepareStatement(sql);
            stmt.setString(1, "Economia");
            stmt.execute();
            System.out.println("Gravado!");
        } catch(SQLException e) {
            System.out.println(e);
        }
    }
}

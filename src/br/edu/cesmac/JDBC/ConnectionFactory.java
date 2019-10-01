package br.edu.cesmac.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost/noticiasSI", "postgres",
                    "post");
        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        }
    }

}

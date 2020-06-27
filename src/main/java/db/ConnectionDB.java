package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    public Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "");
            if (connection != null){
                System.out.println("DB Successfully connection");
            }
        }catch (SQLException e){
            System.out.println("DB Failed conection: "+ e.getMessage());
        }
        return connection;
    }
}

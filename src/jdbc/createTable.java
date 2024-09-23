package jdbc;

import java.sql.*;

public class createTable {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_naveen;encrypt=true;trustServerCertificate=true";
        String user = "naveen";
        String password = "naveendeva4";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement =connection.createStatement();
            String sql ="Create table book(id Integer not NULL,Title varchar(255),author varchar(255))";
            System.out.println("Table created");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

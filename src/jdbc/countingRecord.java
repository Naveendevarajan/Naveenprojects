package jdbc;

import java.sql.*;

public class countingRecord {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_naveen;encrypt=true;trustServerCertificate=true";
        String user = "naveen";
        String password = "naveendeva4";
        String countElement ="select count (*) As count from book";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement =connection.createStatement();
            ResultSet resultSet = statement.executeQuery(countElement);
            resultSet.next();
            System.out.println(" Total number of Record "+resultSet.getInt("count"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

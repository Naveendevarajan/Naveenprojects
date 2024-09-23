package jdbc;

import java.sql.*;

public class insertingElements {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_naveen;encrypt=true;trustServerCertificate=true";
        String user = "naveen";
        String password = "naveendeva4";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement =connection.createStatement();
            String insertElement="insert into book values(1,'Lolita','Vladimir Nabokov'),(2,'War and Peace','Leo Tolstoy'),(3,'The Divine Comedy','Dante Alighieri'),(4,'Wings Of Fire','APJ ABDUL KALAM'),(5,'King Lear','William Shakespeare')";
            statement.execute(insertElement);
            System.out.println("Record inserted Successfully ");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

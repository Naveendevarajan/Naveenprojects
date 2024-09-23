package jdbc;

import java.sql.*;

public class retrieveRecords {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_naveen;encrypt=true;trustServerCertificate=true";
        String user = "naveen";
        String password = "naveendeva4";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement =connection.createStatement();
            String query ="select * from book";
            ResultSet resultSet = statement.executeQuery(query);
            System.out.println("ID\tBOOK_NAME\t\tAUTHOR");
            while (resultSet.next()){
                int id  = resultSet.getInt(1);
                String bookName = resultSet.getString(2);
                String author = resultSet.getString(3);
                System.out.println(id+"\t"+bookName+"\t\t"+author);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

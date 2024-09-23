package jdbc;

import java.sql.*;
import java.util.Scanner;

public class retrieveASpecificData {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_naveen;encrypt=true;trustServerCertificate=true";
        String user = "naveen";
        String password = "naveendeva4";
        String query ="select * from book where author = ?";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the author name you wanted to search: ");
        String authorName = sc.nextLine();

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,authorName);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                System.out.println("The Book name is "+resultSet.getString("title"));

            }
        } catch (SQLException e) {
            System.out.println("The Book not found Please try available author"+e);
        }
    }
}

package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updateElements {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_naveen;encrypt=true;trustServerCertificate=true";
        String user = "naveen";
        String password = "naveendeva4";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID of record you wanted to update: ");
        int bookId =scanner.nextInt();
        System.out.print("Enter the Book Name: ");
        String bookName =scanner.next();
        System.out.print("Enter the Book author ");
        String bookAuthor =scanner.next();
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            String updateQuery = "update book set Title=?, author =?  where id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);

            preparedStatement.setString(1, bookName);
            preparedStatement.setString(2,bookAuthor);
            preparedStatement.setInt(3,bookId);
            preparedStatement.executeUpdate();
            System.out.println("Record updated Successfully ");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    }


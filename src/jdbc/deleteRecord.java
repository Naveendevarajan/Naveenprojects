package jdbc;

import java.sql.*;
import java.util.Scanner;

public class deleteRecord {

        public static void main(String[] args) {
            String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_naveen;encrypt=true;trustServerCertificate=true";
            String user = "naveen";
            String password = "naveendeva4";
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the record you wanted to delete");
            int bookId =scanner.nextInt();

            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                String deleteQuery = "delete from book where id = ?";
                PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
                System.out.println("Record Deleted Successfully");


                preparedStatement.setInt(1,bookId);
                preparedStatement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

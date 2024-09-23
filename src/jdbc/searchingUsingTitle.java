package jdbc;

import java.sql.*;
import java.util.Scanner;

public class searchingUsingTitle {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_naveen;encrypt=true;trustServerCertificate=true";
        String user = "naveen";
        String password = "naveendeva4";
        String query ="select * from book where title = ?";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Book Title  you wanted to search: ");
        String title = sc.nextLine();

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1,title);
            ResultSet resultSet = statement.executeQuery();
            System.out.println("ID\tBOOK_NAME\tAUTHOR");
            while (resultSet.next()){
                int id  = resultSet.getInt("id");
                String bookName = resultSet.getString("title");
                String author = resultSet.getString("author");
                System.out.println(id+"\t"+bookName+"\t"+author);

            }
        } catch (SQLException e) {
           e.printStackTrace();
        }
    }
}

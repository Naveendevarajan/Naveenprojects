package JDBCTask2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddingDetails {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://192.168.0.49\\HEALNET;databaseName=interndb_naveen;encrypt=true;trustServerCertificate=true";
        String user = "naveen";
        String password = "naveendeva4";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement =connection.createStatement();
            //String sql ="Create table employee (Employee_ID Integer not NULL,First_Name varchar(255)not NULL,Last_Name varchar(255)not NULL,Middle_Name varchar(255),Date_of_Birth date not NULL,Gender varchar(255)not NULL,Email_Address varchar(255)not NULL,Phone_Number varchar(255)not NULL,House_Address varchar(255)not NULL,Job varchar(255)not NULL,Department varchar(255)not NULL,Manager_ID Integer not NULL, Date_of_Joining date not NULL,Employment_Status varchar(255)not NULL,Salary Integer not NULL,Work_Location varchar(255)not NULL,PAN_Number Integer not NULL,Aadhaar_Number Integer not NULL,Bank_Account_Details varchar(255),Employment_Eligibility_erification varchar(255)not NULL, Background_Check_Status varchar(255)not NULL,Additional_Information varchar(255)not NULL,Emergency_Contact varchar(255)not NULL,Skills varchar(255)not NULL,Educatio varchar(255)not NULL,Certifications varchar(255)not NULL,Performance varchar(255)not NULL)";
            String insertingQuery="insert into employee values (2432,'S','RAJU','shanmugam','2004-08-06','male','rajuShanmugam@gmail.com','56570000928','2/19 ambathur','Intern','BCA',2126,'2024-07-15','Full-time',20000,'Medavakkam',345,2345986,'8765','verified','verified','NotProvided','9893873214','interest in coding','Bca','NOTProvided','PROVIDED')";
            statement.execute(insertingQuery);
            System.out.println("values inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

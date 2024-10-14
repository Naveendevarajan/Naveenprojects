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
            //String createQuery="Create table employee (Employee_ID varchar(255)not NULL,First_Name varchar(255)not NULL,Last_Name varchar(255)not NULL,Middle_Name varchar(255),
            // Date_of_Birth date not NULL,Gender varchar(255)not NULL,Email_Address varchar(255)not NULL,Phone_Number varchar(255)not NULL,House_Address varchar(255)not NULL,Job varchar(255)not NULL,Department varchar(255)not NULL,Manager_ID varchar(255),Date_of_Joining date not NULL,Employment_Status varchar(255),Salary varchar(255),Work_Location varchar(255),PAN_Number varchar(255)not NULL,
            // Aadhaar_Number varchar(255)not NULL,Bank_Account_Details varchar(255)not NULL,Employment_Eligibility_erification varchar(255),Background_Check_Status varchar(255),Emergency_Contact varchar(255)not NULL,Skills varchar(255),Education varchar(255),Certifications varchar(255),Performance varchar(255))";
            String insertingQuery="insert into employee values ('Ci2422','S','RAJU','Shanmugam','2004-08-06','Male','rajushanmugam@gmail.com','9677011150','pudhur ambathur ot chennai','Intern','BCA','C2423','2024-07-15','verified',null,'Full time','9724678918','2357 8986 8734','865656565677','verified','Not verified','658585858755',null,'BCA',null,null)";
            statement.execute(insertingQuery);
            System.out.println("values inserted");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

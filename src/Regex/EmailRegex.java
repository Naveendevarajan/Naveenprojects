package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    void isValidEmail(String eMail){
        String validRegex= "([\\w._]+@\\w+.[A-Z a-z]{2,3})";
        Pattern p = Pattern.compile(validRegex);
        Matcher matcher = p.matcher(eMail);

        if( matcher.matches()){
            System.out.println("valid Email");
        }
        else
            System.out.println("InValid Email");

    }

    public static void main(String[] args) {
        EmailRegex  emailRegex = new EmailRegex();
        System.out.print("Enter E-mail Id: ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        emailRegex.isValidEmail(email);
        System.out.println();

    }

}

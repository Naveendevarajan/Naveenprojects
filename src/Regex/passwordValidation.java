package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordValidation {
    boolean upperCase =false;
    boolean lowerCase =false;
    boolean digit = false;
    boolean specialCharacters=false;

    boolean isValidPassword(String password) {
        int[] occurrence = new int[password.length()];
        String validPassword = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{12,}$";
        Pattern pattern = Pattern.compile(validPassword);
        Matcher matcher = pattern.matcher(password);
        if(password.length()<12){
            System.out.println("Less than 12 characters");
        return false;}
        if(!matcher.matches()){
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i)))
                    digit = true;

                else if (Character.isUpperCase(password.charAt(i)))
                    upperCase =true;
                else if (Character.isLowerCase(password.charAt(i)))
                    lowerCase =true;
                else
                    specialCharacters=true;
            }
        }
        if (!matcher.matches())
        {
            if (!digit)
                System.out.println("No Digit Found: Non-Valid");
            if (!lowerCase)
                System.out.println("No lowercase Found: Non-Valid");
            if (!upperCase)
                System.out.println("No Uppercase Found: Non-Valid");
            if (!specialCharacters)
                System.out.println("No Special Characters Found: Non-Valid");
            return false;
        }
        if (matcher.matches())
            for (int i = 0; i < password.length(); i++) {
                for (int j = 0; j < password.length(); j++) {
                    if (password.charAt(i) == password.charAt(j)) {
                        occurrence[i]++;
                    }
                }
                if (occurrence[i] > 1) {
                    System.out.println("word " + password.charAt(i) + " is repeated Non-Valid");
                    return false;
                }
            }
        System.out.println("Valid");
        return true;
    }
    public static void main(String[] args) {
        passwordValidation passwordValidation = new passwordValidation();
        passwordValidation.isValidPassword("Aa1Aa1AaAaAa#");
    }
}

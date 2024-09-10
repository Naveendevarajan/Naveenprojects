package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phoneNumberValidation {

    String extractPhoneNumbers(String text) {
        String validPhone = "\\(\\+\\d{2}\\)\\s\\d{5}-\\d{5} | \\d{3}-\\d{3}-\\d{4}";
        Pattern pattern = Pattern.compile(validPhone);
        Matcher matcher = pattern.matcher(text);
        String result = "";
        while (matcher.find()) {
            result += matcher.group() + " or ";
        }
        if(!result.isEmpty()) {
            return result+" if you prefer the first occurrence or modify the code to handle multiple numbers.";
        }
        else
            return "NULL";
    }
    public static void main(String[] args) {
        phoneNumberValidation c = new phoneNumberValidation();
        System.out.println(c.extractPhoneNumbers("Call me at (+91) 23456-72890 or at 987-424-4124"));
        System.out.print(c.extractPhoneNumbers("NO Phone number"));


    }

}

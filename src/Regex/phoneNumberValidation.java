package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class phoneNumberValidation {

    String extractPhoneNumbers(String text) {
        String validPhone = "\\(\\+\\d{2}\\)\\s\\d{5}-\\d{5} | \\d{3}-\\d{3}-\\d{4}";
        Pattern pattern = Pattern.compile(validPhone);
        Matcher matcher = pattern.matcher(text);
        StringBuilder result = new StringBuilder();
        while (matcher.find()) {{
            if(!result.isEmpty())
                result.append("or");
        }
            result.append(matcher.group());
        }
        if(!result.isEmpty()) {
            return result.toString();
        }
        else
            return "NULL";
    }
    public static void main(String[] args) {
        phoneNumberValidation c = new phoneNumberValidation();
        System.out.println(c.extractPhoneNumbers("Call me at (+91) 23456-72890 or at 987-424-4124"));

    }

}

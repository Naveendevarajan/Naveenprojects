package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dateFormatting {
    String replaceDates(String text){
        String date ="(\\d{2})/(\\d{2})/(\\d{4})";
        Pattern pattern = Pattern.compile(date);
        Matcher matcher = pattern.matcher(text);
        String replacement="$3-$2-$1";
        return matcher.replaceAll(replacement);

    }

    public static void main(String[] args) {

        dateFormatting dateFormatting = new dateFormatting();
        System.out.println(dateFormatting.replaceDates("The event is scheduled for 12/09/2024 and another one for 25/12/2024"));
    }
}

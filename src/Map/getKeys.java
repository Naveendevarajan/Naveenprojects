package Map;

import java.util.TreeMap;

public class getKeys {
    public static void main(String[] args) {
        TreeMap<String,String> studentDetails = new TreeMap<>();
        studentDetails.put("name","Naveen");
        studentDetails.put("Phone No","7810000928");
        studentDetails.put("email","naveendevarajan4@gmail.com");
        System.out.println(studentDetails.keySet());
    }
}

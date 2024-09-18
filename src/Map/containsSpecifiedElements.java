package Map;

import java.util.HashMap;

public class containsSpecifiedElements {
    public static void main(String[] args) {
        HashMap<String,String> studentDetails = new HashMap<>();
        studentDetails.put("name","Naveen");
        studentDetails.put("Phone No","7810000928");
        studentDetails.put("email","naveendevarajan4@gmail.com");
        System.out.println(studentDetails.containsValue("Naveen"));
    }
}

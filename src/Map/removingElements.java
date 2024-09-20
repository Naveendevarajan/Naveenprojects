package Map;

import java.util.HashMap;

public class removingElements {
    public static void main(String[] args) {
        HashMap<String,String> studentDetails = new HashMap<>();
        studentDetails.put("name","Naveen");
        studentDetails.put("Phone No","7810000928");
        studentDetails.put("email","naveendevarajan4@gmail.com");
        System.out.println("Before removing "+studentDetails);
        studentDetails.clear();
        System.out.println("After removing "+studentDetails);
    }
}

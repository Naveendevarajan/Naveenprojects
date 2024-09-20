package Map;


import java.util.TreeMap;

public class HighestKeyAndLowestKeyValue {
    public static void main(String[] args) {
        TreeMap<String,String> studentDetails = new TreeMap<>();
        studentDetails.put("name","Naveen");
        studentDetails.put("Phone No","7810000928");
        studentDetails.put("email","naveendevarajan4@gmail.com");
        System.out.println("First key :"+studentDetails.firstKey());
        System.out.println("lAST key :"+studentDetails.lastKey());
    }
}

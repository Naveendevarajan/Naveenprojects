package CollectionList;

import java.util.ArrayList;
import java.util.List;


public class Iteration {
    public static void main(String[] args) {
        List <String>myList= new ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        for (String i:myList) {
            System.out.println((i));
        }



    }

}

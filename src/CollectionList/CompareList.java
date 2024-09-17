package CollectionList;

import java.util.ArrayList;
import java.util.List;

public class CompareList {
    public static void main(String[] args) {
        List<String> linkedList1 = new ArrayList<>();
        linkedList1.add("a");
        linkedList1.add("b");
        linkedList1.add("c");
        linkedList1.add("d");
        List<String> linkedList2 = new ArrayList<>();
        linkedList2.add("a");
        linkedList2.add("b");
        linkedList2.add("c");
        linkedList2.add("d");
        System.out.println(linkedList1.equals(linkedList2));



    }

}

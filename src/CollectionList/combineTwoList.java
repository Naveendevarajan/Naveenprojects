package CollectionList;

import java.util.ArrayList;
import java.util.List;

public class combineTwoList {
    public static void main(String[] args) {
        List<String> linkedList1 = new ArrayList<>();
        linkedList1.add("a");
        linkedList1.add("b");
        linkedList1.add("c");
        linkedList1.add("d");
        List<String> linkedList2 = new ArrayList<>();
        linkedList2.add("e");
        linkedList2.add("f");
        linkedList2.add("g");
        linkedList2.add("h");
        List<String> CombinedList = new ArrayList<>();
        CombinedList.addAll(linkedList1);
        CombinedList.addAll(linkedList2);
        System.out.println(CombinedList);
    }
}

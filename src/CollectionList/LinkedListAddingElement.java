package CollectionList;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedListAddingElement {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("j");
        linkedList.add("g");
        linkedList.add("f");
        linkedList.addFirst("c");
        for (String element:linkedList){
            System.out.println(element);
        }
    }


}

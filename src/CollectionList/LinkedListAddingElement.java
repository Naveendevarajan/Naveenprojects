package CollectionList;

import java.util.LinkedList;



public class LinkedListAddingElement {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("j");
        linkedList.add("g");
        linkedList.add("f");
        linkedList.addFirst("c");
        System.out.println(linkedList);
    }


}

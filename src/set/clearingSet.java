package set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class clearingSet {
    public static void main(String[] args) {
        LinkedHashSet<String> mySet = new LinkedHashSet<>();
        mySet.add("apple");
        mySet.add("orange");
        mySet.add("lemon");
        mySet.add("melon");
        System.out.println("Before clearing: "+mySet);
        mySet.clear();
        System.out.println("after clearing: "+mySet);
    }
}

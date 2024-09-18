package set;

import java.util.HashSet;

public class setTOArray {
    public static void main(String[] args) {
        HashSet<String> initialSet = new HashSet<>();
        initialSet.add("apple");
        initialSet.add("orange");
        initialSet.add("lemon");
        initialSet.add("melon");
        String[] setArray = initialSet.toArray(new String[0]);
        for (String element : setArray) {
            System.out.println(element);
        }
    }
}

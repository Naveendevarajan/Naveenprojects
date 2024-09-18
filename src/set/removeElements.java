package set;

import java.util.HashSet;

public class removeElements {
    public static void main(String[] args) {
        HashSet<String> initialSet = new HashSet<>();
        initialSet.add("apple");
        initialSet.add("orange");
        initialSet.add("lemon");
        initialSet.add("melon");
        System.out.println("before removing "+initialSet);
        initialSet.clear();
        System.out.println("after removing "+initialSet);

    }
}

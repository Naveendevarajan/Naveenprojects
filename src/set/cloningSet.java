package set;

import java.util.HashSet;

public class cloningSet {
    public static void main(String[] args) {
        HashSet<String> initialSet = new HashSet<>();
        initialSet.add("apple");
        initialSet.add("orange");
        initialSet.add("lemon");
        initialSet.add("melon");
        System.out.println("initial set "+initialSet);
        HashSet clonedSet = new HashSet<>();
        clonedSet = (HashSet)initialSet.clone();
        System.out.println("cloned set "+clonedSet);

    }
}

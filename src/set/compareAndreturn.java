package set;

import java.util.HashSet;

public class compareAndreturn {
    public static void main(String[] args) {
        HashSet<String> Set1 = new HashSet<>();
        Set1.add("apple");
        Set1.add("orange");
        Set1.add("lemon");
        Set1.add("melon");
        HashSet<String> Set2 = new HashSet<>();
        Set2.add("apple");
        Set2.add("water melon");
        Set2.add("orange");
        Set2.add("grape");
        Set2.add("melon");
       Set1.retainAll(Set2);
        System.out.println(Set1);
    }
}

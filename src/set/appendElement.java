package set;

import java.util.HashSet;
import java.util.Scanner;

public class appendElement {
    public static void main(String[] args) {
        HashSet<Integer> mySet = new HashSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to be added:");
        int input = sc.nextInt();
        if(input>5){
            mySet.add(input);
        }
        else {
            System.out.println("not added");
        }
        System.out.println(mySet);

    }
}

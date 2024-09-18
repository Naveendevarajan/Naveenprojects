package CollectionList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class updatelist {
    public static void main(String[] args) {
        List<String> myList= new ArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the element to be changed from the List: ");
        String Input = sc.nextLine();
        int Index =myList.indexOf(Input);
        System.out.print("Enter to be added:  ");
        String ChangingElement = sc.nextLine();
        myList.set(Index,ChangingElement);
        System.out.println(myList);

    }

}

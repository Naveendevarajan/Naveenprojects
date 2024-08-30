package Task23aug;
import java.util.Scanner;
import java.util.*;

public class NumberGuessingUsingSet {
    public static void main(String[] args) {
        Set<Integer> boxA = new HashSet<>(Arrays.asList(8, 9, 10, 11, 12, 13, 14, 15));
        Set<Integer> boxB = new HashSet<>(Arrays.asList(4, 5, 6, 7, 12, 13, 14, 15));
        Set<Integer> boxC = new HashSet<>(Arrays.asList(2, 3, 6, 7, 10, 11, 14, 15));
        Set<Integer> boxD = new HashSet<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15));
        Set<Integer> numbersLimit = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        Set<Integer> []entireBoxes = new Set[]{boxA,boxB,boxC,boxD};
        System.out.println("Think of a number between 1 and 15.");
        NumberGuessingUsingSet numberGuessingGame = new NumberGuessingUsingSet();
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<entireBoxes.length;i++){
            System.out.print(" Is your number in box "+(char)('A'+i)+"? Yes / No:");
            String response = scanner.nextLine();
            if(response.equalsIgnoreCase("yes"))
                numbersLimit.retainAll(entireBoxes[i]);
            else if(response.equalsIgnoreCase("No"))
                numbersLimit.removeAll(entireBoxes[i]);
            else
                System.out.println(" Give response as only yes OR no");
        }
        if (numbersLimit.size()==1)
            System.out.println(numbersLimit);
        else
            System.out.println(" Guessed Number is not Between 1 to 15");
    }

    }






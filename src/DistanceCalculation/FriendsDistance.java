package DistanceCalculation;
import java.util.Scanner;
public class FriendsDistance {
    public void  distancecalculation( String name1, String name2, int source,int destination){
            System.out.println("The Distance between " + name1 + " and " + name2 + " is : " + ((source - destination) < 0 ? ((source - destination)*-1) : (source - destination)));
    }
    public static void main(String[] args) {
        int source = 0, destination = 0;
        String input2 = "";
        FriendsDistance friendsDistance = new FriendsDistance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input1 & Input2");
        String input1 = scanner.nextLine();
        source = input1.equalsIgnoreCase("a") ? 1
                : input1.equalsIgnoreCase("b") ? 3
                : input1.equalsIgnoreCase("c") ? 5
                : input1.equalsIgnoreCase("d") ? 7
                : input1.equalsIgnoreCase("e") ? 9 : 0;

        if ( source != 0) {
            input2 = scanner.nextLine();
            destination = input2.equalsIgnoreCase("a") ? 1
                    : input2.equalsIgnoreCase("b") ? 3
                    : input2.equalsIgnoreCase("c") ? 5
                    : input2.equalsIgnoreCase("d") ? 7
                    : input2.equalsIgnoreCase("e") ? 9 : 0;
        }
        if ( source != 0 && destination != 0 && !input2.equals(""))
            friendsDistance.distancecalculation(input1.toUpperCase(), input2.toUpperCase(), source,destination);
        else
            System.err.println("Invalid input, Run the program again and enter the valid input between 'A' - 'E'");
    }
}
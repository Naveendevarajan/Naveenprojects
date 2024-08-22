package DistanceCalculation;
import java.util.Scanner;

public class FriendsDistance {
    public void  distancecalculation( String name1, String name2, int source,int destination){
            System.out.println("The Distance between " + name1 + " and " + name2 + " is : " + ((source - destination) < 0 ? ((source - destination)*-1) : (source - destination)));
    }
    public int distancecalculation(int source,int destination ){
        source=0;
        if(source<=destination)
            return destination-source;

        else
            return source-destination;
    }
    public int valuesforsource(String source) {
        int distance = 0;
        switch (source) {
            case "a":
                distance = 1;
                break;
            case "b":
                distance = 3;
                break;
            case "c":
                distance = 5;
                break;
            case "d":
                distance = 7;
                break;
            case "e":
                distance = 9;
                break;
            default:
                System.out.println("Enter valid input for Source between A and E:");
                return distance = 0;
        }
    return  distance;
    }
    public static void main(String[] args) {
        int source = 0, destination = 0;
        String input2 = "";
        FriendsDistance friendsDistance = new FriendsDistance();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input1 & Input2");
        String input1 = scanner.nextLine();
        source=friendsDistance.valuesforsource(input1);

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
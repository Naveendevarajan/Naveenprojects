package Task23aug;

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        int[] boxA = {8, 9, 10, 11, 12, 13, 14, 15};
        int[] boxB = {4, 5, 6, 7, 12, 13, 14, 15};
        int[] boxC = {2, 3, 6, 7, 10, 11, 14, 15};
        int[] boxD = {1, 3, 5, 7, 9, 11, 13, 15};
        System.out.println("Think of a number between 1 and 15.");
        int guessedNumber = 0;
        NumberGuessingGame numberGuessingGame = new NumberGuessingGame();
        guessedNumber += numberGuessingGame.checkBox( "A", boxA, 8);
        guessedNumber += numberGuessingGame.checkBox( "B", boxB, 4);
        guessedNumber += numberGuessingGame.checkBox( "C", boxC, 2);
        guessedNumber += numberGuessingGame.checkBox( "D", boxD, 1);

        System.out.println("The number you were thinking of is: " + guessedNumber);
    }

    public int checkBox( String boxName, int[] boxNumbers, int boxValue) {
        System.out.print("Box " + boxName + " contains: ");
        for (int num : boxNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Is your number in Box " + boxName + "? (Yes/No): ");
        String response = sc.next().trim().toLowerCase();

        if (response.equals("yes")) {
            return boxValue;
        }
        return 0;
    }
}





package Task23aug;

import java.util.Scanner;

public class ArrayOfWords {
    public static void main(String[] args) {
        String[] existingWordsArray = {"apple", "application", "banana", "appreciate", "pineapple"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first two letters of the word: ");
        String firstTwoWords = scanner.nextLine();
        System.out.print("Enter the first last letters of the word: ");
        String lastTwoWords = scanner.nextLine();
        boolean isWordFound=false;
        for (String checkWords : existingWordsArray) {

            if (checkWords.startsWith(firstTwoWords) && checkWords.endsWith(lastTwoWords)) {
                System.out.println("The word is: " + checkWords);
                isWordFound=true;
            }
        }
        if(!isWordFound)
            System.out.println("The given word is not found");
    }
}


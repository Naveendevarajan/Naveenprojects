package Task23aug;

import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] boxA = {8, 9, 10, 11, 12, 13, 14, 15};
        int[] boxB = {4, 5, 6, 7, 12, 13, 14, 15};
        int[] boxC = {2, 3, 6, 7, 10, 11, 14, 15};
        int[] boxD = {1, 3, 5, 7, 9, 11, 13, 15};
        System.out.println("Imagine a Number between 1 to 15");
        System.out.println("Box A");
        for (int i=0;i<8;i++){
            System.out.print(boxA[i]+" ");
        }
        System.out.println("If the number imagined is present in the box print yes else tell no");
        String guessingForBox1=scanner.nextLine();

        System.out.println("Box B");
        for (int i=0;i<8;i++){
            System.out.print(boxB[i]+" ");
        }
        System.out.println("If the number imagined is present in the box print yes else tell no");
        String guessingForBox2=scanner.nextLine();

        System.out.println("Box C");
        for (int i=0;i<8;i++){
            System.out.print(boxC[i]+" ");
        }
        System.out.println("If the number imagined is present in the box print yes else tell no");
        String guessingForBox3=scanner.nextLine();

        System.out.println("Box D");
        for (int i=0;i<8;i++){
            System.out.print(boxD[i]+" ");
        }
        System.out.println("If the number imagined is present in the box print yes else tell no");
        String guessingForBox4=scanner.nextLine();
        if(guessingForBox1.equalsIgnoreCase("yes") && guessingForBox2.equalsIgnoreCase("yes") && guessingForBox3.equalsIgnoreCase("yes") && guessingForBox4.equalsIgnoreCase("yes"))
            System.out.println("15");

    }


}

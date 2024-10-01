package genericstask;

import java.util.Scanner;

public class swapElements<N> {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputArray = {2,3,4,5,6};
        System.out.print("Enter index 1 to swap: ");
        int index1 = scanner.nextInt();
        System.out.print("Enter index 2 to swap:");
        int index2 = scanner.nextInt();
        if(index1>inputArray.length|| index2>inputArray.length)
            System.out.println("Enter Valid index");
        else {
        System.out.println("before swapping");
        for (int j : inputArray) {
            System.out.print(j+" ");
        }
        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
            System.out.println("\nAfter Swapping");
        for ( int i : inputArray){
            System.out.print(i+" ");
        }
    }
    }
}

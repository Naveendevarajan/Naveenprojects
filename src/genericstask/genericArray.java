package genericstask;

import java.util.Scanner;

public class genericArray {
    public <N> void printArray( N[] inputArray){
        for (N element: inputArray)
            System.out.println(element);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        genericArray genericArray = new genericArray();
        System.out.print("Enter Size of Array: ");
        int size = scanner.nextInt();
        Integer [] inputArray = new Integer[size];
        System.out.println("Enter elements");
        for (int i = 0; i < size; i++) {
            inputArray[i] = scanner.nextInt();
        }
        genericArray.printArray(inputArray);

    }
}

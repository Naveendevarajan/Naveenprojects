package genericstask;

import java.util.Scanner;

public class genericsNumbers {
    public <N extends Number> double sum( N input1, N input2){
        return input1.doubleValue()+input2.doubleValue();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        genericsNumbers genericsNumbers = new genericsNumbers();
        System.out.print("Enter 1st Number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter 2nd Number: ");
        int number2 = scanner.nextInt();
        System.out.println(genericsNumbers.sum(number1,number2));


    }
}

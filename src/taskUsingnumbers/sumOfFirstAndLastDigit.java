package taskUsingnumbers;
import java.util.Scanner;
public class sumOfFirstAndLastDigit {
    public int sumFirstAndLastDigit(int number) {
        int firstdigit=number;
            while (firstdigit >=9) {
                firstdigit = firstdigit / 10;
            }
            int lastdigit = number % 10;
            if(number<0) {
                System.out.println("Enter number greater than 0");
            return -1;
        }
        return firstdigit+lastdigit;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int inputNumber=scanner.nextInt();
        sumOfFirstAndLastDigit sumoffirstandlastdigit=new sumOfFirstAndLastDigit();
        System.out.println(sumoffirstandlastdigit.sumFirstAndLastDigit(inputNumber));
    }
}

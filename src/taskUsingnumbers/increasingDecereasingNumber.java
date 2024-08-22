package taskUsingnumbers;
import java.util.Scanner;
public class increasingDecereasingNumber {
    public void checkincreasingOrDecreasing(int number1,int number2,int number3){
        if(number1>number2 &&number2>number3 )
            System.out.println("The given numbers are in Descending order:");
        else if (number1<number2 && number2<number3 )
            System.out.println("The given numbers are in Ascending order:");
        else
            System.out.println("The given numbers are Neither increasing Nor decreasing order:");
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number1 and Number2 and Number3");
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();
        int number3=scanner.nextInt();
        increasingDecereasingNumber increasingdecreasingnumber=new increasingDecereasingNumber();
        increasingdecreasingnumber.checkincreasingOrDecreasing(number1,number2,number3);
    }
}

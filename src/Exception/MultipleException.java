package Exception;
import java.util.Scanner;
import java.util.InputMismatchException;
public class MultipleException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter Input1 & Input2:");
            int input1= sc.nextInt();
            int input2= sc.nextInt();
            int result=input1/input2;
            System.out.println("Output is"+result);
        }
        catch (InputMismatchException a){
            System.err.println("Invalid Input:"+a);
        }
        catch (ArithmeticException e){
            System.err.println("Invalid Input:"+e);
        }
    }
}

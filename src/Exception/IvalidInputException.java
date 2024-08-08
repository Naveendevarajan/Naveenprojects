package Exception;
import java.util.Scanner;
import java.util.InputMismatchException;
public class IvalidInputException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter Input:");
            int input= sc.nextInt();
            System.out.println("The Input is:"+input);
        }
        catch (InputMismatchException a){
            System.err.println("Invalid Input:"+a);

        }
    }
}

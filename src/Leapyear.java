import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args) {
        System.out.println("Enter a year");
        Scanner sc=new Scanner(System.in);
        int year= sc.nextInt();
        if(year%4==0){
            System.out.println(year+" is Leap Year");
        }
        else {
            System.out.println(year+" is not a Leap year");
        }
    }
}

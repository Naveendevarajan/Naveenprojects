import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        System.out.println("Enter mark");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if (mark >500) {
            System.out.println("The maximum mark is 500");
        } else if (mark>=450 && mark<=500){
            System.out.println("grade is A");
        } else if (mark>=400&&mark<450){
            System.out.println("Grade is B");

        } else if (mark>=300) {
            System.out.println("Grade is c");

        }
        else {
            System.out.println("Fail");
        }


    }
    }

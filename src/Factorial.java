import java.util.Scanner;

 class Factorial {
    static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int number= sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial=factorial*i;
        }
        System.out.println("Factorial of"+number+"is:"+factorial);
    }
}

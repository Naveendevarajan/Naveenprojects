package genericstask;

import java.util.Scanner;

public class BoxGenerics<P> {
    private P age;
    public void setAge(P age) {
        this.age = age;
    }
    public P getAge() {
        return age;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String Input: ");
        String stringInput = scanner.nextLine();
        BoxGenerics <String> stringValue = new  BoxGenerics();
        stringValue.setAge(stringInput);
        System.out.print("Enter the Integer Input: ");

        int intInput = scanner.nextInt();
        BoxGenerics <Integer> integerValue = new  BoxGenerics();
        integerValue.setAge(intInput);
        System.out.println("Integer:"+integerValue.getAge());
        System.out.println("String :"+stringValue.getAge());


    }
}

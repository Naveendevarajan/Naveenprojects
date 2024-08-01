import java.util.Scanner;
public class vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input size");
        int inputSize = sc.nextInt();
        String[] input =new String[inputSize];
        for (int i=0;i<inputSize;i++) {
            System.out.println("Enter input "+ (i+1) + ": ");
             input[i]= sc.next().toLowerCase();
        }
        for(int i = 0; i <input.length;i++) {
            int count=0;
            for(int j=0;j< input[i].length();j++){
            if (input[i].charAt(j) == 'a' || input[i].charAt(j) == 'e' || input[i].charAt(j) == 'i' || input[i].charAt(j) == 'o' || input[i].charAt(j) == 'u') {
                count++;
            }

        }
            System.out.println(input[i]+"="+count);
    }
}
}
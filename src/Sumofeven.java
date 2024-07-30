import java.util.Scanner;
public class Sumofeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        int i;
        for(i=1;i<=n;i++){
            if(i%2==0){
                sum=sum+i;
            }

        }
        System.out.println("Sum of even number is:"+sum);
    }
}

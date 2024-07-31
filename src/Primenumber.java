public class Primenumber {
    public static void main (String[] args)
    {
        int number=484;
        for(int i=2;i<number;i++){
            int count=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count<2){
                System.out.println(i);
            }
        }


    }
}

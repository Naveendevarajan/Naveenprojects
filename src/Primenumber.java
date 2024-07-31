public class Primenumber { public static void main (String[] args)
{
    int i =0;
    int j =0;
    String  primeNumbers = "";
    for (i = 1; i <= 484; i++)
    {
        int counter=0;
        for(j =i; j>=1; j--)
        {
            if(i%j==0)
            {
                counter = counter + 1;
            }
        }
        if (counter ==2)
        {
            primeNumbers = primeNumbers + i + " ";
        }
    }
    System.out.println("Prime numbers from 1 to 484 are :");
    System.out.println(primeNumbers);
}
}

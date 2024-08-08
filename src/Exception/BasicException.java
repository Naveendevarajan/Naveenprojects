package Exception;
public class BasicException {
    public static void main(String[] args) {
        int number1=5;
        int number2=0;
        try {
            int result= number1/number2;
            System.out.println(result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Using Zero you can't divide"+e);
        }
    }
}
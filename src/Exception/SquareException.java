package Exception;
public class SquareException {
        static void squareroot(int number) throws IllegalArgumentException{
            if(number<0){
                throw new IllegalArgumentException("The given Number is Negative");
            }
            System.out.println("The square root is"+Math.sqrt(number));
    }


    }

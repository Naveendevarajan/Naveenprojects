package Exception;

import static Exception.TestException.validate;

public class AgeExceptionMain {
    public static void main(String[] args) {
        try {
            validate(121);
        }
        catch (InvalidAgeException e){
            System.out.println("Exception"+e);

        }
    }
}

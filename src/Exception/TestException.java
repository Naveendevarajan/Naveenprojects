package Exception;

public class TestException {
    static void validate(int age) throws InvalidAgeException{
        if(age>=0 && age<120){
            throw new InvalidAgeException("The age is not valid");
        }
        else {
            System.out.println("The Age is valid:"+age);
        }
    }
}

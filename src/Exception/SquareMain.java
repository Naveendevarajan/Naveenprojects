package Exception;
import static Exception.SquareException.squareroot;
public class SquareMain {
    public static void main(String[] args) {
        try
            {
                squareroot(-1);
            }
        catch (IllegalArgumentException e)
        {
            System.out.println("Illegal Argument"+e);
        }
        }
    }


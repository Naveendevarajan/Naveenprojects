package taskUsingnumbers;
import java.util.Date;
public abstract class visa {
    String type;
    String ccv;
    Date expiryDate;
    String aacountHolder;
    String cardNumber;
    double balance=10000;
    protected abstract boolean authenticate(String cardNumber,int pin);
    protected abstract double getbalance();

    public double withdraw(double requestedamount){
        if(balance>=requestedamount){
            balance= balance-requestedamount;
            System.out.println("The  amount requested"+requestedamount);
            System.out.println("The balance amount after withdrawn :"+balance);
            return balance;
        }
        else{
            System.out.println("Not sufficient blance");
            return 0;
        }

    }

}


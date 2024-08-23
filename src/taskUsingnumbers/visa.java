package taskUsingnumbers;
import java.util.Date;
public abstract class visa {
    String type;
    String ccv;
    Date expiryDate;
    String aacountHolder;
    String hdfccardnumber ="HDFC123";
    int hdfcpin=5677;
    String stateBankOfIndiacardnumber="STATEBANK123";
    int stateBankOfIndiapin=4321;
    String unionBankcardnumber="UNIONBANK123";
    int unionBankpin=1234;
    protected abstract boolean authenticate(String cardNumber,int pin);
    protected abstract double getbalance();

    public double withdraw(double requestedamount){
        double balance=getbalance();
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


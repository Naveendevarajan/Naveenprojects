package taskUsingnumbers;

public class HDFC extends visa{
    double balance=10000;
    @Override
    protected boolean authenticate(String cardNumber, int pin) {
        return cardNumber.equals(hdfccardnumber)&&pin==hdfcpin;
    }
    public void withdrawprocess(String cardNumber,int pin,double requestedamount){
        if(authenticate(cardNumber,pin)){
            withdraw(requestedamount);
        }
        else
            System.out.println("Authentication Failed:");
    }
    @Override
    protected double getbalance() {
        return balance;
    }
}

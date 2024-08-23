package taskUsingnumbers;

public class HDFC extends visa{
    String hdfccardnumber ="HDFC123";
    int hdfcpin=5677;
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
        return 0;
    }
}

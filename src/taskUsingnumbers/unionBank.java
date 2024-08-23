package taskUsingnumbers;

public class unionBank extends visa {
    double balance=10000;
    @Override
    protected boolean authenticate(String cardNumber, int pin) {

        return cardNumber.equals(unionBankcardnumber) && pin ==unionBankpin;
    }
    public void withdrawprocess(String cardNumber,int pin,double requestedamount){
        if(authenticate(cardNumber,pin)){
        }
        else
            System.out.println("Authentication Failed:");
    }
    @Override
    protected double getbalance() {
        return balance;

    }
}

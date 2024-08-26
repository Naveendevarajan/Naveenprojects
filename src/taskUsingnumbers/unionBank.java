package taskUsingnumbers;

public class unionBank extends Visa {
    double balance=10000;
    @Override
    protected boolean authenticate(String cardNumber, int pin) {

        return cardNumber.equals(unionBankcardnumber) && pin ==unionBankPin;
    }
    public void withDrawProcess(String cardNumber, int pin, double requestedamount){
        if(authenticate(cardNumber,pin)){
        }
        else
            System.out.println("Authentication Failed:");
    }
    @Override
    protected double getBalance() {
        return balance;

    }
}

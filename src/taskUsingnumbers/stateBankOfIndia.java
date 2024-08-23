package taskUsingnumbers;

public class stateBankOfIndia extends visa{
    String stateBankOfIndiacardnumber="STATEBANK123";
    int stateBankOfIndiapin=4321;
    double balance;

    @Override
    protected boolean authenticate(String cardNumber, int pin) {
        return cardNumber.equals(stateBankOfIndiacardnumber)&&pin==stateBankOfIndiapin;

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

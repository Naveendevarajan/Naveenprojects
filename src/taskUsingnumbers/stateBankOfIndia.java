package taskUsingnumbers;

public class stateBankOfIndia extends Visa {
    double balance=10000;

    @Override
    protected boolean authenticate(String cardNumber, int pin) {
        return cardNumber.equals(stateBankOfIndiacardnumber)&&pin==stateBankOfIndiapin;

    }
    public void withDrawProcess(String cardNumber, int pin, double requestedamount){
        if(authenticate(cardNumber,pin)){
            withdraw(requestedamount);
        }
        else
            System.out.println("Authentication Failed:");
    }
    @Override
    protected double getBalance() {

        return balance;
    }
}

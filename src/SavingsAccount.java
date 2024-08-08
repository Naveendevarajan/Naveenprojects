public class SavingsAccount extends BankAccount {
    double interestrate;

    public SavingsAccount(String accountnumber, double balance) {
        super(accountnumber, balance);
    }

    public void interestrate( double principle, double rate, double years) {
        interestrate = (principle * rate * years) / 100;
        System.out.println("The Interest is:" + interestrate);

    }
}



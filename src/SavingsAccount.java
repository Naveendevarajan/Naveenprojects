public class SavingsAccount extends BankAccount{
    double interestrate;
    public SavingsAccount (String accountnumber, double balance,double principle,double rate,double years){
        super(accountnumber,balance);
        interestrate=(principle*rate*years)/100;
        System.out.println("The Interest is:"+interestrate);

    }

}

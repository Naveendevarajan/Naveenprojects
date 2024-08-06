public class SavingsAccount extends BankAccount{
    double interestrate;
    public void intrestcalculation (double amount,double rate,double years){
        interestrate=(amount*rate*years)/100;
        System.out.println("The Interest is:"+interestrate);

    }
}

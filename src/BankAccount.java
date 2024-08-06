public class BankAccount {
    protected String accountnumber;
    protected double balance=0;
    double amount;
    public double deposite(double amount){
        balance+=amount;
        System.out.println("Balance amount"+balance);
        return amount;
    }
    public void withdraw(double amount){
        if(balance>amount){
            System.out.println("The withdraw amount is"+amount);
            balance=balance-amount;
            System.out.println("The balance is:"+balance);
        }
        else{
            System.out.println("Not sufficient blance");
        }

    }
}

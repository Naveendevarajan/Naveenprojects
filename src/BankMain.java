public class BankMain {
    public static void main(String[] args) {
       SavingsAccount savingsAccount=new SavingsAccount("122334",50000);
       savingsAccount.deposite(10000);
       savingsAccount.withdraw(100);
       savingsAccount.interestrate(5000,4,5);
    }
}

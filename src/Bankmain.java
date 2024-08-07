public class Bankmain  {
    public static void main(String[] args) {
       SavingsAccount savingsAccount=new SavingsAccount("122334",50000,5000,5,4);
       savingsAccount.deposite(10000);
       savingsAccount.withdraw(100);
    }
}

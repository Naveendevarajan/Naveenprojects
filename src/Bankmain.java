public class Bankmain  {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();

        System.out.println(bankAccount.accountnumber="08973487134344");
        bankAccount.deposite(100000);
        bankAccount.withdraw(3000);
        SavingsAccount savingsAccount=new SavingsAccount();
        savingsAccount.intrestcalculation(4000,4.5,5);
    }
}

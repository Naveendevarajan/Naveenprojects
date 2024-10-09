package JDBCTask2;

public class BankDetails {
    String bankName;
    String accountNumber;
    String accountHolderName;
    String branch;

    public BankDetails(String bankName, String branch, String accountHolderName,String accountNumber ) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "\nBank Name:"+bankName+"\nBranch:"+branch+
                "\nAccount Number:"+accountNumber+"\nAccount Holder Name:"+accountHolderName;
    }
}

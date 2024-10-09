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
        return "Bank Name:"+bankName+"Branch:"+branch+
                "Account Number:"+accountNumber+"Account Holder Number:"+accountHolderName;
    }
}

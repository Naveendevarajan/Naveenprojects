package JDBCTask2;

public class Address {
    String addressLine1;
    String addressLine2;
    String pinCode;
    public Address (String addressLine1,String addressLine2, String pinCode){
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return addressLine1+" "+addressLine2+"\npin code: "+pinCode;
    }
}

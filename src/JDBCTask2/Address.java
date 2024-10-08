package JDBCTask2;

public class Address {
    String addressLine1;
    String addressLine2;
    String pinCode;
    String state;
    String city;
    public Address (String addressLine1,String addressLine2,  String state,
    String city,String pinCode){
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return addressLine1+" "+addressLine2+"\nState:"+state+"\ncity:"+city+"\npin code: "+pinCode;
    }
}

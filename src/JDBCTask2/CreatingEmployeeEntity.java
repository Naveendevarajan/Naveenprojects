package JDBCTask2;

public class CreatingEmployeeEntity {

    public String employeeId;
    public String firstName;
    public String lastName;
    public String middleName;
    public String dateOfBirth;
    public String gender;
    public String emailAddress;
    public String phoneNo;
    public Address address;


    public CreatingEmployeeEntity( String employeeId,String firstName,String lastName,
                                   String middleName,String dateOfBirth,String gender,
                                   String emailAddress,String phoneNo,Address address){
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee Id: "+employeeId+"\nFirst Name: "
                +firstName+"\nLast Name: "+lastName+"\nMiddle Name: "+middleName+
                "\nDate Of Birth: "+dateOfBirth+"\nGender: "+gender+"\nEmail Address: " +
                emailAddress+"\nPhone Number: "+phoneNo+"\nAddress: "+address;
    }

    public static void main(String[] args) {
        Address address = new Address("2/19 first cross Street","kanchipuram","631 501");
        CreatingEmployeeEntity creatingEmployeeEntity = new CreatingEmployeeEntity("CI21","D","Naveen"," Devarajan","16-09-2004",
                "Male","Naveendeva4@gamil.com","7810000928",address);
        System.out.println(creatingEmployeeEntity);
    }
}


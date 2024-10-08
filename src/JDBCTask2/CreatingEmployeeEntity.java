package JDBCTask2;

public class CreatingEmployeeEntity {

    public int employeeId;
    public String firstName;
    public String lastName;
    public String middleName;
    public String dateOfBirth;
    public String gender;
    public String emailAddress;
    public String phoneNo;
    public String address;


    public CreatingEmployeeEntity( int employeeId,String firstName,String lastName,
                                   String middleName,String dateOfBirth,String gender,
                                   String emailAddress,String phoneNo,String address){
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
        CreatingEmployeeEntity creatingEmployeeEntity = new CreatingEmployeeEntity(21,"D","Naveen"," Devarajan","16-09-2004",
                "Male","Naveendeva4@gamil.com","7810000928","2/19 First cross St kpm");
        System.out.println(creatingEmployeeEntity);
    }
}


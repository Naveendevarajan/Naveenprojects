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
    public String job;
    public String department;
    public String managerId;
    public String date_of_Joining;
    public String employment_Status;
    public String salary;
    public String work_Location;

    private String pan_Number;
    private String aadhaar_Number;
    private BankDetails bank_Account_Details;
    private String employment_Eligibility_Verification;
    private String background_Check_Status;

    private String emergency_Contact;
    private String skills;
    private String education;
    private String certifications;
    private String performance;


    public CreatingEmployeeEntity(String employeeId, String firstName, String lastName,
                                  String middleName, String dateOfBirth, String gender,
                                  String emailAddress, String phoneNo, Address address,
                                  String job, String department, String managerId, String date_of_Joining,
                                  String employment_Status, String salary, String work_Location, String pan_Number,
                                  String aadhaar_Number, BankDetails bank_Account_Details, String background_Check_Status,
                                  String employment_Eligibility_Verification, String emergency_Contact, String skills, String education,
                                  String certifications, String performance) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.phoneNo = phoneNo;
        this.address = address;
        this.job = job;
        this.department = department;
        this.managerId = managerId;
        this.date_of_Joining = date_of_Joining;
        this.employment_Status = employment_Status;
        this.salary = salary;
        this.work_Location = work_Location;
        this.pan_Number = pan_Number;
        this.aadhaar_Number = aadhaar_Number;
        this.bank_Account_Details = bank_Account_Details;
        this.background_Check_Status = background_Check_Status;
        this.employment_Eligibility_Verification = employment_Eligibility_Verification;
        this.emergency_Contact = emergency_Contact;
        this.skills = skills;
        this.education = education;
        this.certifications = certifications;
        this.performance = performance;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        job = job;
    }

    public String getPan_Number() {
        return pan_Number;
    }

    public void setPan_Number(String pan_Number) {
        this.pan_Number = pan_Number;
    }

    public String getAadhaar_Number() {
        return aadhaar_Number;
    }

    public void setAadhaar_Number(String aadhaar_Number) {
        this.aadhaar_Number = aadhaar_Number;
    }

    public BankDetails getBank_Account_Details() {
        return bank_Account_Details;
    }

    public void setBank_Account_Details(BankDetails bank_Account_Details) {
       this.bank_Account_Details = bank_Account_Details;
    }

    public String getEmployment_Eligibility_Verification() {
        return employment_Eligibility_Verification;
    }

    public void setEmployment_Eligibility_Verification(String employment_Eligibility_Verification) {
        this.employment_Eligibility_Verification = employment_Eligibility_Verification;
    }

    public String getBackground_Check_Status() {
        return background_Check_Status;
    }

    public void setBackground_Check_Status(String background_Check_Status) {
        this.background_Check_Status = background_Check_Status;
    }

    public String getEmergency_Contact() {
        return emergency_Contact;
    }

    public void setEmergency_Contact(String emergency_Contact) {
        this.emergency_Contact = emergency_Contact;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    @Override
    public String toString() {
        return  "\nemployeeId:" + employeeId +
                " \nfirstName:" + firstName +
                " \nlastName:" + lastName +
                " \nmiddleName:" + middleName +
                " \ndateOfBirth:" + dateOfBirth +
                " \ngender:" + gender +
                " \nemailAddress:" + emailAddress +
                " \nphoneNo:" + phoneNo +
                " \naddress:" + address +
                " \njob:" + job +
                " \ndepartment:" + department +
                " \nmanagerId:" + managerId +
                " \ndate_of_Joining:" + date_of_Joining +
                " \nemployment_Status:" + employment_Status +
                " \nsalary:" + salary +
                " \nwork_Location:" + work_Location +
                " \npan_Number:" + pan_Number +
                " \naadhaar_Number:" + aadhaar_Number +
                " \nBANK DETAILS" + bank_Account_Details +
                " \nemployment_Eligibility_Verification:" + employment_Eligibility_Verification +
                " \nbackground_Check_Status:" + background_Check_Status +
                " \nemergency_Contact:" + emergency_Contact +
                " \nskills:" + skills +
                " \neducation:" + education +
                " \ncertifications:" + certifications +
                " \nperformance:" + performance ;
    }


    public static void main(String[] args) {
        Address address = new Address("2/19 first cross Street", "Gurusamy Nagar sevilimedu", "Kanchipuram", "Tamil nadu", "631 501");
        BankDetails bankDetails = new BankDetails("UNION BANK","Kanchipuram","Naveen Devarajan","Union123456");
        CreatingEmployeeEntity creatingEmployeeEntity = new CreatingEmployeeEntity("CI21", "D", "Naveen", " Devarajan", "16-09-2004",
                "Male", "Naveendeva4@gamil.com", "7810000928", address,"Intern","BCA","CI241","JULY 15","Intern","NULL","MEDAVAKKAM","ERT6283YG4","3456 7865 9870",bankDetails,"Verified","Verified","9629987767","Interested In coding","Current pursuing BCA","NUll","Good");
        System.out.println(creatingEmployeeEntity);
    }


    }



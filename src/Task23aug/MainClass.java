package Task23aug;

public class MainClass {
    public static void main(String[] args) {
        Contact contact = new Contact();
        Person person = new Person();
        Company company = new Company();
        Employee employee = new Employee();
        Contact contact1 = new Person();

        System.out.println("\nName:"+person.name+"\nEmailId"+person.name+"\nPhone No"+person.phoneNo+"\n designation0"+employee.designation+"\nSalary"+employee.salary);
        //Person person1=new Contact();
        //  If you could assign a superclass object to a subclass reference,
        //  you would run into problems at runtime when you try to access class members
        //  that don't actually exist.
    }
}

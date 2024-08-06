public class Manger extends Employee {
    public String department;

    public Manger(String name, double salary,String department) {
        super(name, salary);
        this.department=department;
        System.out.print("Name:"+name+"\nSalary:"+salary+"\nDepartment:"+department);
    }


}

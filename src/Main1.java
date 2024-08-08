public class Main1 {
    public static void main(String[] args) {
        Manger manger=new Manger("Naveen",3000.00,"Intern");
        System.out.println("Manager Details");
        System.out.print("Name:"+manger.name+"\nSalary:"+manger.salary+"\nDepartment:"+manger.department);
    }
}

public class Employee {
    public int employeeId;
    public String name;
    public float salary;

    public static void main(String[] args) {
       displayEmployeeDetails();
    }
    public static void displayEmployeeDetails(){
        Employee  john = new Employee();
        john.employeeId = 432;
        john.name = "A.John";
        john.salary = 5.3f;
        System.out.println(john.employeeId);
        System.out.println(john.name);
        System.out.println(john.salary);
    }
}

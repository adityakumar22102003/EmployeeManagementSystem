public class Employee {

    int employeeId;
    String employeeName;
    double salary;
    String department;

    public Employee(int employeeId, String employeeName, double salary, String department) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "John", 45000, "IT");
        emp.displayDetails();
    }
}

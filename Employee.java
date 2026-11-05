public class Employee {

    int employeeId;
    String employeeName;
    double salary;
    String dept;
    String phoneNumber;
    String address;

    public Employee(int employeeId, String employeeName, double salary, String dept, String phoneNumber, String address) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.dept = dept;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("deptpartment: " + dept);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "John", 45000, "IT", "123-456-7890", "123 Main St");
        emp.displayDetails();
    }
}

public class Employee {

    int employeeId;
    String employeeName;
    double salary;
    String dept;
    String phoneNumber;
    String address;
    String email;

    public Employee(int employeeId, String employeeName, double salary, String dept, String phoneNumber, String address,
            String email) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.dept = dept;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);

        System.out.println("Department Name: " + dept);

        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "John", 45000, "IT", "123-456-7890", "123 Main St","abc@you.com");
        emp.displayDetails();
    }
}

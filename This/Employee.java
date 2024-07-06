public class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor with parameters
    public Employee(int id, String name, double salary) {
        this.id = id;           // Distinguishing instance variables from local variables
        this.name = name;
        this.salary = salary;
    }

    // Method to set employee details
    public void setEmployeeDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
    }

    // Method to get the current instance of the class
    public Employee getEmployee() {
        return this;
    }

    public static void main(String[] args) {
        // Creating an employee object
        Employee emp = new Employee(1, "John Doe", 50000);
        emp.displayEmployeeDetails();

        // Setting new employee details using this keyword
        emp.setEmployeeDetails(2, "Jane Smith", 60000);
        emp.displayEmployeeDetails();

        // Returning the current instance using this keyword
        Employee emp2 = emp.getEmployee();
        emp2.displayEmployeeDetails();
    }
}

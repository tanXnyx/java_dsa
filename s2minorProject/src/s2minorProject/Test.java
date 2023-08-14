package DSA_2241004261;
import java.util.Arrays;

public class Test {

    // arrange employees by salary in descending order
    public static void arrangeEmployeeBySalary(Employee[] e) {
        Arrays.sort(e, (emp1, emp2) -> Double.compare(emp2.getSalary(), emp1.getSalary()));
    }

    // display details of managers
    public static void displayManagerDetails(Employee[] e) {
        for (Employee emp : e) {
            if ("Manager".equals(emp.getJobPosition())) {
                System.out.println("Emp ID: " + emp.getEmpId());
                System.out.println("Name: " + emp.getName());
                System.out.println("Salary: " + emp.getSalary());
                System.out.println("Hire Date: " + emp.getHireDate().getDay() + "/"+  emp.getHireDate().getMonth() +"/" + (emp.getHireDate().getYear() + 1900));
                System.out.println("Job Position: " + emp.getJobPosition());
                System.out.println("Contact Number: " + emp.getContactNumber());
                Address address = emp.getAddress();
                if (address != null) {
                    System.out.println("Address: " + address.getStreetName() + ", " + address.getCity() + ", " + address.getState() + " " + address.getZipCode());
                }
                System.out.println("-------------------------------------------------------");
            }
        }
    }

    public static void main(String[] args) {
        // create employee database
        Employee[] employees = new Employee[500];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("E" + i, "Nash SOA " + i, Math.random() * 100000, new Date((int)(Math.random()*(30-1+1)+1), (int)(Math.random()*(12-1+1)+1), 1), "Manager", "383-838-6969", new Address("Shahid Nagar", "Bhubaneswar", "Bbsr", "751030"));
        }

        // arrange employee by salary in descending order
        arrangeEmployeeBySalary(employees);

        // display details of managers
        displayManagerDetails(employees);
    }
}
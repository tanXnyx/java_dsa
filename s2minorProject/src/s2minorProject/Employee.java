package DSA_2241004261;

public class Employee
{
    public String empId;
    public String name;
    public double salary;
    public Date hireDate;
    public String jobPosition;
    public String contactNumber;
    public Address address;

    public Employee(String empId, String name, double salary, Date hireDate, String jobPosition, String contactNumber, Address address)
    {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        this.jobPosition = jobPosition;
        this.contactNumber = contactNumber;
        this.address = address;
    }

   public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
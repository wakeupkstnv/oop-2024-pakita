package lab3.task4;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Comparable<Employee>, Cloneable{
    private double salary;
    private String insuranceNumber;

    private Date hireDate;

    public Employee(String firstName, String lastName, double salary, String insuranceNumber) {
        super(firstName, lastName);
        this.salary = salary;
        this.insuranceNumber = insuranceNumber;
        this.hireDate = new Date();
    }

    public Employee(String firstName, String lastName, double salary, String insuranceNumber, Date hireDate) {
        this(firstName, lastName, salary, insuranceNumber);
        this.hireDate = hireDate;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare   (employee.salary, salary) == 0
                && Objects.equals(hireDate, employee.hireDate)
                && Objects.equals(insuranceNumber, employee.insuranceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, hireDate, insuranceNumber);
    }

    @Override
    public String toString() {
        return super.toString() + "Employee[" +
                "salary=" + salary +
                ", hireDate=" + hireDate +
                ", insuranceNumber='" + insuranceNumber + '\'' +
                ']';
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(getSalary(), o.getSalary());
    }


    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}

package lab3.task4;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

public class Manager extends Employee implements Cloneable{
    public Vector<Employee> team;

    private double bonus;

    {
        team = new Vector<Employee>();
        bonus = 0;
    }

    public Manager(String firstName, String lastName, double salary, String insuranceNumber) {
        super(firstName, lastName, salary, insuranceNumber);
    }

    public Manager(String firstName, String lastName, double salary, String insuranceNumber, Date hireDate) {
        super(firstName, lastName, salary, insuranceNumber, hireDate);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void addBonus(double bonus){
        setBonus(getBonus() + bonus);
    }


    public void addEmployeeToTeam(Employee employee){
        team.add(employee);
    }

    public int compareTo(Manager o) {
        if(super.compareTo((Employee) o) == 0){
            return Double.compare(this.getBonus(), o.getBonus());
        } else return super.compareTo((Employee) o);
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Double.compare(manager.bonus, bonus) == 0 && Objects.equals(team, manager.team);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), team, bonus);
    }

    @Override
    public String toString() {
        return super.toString() + "Manager[" +
                "team=" + team +
                ", bonus=" + bonus +
                ']';
    }

    @Override
    public Manager clone() {
        Manager clone = (Manager) super.clone();
        clone.team = new Vector<>();
        for (Employee employee : this.team) {
            clone.addEmployeeToTeam(employee.clone());
        }
        return clone;
    }
}

package lab3.task4;

import java.util.Comparator;

public class NameEmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.firstName.compareTo(o2.firstName);
    }
}

package lab3.task4;

import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Tamirlan", "Kustanayev", 100, "101");
        manager1.addEmployeeToTeam(new Employee("Ermek", "Samatov", 50000, "67890"));
        manager1.addEmployeeToTeam(new Employee("Wana", "Zhumabek", 45000, "11223"));
        Manager manager2 = manager1.clone();
        manager2.team.get(0).firstName = "Changed Name";

        System.out.println(manager1.team.get(0).firstName);
        System.out.println(manager2.team.get(0).firstName);

        Collections.sort(manager1.team);
        System.out.println(manager1.team);

        Collections.sort(manager1.team, new NameEmployeeComparator());
        System.out.println(manager1.team);

        Collections.sort(manager1.team, new DateEmployeeComparator());
        System.out.println(manager1.team);

    }
}

package lab2.task5;

import lab2.task5.animal.Cat;
import lab2.task5.animal.Dog;
import lab2.task5.person.Employee;
import lab2.task5.person.Grading;
import lab2.task5.person.PhDStudent;

public class Test {
    public static void main(String[] args) {
        PhDStudent phDStudent = new PhDStudent("Idontknow", 100, 1);
        Employee employee = new Employee("AlsoIdontKnow", 50, Grading.JUNIOR);
        Dog dog = new Dog("Bobik", 4);
        Cat cat = new Cat("Murka", 5);

        phDStudent.assignPet(cat);
        employee.assignPet(dog);
        phDStudent.leavePetWith(cat, employee);
        phDStudent.retrievePetFrom(cat, employee);
        employee.leavePetWith(dog, phDStudent);
        employee.retrievePetFrom(dog, phDStudent);
        PersonRegistry.addPerson(phDStudent);
        PersonRegistry.addPerson(employee);
        PersonRegistry.print();

    }
}

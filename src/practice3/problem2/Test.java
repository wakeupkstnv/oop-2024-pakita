package practice3.problem2;

import java.util.Scanner;
import java.util.Vector;

public class Test {

    public static void main(String[] args) {
        String command = "";
        Scanner in = new Scanner(System.in);
        Vector<Person> allUsers = new Vector<Person>();

        while (!command.equals("/quit")) {
            System.out.println("/add - to add person, /check - to check all of list of people, /quit - quit");
            command = in.next();

            if (command.equals("/add")) {
                String typeOfPerson = "";
                System.out.println("Please select type of person: /person, /student, /employee");
                typeOfPerson = in.next();

                if (typeOfPerson.equals("/person")) {
                    System.out.println("Name: ");
                    String name = in.next();

                    System.out.println("Address: ");
                    String address = in.next();

                    Person person = new Person(name, address);
                    System.out.println("Person is created!");

                    allUsers.add(person);
                }

                if (typeOfPerson.equals("/student")) {
                    System.out.println("Name: ");
                    String name = in.next();

                    System.out.println("Address: ");
                    String address = in.next();

                    System.out.println("Program: ");
                    String program = in.next();

                    System.out.println("Year: ");
                    int year = in.nextInt();

                    System.out.println("Fee: ");
                    double fee = in.nextDouble();

                    Student student = new Student(name, address, program, year, fee);
                    System.out.println("Student is created!");

                    allUsers.add(student);
                }

                if (typeOfPerson.equals("/employee")) {
                    System.out.println("Name: ");
                    String name = in.next();

                    System.out.println("Address: ");
                    String address = in.next();

                    System.out.println("School: ");
                    String school = in.next();

                    System.out.println("Pay: ");
                    double pay = in.nextDouble();

                    Staff staff = new Staff(name, address, school, pay);
                    System.out.println("Staff is created!");

                    allUsers.add(staff);
                }
            }

            else if (command.equals("/check")) {
                for (Person user : allUsers) {
                    System.out.println(user.toString());
                }
            }

            else {
                System.out.println("Typing error");
            }

        }
    }
}

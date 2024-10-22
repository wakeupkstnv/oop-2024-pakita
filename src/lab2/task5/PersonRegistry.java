package lab2.task5;

import lab2.task5.person.Person;

import java.util.Vector;

public class PersonRegistry {
    static Vector<Person> personVector = new Vector<Person>();

    private PersonRegistry(){};

    static void addPerson(Person person){
        personVector.add(person);
    }

    static void removePerson(Person person){
        personVector.remove(person);
    }

    static void print(){
        for (Person person: personVector){
            System.out.println(person.toString() + '\n');
        }
    }

}

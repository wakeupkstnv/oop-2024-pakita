package lab3.task2;

import java.util.Objects;

public class Person implements Comparable<Person>, Movable {
    public String name;
    private int age;

    public Position position;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
        position = new Position(0, 0);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    @Override
    public void move() {
        position.changeCoordinate(1, 0);
    }

    @Override
    public int getPosition() {
        return position.getX();
    }

    public int getPostition(){
        return position.getX();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, this.getAge());
    }

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }
}

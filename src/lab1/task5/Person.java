package lab1.task5;

public class Person {
    public Gender gender;

    public Person(Gender gender){
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "" + this.gender;
    }
}

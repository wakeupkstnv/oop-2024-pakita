package PRACTICE_1;

public class Student {
    static int studentCount;
    int id, yearOfStudy;
    String name;

    Student(){
        id = studentCount++;
    }

    Student(String name, int yearOfStudy){
        this();
        this.name = name;
        this.yearOfStudy = yearOfStudy;
    }

    public final String getName() {
        return this.name;
    }

    public final int getId(){
        return this.id;
    }

    public final void increaseYearOfStudy(){
        this.yearOfStudy++;
    }

    public String toString() {
        return this.id + " " + name + " " + yearOfStudy;
    }
}

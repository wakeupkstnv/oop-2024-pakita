package practice2.student;

public class Student {
    static int studentCount;
    int id, yearOfStudy;
    String name;

    public Student(){
        id = studentCount++;
    }

    public Student(String name, int yearOfStudy){
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
        return "id: " + this.id + " name: " + name + " year of study: " + yearOfStudy;
    }
}

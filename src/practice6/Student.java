package practice6;

import java.util.Objects;

public class Student extends Person implements CanHaveRetake{
    private double gpa;
    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return gpa == student.gpa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gpa);
    }

    @Override
    public String toString() {
        return "Student[" +
                "gpa=" + gpa +
                ']';
    }
}

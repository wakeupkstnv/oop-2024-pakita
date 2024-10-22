package lab2.task5.person;

public class Student extends Person {
    private Degree degree;

    public Student(){}

    public Student(String name, int age, Degree degree){
        super(name, age);
        this.degree = degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public Degree getDegree() {
        return degree;
    }

    @Override
    public String getOccupation() {
        return getDegree() + " Student";
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Student s = (Student) obj;
        return s.degree == this.degree;
    }

    @Override
    public String toString() {
        return super.toString() + "[Student[" +
                "degree=" + degree +
                "]]";
    }
}

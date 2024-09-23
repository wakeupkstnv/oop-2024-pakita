package lab1.task4;

import practice2.student.Student;

public class GradeBookTest {
    public static void main(String[] args) {
        Course algo = new Course("ADS", "Algo", 3);
        Course db = new Course("DB", "DataBase", 3);
        Course oop = new Course("OOP", "Object Oriented Prog", 3, algo, db);
        GradeBook gb1 = new GradeBook(oop);

        Student s1 = new Student("Tamir", 2);
        Student s2 = new Student("Ernur", 2);
        gb1.addStudent(s1);
        gb1.addStudent(s2);

        gb1.displayMessage();
        gb1.toGrade();
        gb1.displayGradeReport();

    }
}

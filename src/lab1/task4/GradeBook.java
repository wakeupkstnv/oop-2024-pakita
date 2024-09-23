package lab1.task4;

import practice2.student.Student;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class GradeBook {
    private Course course;
    Map<Student, Double> gradeList = new HashMap<>();
    Map<String, Integer> distribution = new HashMap<>();

    {
        for (int i = 0; i < 100; i += 10) {
            distribution.put(i + "-" + (i + 9), 0);
        }
        distribution.put("100", 0);
    }
    public GradeBook(Course course){
        this.course = course;
    }

    void addStudent(Student student){
        gradeList.put(student, 0.0);
    }

    void addGrade(Student student, double grade){
        gradeList.put(student, grade);

        String range = getRange(grade);
        distribution.put(range, distribution.get(range) + 1);
    }

    String getRange(double grade) {
        if (grade == 100) {
            return "100";
        }
        int rangeStart = (int) grade / 10 * 10;
        return rangeStart + "-" + (rangeStart + 9);
    }

    public final void displayMessage(){
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    private String outputBarChart(){
        String res = "";

        for (int i = 0; i < 100; i += 10) {
            String range = i + "-" + (i + 9);
            Integer count = distribution.get(range);
            res += range + ":" + " *".repeat(count) + '\n';
        }

        res += "100: " + " *".repeat(distribution.get("100"));

        return res;
    }

    private String determineClassAverage() {
        if (gradeList.isEmpty()) {
            return "No grades available.";
        }

        double total = 0;
        int count = 0;

        double max = 0;
        Student maxStudent = null;

        double min = 100;
        Student minStudent = null;

        for (Map.Entry<Student, Double> entry : gradeList.entrySet()) {
            if (max < entry.getValue()){
                max = entry.getValue();
                maxStudent = entry.getKey();
            }
            if (min > entry.getValue()){
                min = entry.getValue();
                minStudent = entry.getKey();
            }

            total += entry.getValue();
            count++;
        }

        double average = total / count;
        return String.format("Class average is: %.2f. Lowest grade is %.2f (%s). Highest grade is %.2f (%s)", average, min, minStudent, max, maxStudent);
    }

    public final void displayGradeReport(){
        System.out.println(outputBarChart());
        System.out.println(determineClassAverage());
    }
    public final void toGrade(){
        Scanner in = new Scanner(System.in);

        for (Map.Entry<Student, Double> entry : gradeList.entrySet()) {
            System.out.print("Student "+ entry.getKey().getName() + ": ");
            double grade = in.nextInt();
            addGrade(entry.getKey(), grade);
        }

        in.close();
    }

    @Override
    public String toString() {
        return "I am a the grade book for " + this.course.getName();
    }
}

package PRACTICE_1;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Tamirlan", 1);

        System.out.printf("%s  %d", s1.getName(), s1.getId());

        System.out.println(s1.toString());
        s1.increaseYearOfStudy();
        System.out.println(s1.toString());

    }
}

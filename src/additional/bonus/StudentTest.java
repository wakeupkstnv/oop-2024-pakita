package additional.bonus;

import additional.bonus.enums.Days;
import additional.bonus.enums.Faculty;
import additional.bonus.enums.Format;
import additional.bonus.enums.LessonType;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Tamir", Faculty.SITE);
        Lesson l1 = new Lesson();

        Lesson math = new Lesson("MATH", Days.TUE, LessonType.LECTURE, new Time(19,30), new Time(20, 50), Format.ONLINE);
        Lesson oop = new Lesson("OOP", Days.TUE, LessonType.LECTURE, new Time(14,30), new Time(1, 30), Format.OFFLINE);
        Lesson algo = new Lesson("ADS", Days.WED, LessonType.LAB, new Time(13,30), new Time(1, 0), Format.ONLINE);
        Lesson db = new Lesson("DB", Days.TUE, LessonType.LECTURE, new Time(14,30), new Time(15, 30), Format.OFFLINE);
        Lesson russian = new Lesson("RUSSIAN", Days.TUE, LessonType.LECTURE, new Time(14,30), new Time(15, 30), Format.OFFLINE);


        s1.addLesson(math);
        s1.addLesson(oop);
        s1.addLesson(algo);
        s1.addLesson(db);
        s1.addLesson(russian);
        System.out.println(s1.listOfLessons());
//        System.out.println(s1.takeListOfLessonByDays(Days.WED));
    }
}

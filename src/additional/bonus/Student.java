package additional.bonus;

import additional.bonus.enums.Days;
import additional.bonus.enums.Faculty;

import java.util.Collections;
import java.util.Vector;

public class Student {
    private final String name;
    private final Faculty facluty;
    private Vector<Lesson> lessons;

    {
        lessons = new Vector<Lesson>();
    }
    public Student(String name, Faculty facluty) {
        this.name = name;
        this.facluty = facluty;
    }

    public String getName(){
      return this.name;
    };

    public Faculty getFacluty(){
        return this.facluty;
    }


    public void addLesson(Lesson lesson) {
        lessons.add(lesson);
        Collections.sort(lessons, (l1, l2) -> {
            int time1 = Time.toMinute(l1.getTime().hour, l1.getTime().min);
            int time2 = Time.toMinute(l2.getTime().hour, l2.getTime().min);
            return Integer.compare(time1, time2);
        });
    }

    public String listOfLessons() {
        String list = "";

        for (Days day : Days.values()) {
            String dayLessons = takeListOfLessonsByDay(day);
            if (!dayLessons.isEmpty()) {
                list += day + ":\n" + dayLessons + "\n\n";
            }
        }
        return list;
    }

    private String takeListOfLessonsByDay(Days day) {
        String list = "";

        for (Lesson lesson : lessons) {

            if (lesson.day == day) {
                list += lesson.toString() + "\n";
            }
        }
        return list;
    }



    @Override
    public String toString() {
        return ""+name + ", "+facluty;
    }
}

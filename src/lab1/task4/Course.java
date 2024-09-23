package lab1.task4;

import additional.bonus.Lesson;

import java.util.Vector;

public class Course {
    private String name;
    private String description;

    private int credit;
    private Vector<Course> prerequisite;

    {
        prerequisite = new Vector<Course>();
    }

    public Course(String name, String description, int credit){
        this.name = name;
        this.description = description;
        this.credit = credit;
    }

    public Course(String name, String description, int credit, Course... prerequisites){
        this(name, description, credit);

        for (Course cur: prerequisites){
            prerequisite.add(cur);
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCredit() {
        return credit;
    }

    @Override
    public String toString() {
        return ""+this.name + " "+this.description + " "+this.credit;
    }
}

package lab1.task5;

import java.util.Vector;

public class DragonLaunch {
    public static Vector<Person> prison = new Vector<Person>();


    public static void kidnap(Person p){
        prison.add(p);
    }

    public static boolean willDragonEatOrNot(){
        if (prison.size() % 2 == 1) return true;

        int boy_count = 0;
        int girl_count = 0;
        int lives = 0;

        for (Person cur: prison){
            if (boy_count > 0 && cur.gender == Gender.G){
                boy_count--;
                lives += 2;
            } else if (boy_count == 0 && cur.gender == Gender.G) {
                girl_count++;
            }

            if (cur.gender == Gender.B){
                boy_count++;
            }
        }

        return prison.size() - lives != 0;
    }
}

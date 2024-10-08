package lab1.task5;

import java.util.Vector;

public class DragonLaunch {
    public static Vector<Person> prison = new Vector<Person>();
    

    public static void kidnap(Person p){
        prison.add(p);
    }

    public static boolean willDragonEatOrNot(){
        if (prison.size() % 2 == 1) return true;

        int boyCount = 0;
        int girlCount = 0;
        int lives = 0;

        for (Person cur: prison){
            if (boyCount > 0 && cur.gender == Gender.G){
                boyCount--;
                lives += 2;
            } else if (boyCount == 0 && cur.gender == Gender.G) {
                girlCount++;
            }

            if (cur.gender == Gender.B){
                boyCount++;
            }
        }

        return prison.size() - lives != 0;
    }
}

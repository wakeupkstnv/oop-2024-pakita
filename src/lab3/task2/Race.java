package lab3.task2;

import java.util.Vector;

public class Race {
    static Vector<Movable> race = new Vector<>();;

    private Race() {}

    static void addRacer(Movable racer){
        race.add(racer);
    }

    static void racing(){
        for (Movable racer: race){
            if (!(racer instanceof Swimmable)){
                racer.move();
                System.out.println("-".repeat(racer.getPosition() - 1) + "*");
            }
        }
    }
}

package lab3.task6;

import lab2.task5.animal.Animal;
import java.util.Comparator;

public class AnimalAgeComaparator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

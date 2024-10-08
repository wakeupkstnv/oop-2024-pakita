package practice3.problem1;

public class Cat extends Animal {
    static final String voice = "Meow-meow";

    public Cat() {
        super();
    }

    public Cat(int age, String name, Gender gender) {
        super(age, name, gender);
    }


    public void addSpeed(int amountOfFeed, int time) {
            int speedIncrease = amountOfFeed >= 3 ? 10 : 1;
        super.speed += speedIncrease * time;
    }

    @Override
    public String move() {
        this.isHungry = true;
        return "Cat is running hihi-haha very cute";
    }

    @Override
    public String toString() {
        return "Cat!\n" + super.toString();
    }
}

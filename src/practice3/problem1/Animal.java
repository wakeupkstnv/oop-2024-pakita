package practice3.problem1;

public abstract class Animal {
    int age;
    String name;
    Gender gender;
    boolean isHappy;
    boolean isHungry;
    int speed;
    public Animal(){
        this.isHappy = true;
        this.speed = 0;
        this.isHungry = false;
    }

    public Animal(int age, String name, Gender gender){
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public abstract String move();

    public void addSpeed(int amountOfFeed){
        this.speed += amountOfFeed >= 3 ? 10 : 1;
    };

    public void addSpeed(double amountOfFeed) {
        this.speed += amountOfFeed >= 3.0 ? 10 : 1;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", isHappy=" + isHappy +
                ", isHungry=" + isHungry +
                ", speed=" + speed +
                '}';
    }
}
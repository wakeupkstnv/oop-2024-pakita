package lab2.task5.animal;

public class Cat extends Animal{
    public Cat(){}

    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public void getSound() {
        System.out.println("meow-meow hihi-haha");
    }

    @Override
    public String toString() {
        return super.toString() + "Cat[]";
    }
}

package lab3.task1;

import java.util.Objects;

/*
 Это абстрактный класс,
 мы используем его чтобы создать
 какой либо шаблон для наследования
 у других обычных классов


 плюсы (преимущество и смысл) абстрактного класса:
    1) он может в себе иметь как и абстрактные так и конкретные методы
    2) создается как шаблон для других классов
*/
public abstract class Animal implements Comparable<Animal>{
    private int age;
    public String name;

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    abstract void sound();

    @Override
    public int compareTo(Animal o) {
        return Integer.compare(this.age, o.getAge());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Animal[" +
                "age=" + age +
                ", name='" + name + '\'' +
                ']';
    }
}

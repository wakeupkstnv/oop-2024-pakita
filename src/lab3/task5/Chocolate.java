package lab3.task5;

public class Chocolate implements Comparable<Chocolate>{
    public String name;
    public int weigth;

    public Chocolate(String name, int weigth){
        this.name = name;
        this.weigth = weigth;
    }

    @Override
    public int compareTo(Chocolate o) {
        return Integer.compare(this.weigth, o.weigth);
    }

    @Override
    public String toString() {
        return "Chocolate[" +
                "name='" + name + '\'' +
                ", weigth=" + weigth +
                ']';
    }
}

package lab3.task1;

import lab3.task2.Movable;
import lab3.task2.Position;

import java.util.Objects;

public abstract class Transport implements Comparable<Transport>, Movable {
    public String model;
    public String name;
    private int avarageSpeed;
    public Position position;

    public Transport(String model, String name, int avarageSpeed){
        this.avarageSpeed = avarageSpeed;
        this.model = model;
        this.name = name;
        this.position = new Position(0, 0);
    }

    public void setAvarageSpeed(int avarageSpeed) {
        this.avarageSpeed = avarageSpeed;
    }

    public int getAvarageSpeed() {
        return avarageSpeed;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;

        Transport t = (Transport) obj;
        return this.avarageSpeed == t.getAvarageSpeed()
                && Objects.equals(this.model, t.model)
                && Objects.equals(this.name, t.name);
    }

    @Override
    public int compareTo(Transport o) {
        return Integer.compare(this.avarageSpeed, o.avarageSpeed);
    }

    @Override
    public String toString() {
        return "Transport[" +
                "avarageSpeed=" + avarageSpeed +
                ']';
    }

}

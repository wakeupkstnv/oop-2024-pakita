package additional.bonus;

public class Room {
    private String name;
    private String floor;
    private int capacity;

    public Room(String name, String floor, int capacity) {
        this.name = name;
        this.floor = floor;
        this.capacity = capacity;
    }

    public String getName(){
        return this.name;
    }

    public String getFloor(){
        return this.floor;
    }

    public int getCapacity(){
        return this.capacity;
    }

//    public static boolean checkRoomCollision(Room a, Room b) {
//        if (a == null || b == null) return false;
//        return a.getName().equals(b.getName());
//    }

    @Override
    public String toString() {
        return "Room name: " + this.name + "\nFloor:" + this.floor + "\nCapacity:" + this.capacity;
    }
//
//    public boolean equals(Room b) {//you have to pass Object here, to be discussed later.
//        //this is our basic version
//        return this.name.equals(b.getName()) && this.floor.equals(b.getFloor());
//    }
}

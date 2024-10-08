package lab1.task2.ninja;

import lab1.task2.Rank;
import lab1.task2.Village;

public class Ninja {
    private static int id;
    private final static String animeName = "Naruto";
    private final String name;
    private final Village village;
    private Rank rank;
    private int aura;
    private boolean isDead = false;

    {
        this.id++;
    }
    public Ninja(String name, Village village){
        this.name = name;
        this.village = village;
    }

    public Ninja(String name, Village village, Rank rank){
        this(name, village);
        this.rank = rank;
    }

    public Ninja(String name, Village village, Rank rank, int aura){
        this(name, village, rank);
        this.aura = aura;
    }

    public String getName() {
        return name;
    }

    public Village getVillage() {
        return village;
    }

    public Rank getRank() {
        return rank;
    }

    private void setAura(int aura) {
        this.aura = aura;
    }

    public int getAura() {
        return aura;
    }

    public final void kill(){
        setAura(0);
        this.isDead = true;
    }

    public final void addAura(int amount){
        this.aura += amount;
    }
    public static String fight(Ninja firstNinja, Ninja secondNinja){
        String theResultOfBattle;

        if (firstNinja.getAura() != secondNinja.getAura()){
            Ninja winner = firstNinja.getAura() > secondNinja.getAura() ? firstNinja : secondNinja;
            Ninja loser = firstNinja.getAura() < secondNinja.getAura() ? firstNinja : secondNinja;
            theResultOfBattle = winner.getName() + " is win " + "+" + secondNinja.getAura() + " aura. " + secondNinja.getName() + " is dead...";
            winner.addAura(loser.getAura());
            loser.kill();
        } else {
            theResultOfBattle = "draw";
        }

        return theResultOfBattle;
    }

    public final String fight(Ninja anotherNinja){
        return fight(this, anotherNinja);
    }

    @Override
    public String toString() {
        return "name: "+this.name + "rank: "+this.rank + "village: "+this.village;
    }
}
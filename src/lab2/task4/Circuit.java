package lab2.task4;
public abstract class Circuit {
    public abstract double getResistance();
    public abstract double getPotentialDiff();
    public abstract void applyPotentialDiff(double V);

    public double getPower() {
        return (getPotentialDiff() * getPotentialDiff()) / getResistance();
    }

    public double getCurrent() {
        return getPotentialDiff() / getResistance();
    }

    @Override
    public String toString() {
        return "Circuit -> Resistance: " + getCurrent() + "-> Potential difference: " + getPotentialDiff();
    }
}
package lab2.task4;

public class Series extends Circuit {
    private Circuit circuit1;
    private Circuit circuit2;

    public Series(Circuit circuit1, Circuit circuit2) {
        this.circuit1 = circuit1;
        this.circuit2 = circuit2;
    }

    @Override
    public double getResistance() {
        return circuit1.getResistance() + circuit2.getResistance();
    }

    @Override
    public void applyPotentialDiff(double V) {
        double totalResistance = getResistance();
        double v1 = V * (circuit1.getResistance() / totalResistance);
        double v2 = V * (circuit2.getResistance() / totalResistance);
        circuit1.applyPotentialDiff(v1);
        circuit2.applyPotentialDiff(v2);
    }

    @Override
    public double getPotentialDiff() {
        return circuit1.getPotentialDiff() + circuit2.getPotentialDiff();
    }
}
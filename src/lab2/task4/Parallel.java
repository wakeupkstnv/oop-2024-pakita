package lab2.task4;

public class Parallel extends Circuit {
    private Circuit circuit1;
    private Circuit circuit2;

    public Parallel(Circuit circuit1, Circuit circuit2) {
        this.circuit1 = circuit1;
        this.circuit2 = circuit2;
    }

    @Override
    public double getResistance() {
        System.out.println("Parallel: расчёт сопротивления");
        double r1 = circuit1.getResistance();
        double r2 = circuit2.getResistance();
        double result = 1 / (1 / r1 + 1 / r2);
        System.out.println("Parallel: общее сопротивление = " + result);
        return result;
    }

    @Override
    public void applyPotentialDiff(double V) {
        System.out.println("Parallel: установка напряжения " + V + "В на обе цепи");
        circuit1.applyPotentialDiff(V);
        circuit2.applyPotentialDiff(V);
    }

    @Override
    public double getPotentialDiff() {
        return circuit1.getPotentialDiff();
    }
}
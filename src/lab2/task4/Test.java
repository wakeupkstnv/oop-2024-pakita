package lab2.task4;

public class Test {
    public static void main(String[] args) {
        Resistor r1 = new Resistor(1);
        Resistor r2 = new Resistor(2);
        Parallel p = new Parallel(r1, r2);
        Resistor r3 = new Resistor(5);
        Resistor r4 = new Resistor(6);
        Parallel p2 = new Parallel(r3, r4);
        Series s = new Series(p, p2);
//        p.applyPotentialDiff(10);
        s.applyPotentialDiff(10);
        System.out.println(s.getPower());
//        System.out.println(p.getPower());
//        System.out.println(p.getCurrent());
    }
}

package lab1;

public class Data {
    private int yearsOld;
    private double height;
    private double weight;

    public Data() {
    }

    public Data(int yearsOld, double height, double weight) {
        setYearsOld(yearsOld);
        setHeight(height);
        setWeight(weight);
    }

    // some service methods
    public final double getAvg(){
        return 0.0;
    }

    // getter
    public final double getHigh(){
        return 0.0;
    }
    public int getYearsOld() {
        return yearsOld;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    // setter
    private void setYearsOld(int yearsOld){
        this.yearsOld = yearsOld;
    }

    private void setHeight(double height){
        this.height = height;
    }

    private void setWeight(double weight){
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "" + getHeight() + " " + getWeight();
    }
}



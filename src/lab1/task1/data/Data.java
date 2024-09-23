package lab1.task1.data;

public class Data {
    private int len;
    private double sum;
    private double max;

    public Data() {
    }

    public final void add(int number){
        this.len++;
        this.sum += number;
        this.max = this.max > number ? this.max : number;
    }

    public final double getAvg(){
        return sum / len;
    }

    public final double getMax(){
        return max;
    }

    @Override
    public String toString(){
        return "Average: " + this.getAvg() + "\nMax: " + this.max;
    }
}



package lab1.task1.data;

public class Data {
    private int len;
    private double sum;
    private double max;

    {
        this.sum = 0;
        this.max = 0;
        this.len = 0;
    }

    public Data() {
    }

    public void add(int number){
        this.len++;
        this.sum += number;
        this.max = this.max > number ? this.max : number;
    }

    public final double getAvg(){
        if (len != 0) {return sum / len;}
        else {return 0.0;}
    }

    public final double getMax(){
        return max;
    }

    @Override
    public String toString(){
        return "Average: " + this.getAvg() + "\nMax: " + this.max;
    }
}



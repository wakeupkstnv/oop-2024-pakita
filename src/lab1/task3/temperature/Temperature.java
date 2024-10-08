package lab1.task3.temperature;

import lab1.task3.Scale;

public class Temperature {
    private Scale scale;
    private double value;

    {
        this.value = 0;
        this.scale = Scale.C;
    }
    public Temperature() {
    }

    public Temperature(double value){
        this.value = value;
    }

    public Temperature(Scale scale){
        this.scale = scale;
    }

    public Temperature(double value, Scale scale){
        this.value = value;
        this.scale = scale;
    }

    public void setCharacter(Scale scale) {
        this.scale = scale;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setTemperature(double value, Scale scale){
        setValue(value);
        setCharacter(scale);
    }

    public Scale getScale() {
        return scale;
    }

    public static double toCelsius(double value){
        return (5 * (value - 32)) / 9;
    }

    public final double toCelsius(){
        return this.scale == Scale.F ? toCelsius(this.value) : this.value;
    }

    public static double toFahrenheit(double value){
        return (9 * (value / 5)) + 32;
    }


    public final double toFahrenheit(){
        return this.scale == Scale.C ? toFahrenheit(this.value) : this.value;
    }

    @Override
    public String toString() {
        return "Scale: "+this.scale + " Value: "+this.value;
    }
}

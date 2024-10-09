package lab2.task1.device;

import java.util.Objects;

public abstract class Device {
    private String brand;
    private String model;
    private boolean isTurnedOn;
    private int bateryLevel;

    private int power;

    public Device(String brand, String model, boolean isTurnedOn, int bateryLevel, int power){
        this.brand = brand;
        this.model = model;
        this.isTurnedOn = isTurnedOn;
        this.bateryLevel = bateryLevel;
        this.power = power;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

    public boolean getTurnedOn(){
        return this.isTurnedOn;
    }

    public void setBateryLevel(int bateryLevel) {
        this.bateryLevel = bateryLevel;
    }

    public int getBateryLevel() {
        return bateryLevel;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public final void turnOff(){
        setTurnedOn(false);
    }

    public final void turnedOn(){
        setTurnedOn(true);
    }

    public abstract void charge();
    public abstract void use();

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Device device = (Device) obj;
        return this.brand.equals(device.brand) && this.model.equals(device.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, isTurnedOn, bateryLevel);
    }

    @Override
    public String toString() {
        return "Device[" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ",+ isTurnedOn=" + isTurnedOn +
                ", bateryLevel=" + bateryLevel +
                ']';
    }
}

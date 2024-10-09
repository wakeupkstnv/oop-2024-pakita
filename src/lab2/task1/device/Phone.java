package lab2.task1.device;

import java.util.Objects;

public class Phone extends Device{
    private int screenWidth, screenHeight;
    public Phone(String brand, String model, boolean isTurnedOn, int bateryLevel, int power, int screenWidth, int screenHeight) {
        super(brand, model, isTurnedOn, bateryLevel, power);
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenHeight(int screenHeight) {
        this.screenHeight = screenHeight;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    @Override
    public void charge() {
        if(super.getTurnedOn()){
            setBateryLevel(Math.min(getBateryLevel() + 5, 100));
        }
    }

    @Override
    public void use() {
        System.out.println("Using phone...");
        System.out.println("-".repeat(this.screenWidth));
        System.out.println("|" + " ".repeat(Math.max(screenWidth - 15, 0)) +
                "#".repeat((int)getBateryLevel() / 10) + "_".repeat(10 - (int) (getBateryLevel() / 10)) + getBateryLevel() + "%|");
        for (int i = 0; i < screenHeight - 1; i++){
            System.out.println("|" + " ".repeat(screenWidth - 2) + "|");
        }
        System.out.println("-".repeat(this.screenWidth));
        setBateryLevel(Math.max(getBateryLevel() - 5, 0));

    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        Phone phone = (Phone) obj;
        return this.screenWidth == phone.getScreenWidth() && this.screenHeight == phone.getScreenHeight();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), screenWidth, screenHeight);
    }

    @Override
    public String toString() {
        return super.toString() + "Phone[" +
                "screenWidth=" + screenWidth +
                ", screenHeight=" + screenHeight +
                ']';
    }
}


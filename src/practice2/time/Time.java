package practice2.time;

public class Time {
    int hour, minute, second;

    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public final String toUniversal(){
        return  (hour < 10 ? "0" + hour : hour) + ":"
                + (minute < 10 ? "0" + minute : minute) + ":"
                + (second < 10 ? "0" + second : second);

    }

    public final String toStandart(){
        return (hour > 10 ? hour - 10 : hour) + ":"
                + (minute < 10 ? "0" + minute : minute) + ":"
                + (second < 10 ? "0" + second : second)
                + (hour < 10 ? " AM" : " PM");
    }
    public final void add(Time time){
        this.hour = time.hour;
        this.minute = time.minute;
        this.second = time.second;
    }
}

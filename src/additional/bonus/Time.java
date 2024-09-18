package additional.bonus;

public class Time {
	int hour;
	int min;

	public Time() {
	}

	public Time(int hour, int min) {
		this.hour = hour;
		this.min = min;
	}

	public String toString() {
		return this.hour + ":" + String.format("%02d", this.min);
	}

	public static int toMinute(int hour, int min){
		return hour * 60 + min;
	}


	public boolean equals(Time b) {
		return this.hour == b.hour && this.min == b.min;
	}
}

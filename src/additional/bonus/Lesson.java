package additional.bonus;
import java.util.Vector;

public class Lesson {
	String name;
	private int id; // read only
	Days day;
	private Time time;
	private Time duration;
	private Room room;
	Format format;
	static int cnt;
	static Vector<Lesson> lessons;
	
	static{
		lessons = new Vector<Lesson>();
	}
	{
		id = cnt++;
		lessons.add(this);
	}
	public Lesson() {
		
	}
	public Lesson(String name, Days day, Time time, Time duration) {
		this.name = name;
		this.day = day;
		this.time = time;
		this.duration = duration;
	}
	public Lesson(String name, Days day, Time time, Time duration, Format format)
	{
		this(name, day, time, duration);
		this.format = format;
	}

	public Lesson(String name, Days day, Time time, Time duration, Format format, Room room)
	{
		this(name, day, time, duration, format);
		this.room = room;
	}

	public int getId() {
		return id;
	}
	public Time getDuration() { return duration; }
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public void setRoom(Room room) { this.room = room; }

	public String toString() {
		return "Lesson "+ name+ ", "+ id + ", "+day + ", "+format + ", "+time + ".";
	}
	public boolean checkCollision(Lesson b) {
		return checkCollision(this,b);
	}
	static boolean checkCollision(Lesson a, Lesson b) {
		int startA = Time.toMinute(a.time.hour, a.time.min);
		int endA = startA + Time.toMinute(a.duration.hour, a.duration.min);

		int startB = Time.toMinute(b.time.hour, b.time.min);
		int endB = startB + Time.toMinute(b.duration.hour, b.duration.min);

		return startA < endB && startB < endA;
	}
}

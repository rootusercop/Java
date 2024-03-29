package general;

public class Clock {
	
	int hour;
	
	int minute;
	
	static final double hourDegree = 360.0/(12);
	static final double hourDegreePerMinute = 360.0/(60*12.0);
	
	static final double minuteDegree = 360.0/(60);
	
	public void setTime(int hour, int min) {
		this.hour = hour%12;
		this.minute = min;
	}
	
	// VB: You should clarify if the interviewer want angle from Minute to Hour hand or vice-versa
	public double angleBetweenClockHands() {	
		return Math.abs((minuteDegree * minute) - ((hourDegree * hour) + (hourDegreePerMinute * minute)));
	}
	
	public String toString() {
		return hour + ":" + minute;
	}
	
	public static void main(String[] args) {
		
		Clock clock = new Clock();
		clock.setTime(12, 25);
		System.out.println("degree between hands at time:" + clock.toString() + " is " + clock.angleBetweenClockHands());
	}
	

}

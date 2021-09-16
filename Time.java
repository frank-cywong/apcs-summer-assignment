public class Time{
	public static void main(String[] args) {
		int hour = 18;
		int minute = 51;
		int second = 52;
		int seconds_since_midnight = (hour * 3600 + minute * 60 + second);
		System.out.println(seconds_since_midnight);
		float percent_of_day = seconds_since_midnight/864.0f;
		System.out.println(percent_of_day + "% of the day has passed.");
		int hour2 = 18;
		int minute2 = 56;
		int second2 = 33;
		int seconds_spent = (hour2 * 3600 + minute2 * 60 + second2 - seconds_since_midnight);
		System.out.println("Time elapsed on this exercise: " + seconds_spent + " seconds.");
	}
}

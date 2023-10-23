//package oopPractice;
//import java.util.*;
//
//class MP3{
//	private String song;
//	void playSong() {
//		System.out.println("song is " + song);
//	}
//}
//
//interface TimeProvider{
//	int getCurrentHour();
//}
//
//class RealTimeProvider implements TimeProvider{
//	public int getCurrentHour() {
//		Calendar calendar = Calendar.getInstance();
//		return calendar.get(Calendar.HOUR_OF_DAY);
//	}
//}
//
//class TestTimeProvider implements TimeProvider{
//	int hour;
//	public TestTimeProvider(int hour) {
//		this.hour = hour;
//	}
//	public int getCurrentHour() {
//		return hour;
//	}
//}
//
//class TimeReminder{
//	private MP3 mp3;
//	TimeProvider timeProvider;
//	
//	public TimeReminder(TimeProvider timeProvider) {
//		this.timeProvider = timeProvider;
//	}
//	public void reminder() {
//		Calendar calendar = Calendar.getInstance();
//		mp3 = new MP3();
//		int hour = calendar.get(Calendar.HOUR_OF_DAY);
//		if(hour >= 22) mp3.playSong();
//	}
//}
//
//public class TimePractice {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		TimeProvider realTimeProvider = new RealTimeProvider();
//		TimeReminder timeReminder = new TimeReminder(realTimeProvider);
//		timeReminder.reminder();
//		
//		TimeProvider testTimeProvider = new TestTimeProvider(22);
//		timeReminder = new TimeReminder(testTimeProvider);
//		timeReminder.reminder();
//		
//	}
//
//}

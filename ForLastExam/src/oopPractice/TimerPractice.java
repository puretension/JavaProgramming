//package oopPractice;
//
//import java.util.*;
//
//class MP3{
//	private int song;
//	void play() {
//		System.out.println("song is " + song);
//	}
//}
//
//interface TimeProvider{
//	int getCurrentHour();
//}
//
//class TimeReminder{
//	private MP3 mp3;
//	TimeProvider timeProvider;
//	
//	public TimeReminder(TimeProvider t) {
//		timeProvider = t;
//		mp3 = new MP3();
//	}
//	
//	public void reminder() {
//		int hour = timeProvider.getCurrentHour();
//		if(hour >= 22) mp3.play();
//	}
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
//	int HourOfDay;
//	TestTimeProvider(int HourOfDay){
//		this.HourOfDay = HourOfDay;
//	}
//	public int getCurrentHour() {
//		return HourOfDay;
//	}
//}
//
//
//public class TimerPractice {
//		    public static void main(String[] args) {
//		        // 실제 시간을 사용하는 경우
//		        TimeProvider realTimeProvider = new RealTimeProvider();
//		        TimeReminder timeReminder = new TimeReminder(realTimeProvider);
//		        timeReminder.reminder();
//		
//		        // 테스트용 시간을 사용하는 경우
//		        TimeProvider testProvider = new TestTimeProvider(22);
//		        timeReminder = new TimeReminder(testProvider);
//		        timeReminder.reminder();
//		    }
//}
//
//

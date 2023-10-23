//import java.util.Calendar;
//
//interface TimeProvider{
//	int getCurrentHour();
//}
//
//
//class MP3 {
//
//    private String name;
//
//    public void playSong() {
//        System.out.println("let's play~" + name);
//    }
//
//}
//
//class RealTimeProvider implements TimeProvider {
//	public int getCurrentHour() {
//		Calendar calendar = Calendar.getInstance();
//		return calendar.get(Calendar.HOUR_OF_DAY);
//	}
//}
//
//class TestTimeProvider implements TimeProvider{
//	private int hour;
//	public int getCurrentHour() {
//		return hour;
//	}
//	public TestTimeProvider(int hour) {
//		this.hour = hour;
//	}
//}
//
//class TimeReminder {
//
//    private MP3 mp3;
//    
//    private TimeProvider timeProvider;
//    
//    public TimeReminder(TimeProvider timeProvider) {
//    	this.timeProvider = timeProvider;
//    }
//
//    public void reminder() {
//        Calendar calendar = Calendar.getInstance();
//        mp3 = new MP3();
//
//        int hour = calendar.get(Calendar.HOUR_OF_DAY);
//
//        if (hour >= 22) {
//            mp3.playSong();
//        }
//    }
//
//}
//
//
//public class timePractice{
//	public static void main(String [] args) {
//		TimeProvider realTimeProvider = new RealTimeProvider();
//		TimeReminder timeReminder = new TimeReminder(realTimeProvider);
//		
//		TimeProvider testTimeProvider = new TestTimeProvider(22);
//		timeReminder = new TimeReminder(testTimeProvider);
//		timeReminder.reminder();
//	}
//}